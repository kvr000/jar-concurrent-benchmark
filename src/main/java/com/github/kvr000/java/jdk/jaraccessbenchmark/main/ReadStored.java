package com.github.kvr000.java.jdk.jaraccessbenchmark.main;

import com.github.kvr000.java.jdk.jaraccessbenchmark.BenchmarkBase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadStored
{
	public static void main(String[] args) throws IOException
	{
		try (InputStream input = BenchmarkBase.class.getResourceAsStream("big.txt.stored")) {
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			input.transferTo(bytes);
		}
	}
}
