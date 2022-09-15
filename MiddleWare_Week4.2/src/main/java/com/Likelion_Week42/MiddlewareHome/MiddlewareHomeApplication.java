package com.Likelion_Week42.MiddlewareHome;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class MiddlewareHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiddlewareHomeApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate)
//	{
//		return args -> {
//			kafkaTemplate.send("likelion","Hello kafka");
//		};
//	}

//	@Bean
//	CommandLineRunner commandLineRunner(RedisTemplate<Object, Object> redisTemplate)
//	{
//		return args -> {
//			// set giá trị của key "likelion" là "hello redis"
//			redisTemplate.opsForValue().set("likelion","hello redis");
//			//in ra giá trị của key "likelion" trong redis
//			System.out.println("Value of key likelion: "+redisTemplate.opsForValue().get("likelion"));
//		};
//	}

		@Bean
		CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate)
		{
			return args -> {
				listExample();
			};
		}

		@Autowired
		private RedisTemplate template;
		public void listExample()
		{
			// Tạo một list gồm 2 phần tử
			List<String > list = new ArrayList<>();
			list.add("Hello");
			list.add("Redis Hoang");

			// set giá trị có key likelion_list
			template.opsForList().rightPushAll("likelion_list", list);

			System.out.println("Size of key likelion: "+template.opsForList().size("likelion_list"));
		}

}
