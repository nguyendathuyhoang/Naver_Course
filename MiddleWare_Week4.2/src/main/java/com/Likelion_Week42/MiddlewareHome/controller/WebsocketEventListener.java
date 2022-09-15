package com.Likelion_Week42.MiddlewareHome.controller;

import com.Likelion_Week42.MiddlewareHome.model.ChatMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectedEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;


@Component
public class WebsocketEventListener {
    private static final Logger logger = LoggerFactory.getLogger(WebsocketEventListener.class);

    @Autowired
    private SimpMessageSendingOperations messagingTemplate;

    // Sự kiện SessionConectedEvent dùng tham gia trong phương thức addUser() được xác định bên trong ChatController
    @EventListener
    public void handleWebSocketConnectListener(SessionConnectedEvent event)
    {
        logger.info("Receive a new web socket connection");
    }
    // Sự kiện SessionDisconnect, trích xuất tên người dùng từ websocket session
    // và phát sóng sự kiện người dùng rời khỏi cho tất cả các khách hàng được kết nối
    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event)
    {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username = (String) headerAccessor.getSessionAttributes().get("username");
        if(username!=null)
        {
            logger.info("User disconnect: "+username);
            ChatMessage chatMessage = new ChatMessage();
            chatMessage.setType(ChatMessage.MessageType.LEAVE);
            chatMessage.setSender(username);
            messagingTemplate.convertAndSend("/topic/public", chatMessage);
        }
    }
}
