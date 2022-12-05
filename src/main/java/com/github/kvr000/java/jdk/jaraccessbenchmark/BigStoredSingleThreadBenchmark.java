package com.github.kvr000.java.jdk.jaraccessbenchmark;

import org.openjdk.jmh.annotations.Threads;

@Threads(1)
public class BigStoredSingleThreadBenchmark extends BenchmarkBase
{
	@Override
	protected String getFilename()
	{
		return "big.txt.stored";
	}
}
