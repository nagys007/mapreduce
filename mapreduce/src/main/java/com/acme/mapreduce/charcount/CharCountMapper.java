package com.acme.mapreduce.charcount;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
 
public class CharCountMapper extends
        Mapper<Object, Text, Text, IntWritable> {
 
	private final IntWritable ONE = new IntWritable(1);
	private String s = new String();
	private Text t = new Text();
    
	public void map(Object key, Text value, Context context)
            throws IOException, InterruptedException {
		s = value.toString();
		t.set(s); 
    	context.write(t, ONE);
    }
}