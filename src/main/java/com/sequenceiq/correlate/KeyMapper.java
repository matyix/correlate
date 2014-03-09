package com.sequenceiq.correlate;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyMapper extends Mapper<LongWritable, Text, Text, SimpleArray> { 

	private static final Logger LOGGER = LoggerFactory.getLogger(KeyMapper.class);

	@Override
	protected void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		LOGGER.info("Mapper invoked. Key {}, Value {}", key, value);
	}

	@Override
	protected void setup(Context context) throws IOException,
			InterruptedException {
		LOGGER.info("Setup ...");
		super.setup(context);
	}

}
