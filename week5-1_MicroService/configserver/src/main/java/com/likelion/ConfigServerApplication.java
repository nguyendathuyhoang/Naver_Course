package com.likelion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication
{
    public static void main( String[] args )
    {

        //System.out.println( "Hello World!" );
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
