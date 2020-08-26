package com.refrain.producer;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Map;
import java.util.Properties;

public class MyProducer {


    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "hadoop102:9092");
        // ACK 应答级别
        properties.put("acks", "all");
        // 重试次数
        properties.put("retries", 1);
        // 批次大小
        properties.put("batch.size", 16384);
        properties.put("linger.ms", 1);
        // 32Mb 缓冲区大小
        properties.put("buffer.memory", 33554432);
        // key, value 的序列化类
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> kafkaProducer = new KafkaProducer<String, String>(properties);
        for (int i = 0; i < 10; i++) {
            kafkaProducer.send(new ProducerRecord<String, String>("first", "refrain", "num" + i));
        }
        kafkaProducer.close();
    }


}
