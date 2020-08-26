package com.HadoopTest;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class WordCountMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {

        // 获取一行
        // value为输入的<K, V> 中的V
        String line = value.toString();
        String[] words = line.split(" ");
        for (String word : words) {
            Text k = new Text();
            k.set(word);

            IntWritable v = new IntWritable();
            v.set(1);
            context.write(k, v);
        }
    }
}
