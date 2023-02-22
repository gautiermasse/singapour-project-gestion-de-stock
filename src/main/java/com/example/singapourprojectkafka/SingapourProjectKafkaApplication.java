package com.example.singapourprojectkafka;

import com.example.singapourprojectkafka.config.KafkaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SingapourProjectKafkaApplication {

    public static void main(String[] args) {

        SpringApplication.run(SingapourProjectKafkaApplication.class, args);

        KafkaConfig kak = new KafkaConfig();
        kak.concurrentKafkaListenerContainerFactory();

    }

}
