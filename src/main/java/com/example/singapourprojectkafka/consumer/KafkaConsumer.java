package com.example.singapourprojectkafka.consumer;

// Importing required classes
import com.example.singapourprojectkafka.stock.ServiceStock;
import com.example.singapourprojectkafka.stock.Stock;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.tomcat.util.json.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component

// Class
public class KafkaConsumer {
    @Autowired
    private ServiceStock serviceStock;

    @KafkaListener(topics = "production",
            groupId = "group-production", containerFactory = "concurrentKafkaListenerContainerFactory"
    )

    // Method
    public void
    consume_key_value(ConsumerRecord<String, String> record) throws JsonProcessingException, ParseException {

        // Print statement
        System.out.println("key:"+record.key()+" value:"+record.value()+" partition:"+record.partition()+" topic:"+record.topic()+" offset:"+record.offset());

        // Parse string to json
        String str = record.value();
        System.out.println(str);

        // Exemple
        final Gson gson = new GsonBuilder().create();

        final Stock stock = gson.fromJson(record.value(), Stock.class);
        System.out.println(stock);

        // Faire appel à la couche mérier
        serviceStock.majProduction(stock) ;

    }

}

