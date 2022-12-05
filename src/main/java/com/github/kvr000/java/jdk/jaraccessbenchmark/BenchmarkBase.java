package com.github.kvr000.java.jdk.jaraccessbenchmark;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Warmup;
import org.openjdk.jmh.infra.Blackhole;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.jar.JarFile;


/**
 * Per type class file.  Parameterized would be possible but more messy with results.
 */
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(Config.FORK_COUNT)
@Warmup(iterations = Config.WARMUP_COUNT, time = Config.WARMUP_TIME, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = Config.MEASURE_COUNT, time = Config.MEASURE_TIME, timeUnit = TimeUnit.SECONDS)
public abstract class BenchmarkBase
{
	private JarFile jarFile;

	@Setup
	public void setup() throws IOException
	{
		jarFile = new JarFile("target/jar-concurrent-benchmark.jar");
	}

	@TearDown
	public void teardown() throws IOException
	{
		jarFile.close();
	}

	protected abstract String getFilename();

	@Benchmark
	public void benchmark0File(Blackhole blackhole) throws IOException
	{
		try (InputStream input = Files.newInputStream(Paths.get("src/main/resources/com/github/kvr000/java/jdk/jaraccessbenchmark/" + getFilename()))) {
			consumeStream(blackhole, input);
		}
	}

	@Benchmark
	public void benchmark1Jar(Blackhole blackhole) throws IOException
	{
		try (InputStream input = jarFile.getInputStream(jarFile.getEntry("com/github/kvr000/java/jdk/jaraccessbenchmark/" + getFilename()))) {
			consumeStream(blackhole, input);
		}
	}

	@Benchmark
	public void benchmark2ClassLoader(Blackhole blackhole) throws IOException
	{
		try (InputStream input = BenchmarkBase.class.getClassLoader().getResourceAsStream("com/github/kvr000/java/jdk/jaraccessbenchmark/" + getFilename())) {
			consumeStream(blackhole, input);
		}
	}

	@Benchmark
	public void benchmark3Class(Blackhole blackhole) throws IOException
	{
		try (InputStream input = BenchmarkBase.class.getResourceAsStream("" + getFilename())) {
			consumeStream(blackhole, input);
		}
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
