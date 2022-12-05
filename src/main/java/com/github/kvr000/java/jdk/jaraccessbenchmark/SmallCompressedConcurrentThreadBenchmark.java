package com.github.kvr000.java.jdk.jaraccessbenchmark;

import org.openjdk.jmh.annotations.Threads;

@Threads(Threads.MAX)
public class SmallCompressedConcurrentThreadBenchmark extends BenchmarkBase
{
	@Override
	protected String getFilename()
	{
		return "small.txt";
	}
}
