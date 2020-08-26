package com.hello.springboot;

import com.hello.springboot.dao.StrategyMapper;
import com.hello.springboot.entity.Strategy;
import org.apache.commons.collections.map.HashedMap;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Tuple;
import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@MapperScan("com.hello.springboot.dao")
public class SpringbootApplication {
    @Autowired
    StrategyMapper strategyMapper;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        // DataStreamSource -> StreamExecutionEnvironment -> DataStream
        DataStream<String> data = env.socketTextStream("localhost", 123);
        SingleOutputStreamOperator<Tuple2<String, Map<String, String>>> stream = data.flatMap(new FlatMapFunction<String, Tuple2<String, Map<String, String>>>() {
            @Override
            public void flatMap(String value, Collector<Tuple2<String, Map<String, String>>> out) throws Exception {
                String[] split = value.split(",|--");
                Map<String, String> map = new HashMap<>();
                map.put("qimei", split[0]);
                map.put("imei", split[0]);
            }
        });
    }
}
