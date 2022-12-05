package com.github.kvr000.java.jdk.jaraccessbenchmark;

import org.openjdk.jmh.annotations.Threads;

@Threads(Threads.MAX)
public class BigStoredConcurrentThreadBenchmark extends BenchmarkBase
{
	@Override
	protected String getFilename()
	{
		return "big.txt.stored";
	}
}
