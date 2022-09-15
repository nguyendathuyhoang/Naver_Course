package com.Likelion_Week42.MiddlewareHome.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry)
    {
        registry.addEndpoint("/ws").withSockJS();
    }
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry)
    {
        // xác định các thư có đích bằng "/app" sẽ được định tuyến đến các phương thức xử lý tin nhắn
        registry.setApplicationDestinationPrefixes("/app");
        // được định tuyến tới MessageBroker (ở đây đang dùng bộ nhớ của  máy)
        // có thể sử dụng Messagebroker  bất kỳ để thay thế  ví dụ RabbitMQ or ActiveMQ
        registry.enableSimpleBroker("/topic");
    }

}
