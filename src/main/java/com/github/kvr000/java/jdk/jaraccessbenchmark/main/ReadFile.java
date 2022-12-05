package com.github.kvr000.java.jdk.jaraccessbenchmark.main;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ReadFile
{
	public static void main(String[] args) throws IOException
	{
		try (InputStream input = Files.newInputStream(Paths.get("src/main/resources/com/github/kvr000/java/jdk/jaraccessbenchmark/" + "big.txt"))) {
			ByteArrayOutputStream bytes = new ByteArrayOutputStream();
			input.transferTo(bytes);
		}
	}
}
