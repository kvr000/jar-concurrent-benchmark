package com.github.kvr000.java.jdk.jaraccessbenchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;


/**
 * Per type class file.  Parameterized would be possible but more messy with results.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(Config.FORK_COUNT)
@Warmup(iterations = Config.WARMUP_COUNT, time = Config.WARMUP_TIME, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = Config.MEASURE_COUNT, time = Config.MEASURE_TIME, timeUnit = TimeUnit.SECONDS)
public class ADummyBenchmark
{
	@Benchmark
	@Threads(1)
	public void singleThreadDummy(Blackhole blackhole) throws IOException
	{
		blackhole.consume("Hello " + BenchmarkBase.class.getName() + " world " + ADummyBenchmark.class.getName());
	}

	@Benchmark
	@Threads(Threads.MAX)
	public void concurrentThreadDummy(Blackhole blackhole) throws IOException
	{
		blackhole.consume("Hello " + BenchmarkBase.class.getName() + " world " + ADummyBenchmark.class.getName());
	}

	private void consumeStream(Blackhole blackhole, InputStream stream) throws IOException
	{
		byte[] bytes = new byte[8192];
		while (stream.read(bytes) > 0) {
			// discard
		}
		blackhole.consume(bytes);
	}
}
