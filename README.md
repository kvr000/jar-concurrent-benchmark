# Jar concurrent reading benchmark

## Benchmark

### java 18

```
Benchmark                                             Mode  Cnt      Score   Error  Units
Benchmark                                             Mode  Cnt        Score   Error  Units
BigConcurrentThreadBenchmark.benchmark0File           avgt    2  2778107.688          ns/op
BigConcurrentThreadBenchmark.benchmark1Jar            avgt    2  9110857.536          ns/op
BigConcurrentThreadBenchmark.benchmark2ClassLoader    avgt    2  9066818.055          ns/op
BigConcurrentThreadBenchmark.benchmark3Class          avgt    2  9808151.646          ns/op
BigSingleThreadBenchmark.benchmark0File               avgt    2   548898.579          ns/op
BigSingleThreadBenchmark.benchmark1Jar                avgt    2  4185568.389          ns/op
BigSingleThreadBenchmark.benchmark2ClassLoader        avgt    2  4216698.990          ns/op
BigSingleThreadBenchmark.benchmark3Class              avgt    2  4207363.415          ns/op
SmallConcurrentThreadBenchmark.benchmark0File         avgt    2    16320.965          ns/op
SmallConcurrentThreadBenchmark.benchmark1Jar          avgt    2    55160.566          ns/op
SmallConcurrentThreadBenchmark.benchmark2ClassLoader  avgt    2    59143.758          ns/op
SmallConcurrentThreadBenchmark.benchmark3Class        avgt    2    59195.777          ns/op
SmallSingleThreadBenchmark.benchmark0File             avgt    2     3587.078          ns/op
SmallSingleThreadBenchmark.benchmark1Jar              avgt    2    12310.644          ns/op
SmallSingleThreadBenchmark.benchmark2ClassLoader      avgt    2    14355.110          ns/op
SmallSingleThreadBenchmark.benchmark3Class            avgt    2    13752.501          ns/op
```

### java 20 concurrent-jar

```
Benchmark                                             Mode  Cnt         Score   Error  Units
BigConcurrentThreadBenchmark.benchmark0File           avgt    2   2758291.136          ns/op
BigConcurrentThreadBenchmark.benchmark1Jar            avgt    2   8971559.385          ns/op
BigConcurrentThreadBenchmark.benchmark2ClassLoader    avgt    2   9030112.227          ns/op
BigConcurrentThreadBenchmark.benchmark3Class          avgt    2  12142662.104          ns/op
BigSingleThreadBenchmark.benchmark0File               avgt    2    548602.912          ns/op
BigSingleThreadBenchmark.benchmark1Jar                avgt    2   4286541.032          ns/op
BigSingleThreadBenchmark.benchmark2ClassLoader        avgt    2   4248167.761          ns/op
BigSingleThreadBenchmark.benchmark3Class              avgt    2   4240600.583          ns/op
SmallConcurrentThreadBenchmark.benchmark0File         avgt    2     16525.233          ns/op
SmallConcurrentThreadBenchmark.benchmark1Jar          avgt    2     55324.951          ns/op
SmallConcurrentThreadBenchmark.benchmark2ClassLoader  avgt    2     60034.865          ns/op
SmallConcurrentThreadBenchmark.benchmark3Class        avgt    2     60416.768          ns/op
SmallSingleThreadBenchmark.benchmark0File             avgt    2      3732.314          ns/op
SmallSingleThreadBenchmark.benchmark1Jar              avgt    2     12197.326          ns/op
SmallSingleThreadBenchmark.benchmark2ClassLoader      avgt    2     13427.817          ns/op
SmallSingleThreadBenchmark.benchmark3Class            avgt    2     13725.153          ns/op
```


## License

The code is released under version 2.0 of the [Apache License][].

## Stay in Touch

Feel free to contact me at kvr000@gmail.com or http://kvr.znj.cz/software/java/ and http://github.com/kvr000/

[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
