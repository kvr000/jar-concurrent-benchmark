# Jar concurrent reading benchmark

## Benchmark

### java 19

```
Benchmark                                                       Mode  Cnt        Score   Error  Units
ADummyBenchmark.concurrentThreadDummy                           avgt    2      100.016          ns/op
ADummyBenchmark.singleThreadDummy                               avgt    2       19.362          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark0File           avgt    2   580215.974          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark1Jar            avgt    2  6603444.196          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark2ClassLoader    avgt    2  6689257.304          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark3Class          avgt    2  6781219.475          ns/op
BigCompressedSingleThreadBenchmark.benchmark0File               avgt    2   133296.352          ns/op
BigCompressedSingleThreadBenchmark.benchmark1Jar                avgt    2  3663408.254          ns/op
BigCompressedSingleThreadBenchmark.benchmark2ClassLoader        avgt    2  3512176.285          ns/op
BigCompressedSingleThreadBenchmark.benchmark3Class              avgt    2  3511593.512          ns/op
BigStoredConcurrentThreadBenchmark.benchmark0File               avgt    2   653007.627          ns/op
BigStoredConcurrentThreadBenchmark.benchmark1Jar                avgt    2  2431353.601          ns/op
BigStoredConcurrentThreadBenchmark.benchmark2ClassLoader        avgt    2  2408401.442          ns/op
BigStoredConcurrentThreadBenchmark.benchmark3Class              avgt    2  2446006.128          ns/op
BigStoredSingleThreadBenchmark.benchmark0File                   avgt    2   125139.272          ns/op
BigStoredSingleThreadBenchmark.benchmark1Jar                    avgt    2   130058.340          ns/op
BigStoredSingleThreadBenchmark.benchmark2ClassLoader            avgt    2   135862.411          ns/op
BigStoredSingleThreadBenchmark.benchmark3Class                  avgt    2   134823.531          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark0File         avgt    2    14612.627          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark1Jar          avgt    2    50741.270          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark2ClassLoader  avgt    2    55143.149          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark3Class        avgt    2    55676.240          ns/op
SmallCompressedSingleThreadBenchmark.benchmark0File             avgt    2     3124.283          ns/op
SmallCompressedSingleThreadBenchmark.benchmark1Jar              avgt    2    11782.596          ns/op
SmallCompressedSingleThreadBenchmark.benchmark2ClassLoader      avgt    2    14544.403          ns/op
SmallCompressedSingleThreadBenchmark.benchmark3Class            avgt    2    13088.850          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark0File             avgt    2    14777.011          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark1Jar              avgt    2    31033.640          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark2ClassLoader      avgt    2    39996.073          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark3Class            avgt    2    40065.367          ns/op
SmallStoredSingleThreadBenchmark.benchmark0File                 avgt    2     3089.126          ns/op
SmallStoredSingleThreadBenchmark.benchmark1Jar                  avgt    2     2003.920          ns/op
SmallStoredSingleThreadBenchmark.benchmark2ClassLoader          avgt    2     3444.489          ns/op
SmallStoredSingleThreadBenchmark.benchmark3Class                avgt    2     3673.886          ns/op
```

### java 20 concurrent-jar with applied parallel-zip patch

```
Benchmark                                                       Mode  Cnt        Score   Error  Units
Benchmark                                                       Mode  Cnt        Score   Error  Units
ADummyBenchmark.concurrentThreadDummy                           avgt    2       99.472          ns/op
ADummyBenchmark.singleThreadDummy                               avgt    2       18.858          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark0File           avgt    2   562705.132          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark1Jar            avgt    2  7826348.283          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark2ClassLoader    avgt    2  7699798.128          ns/op
BigCompressedConcurrentThreadBenchmark.benchmark3Class          avgt    2  7651769.556          ns/op
BigCompressedSingleThreadBenchmark.benchmark0File               avgt    2   117692.514          ns/op
BigCompressedSingleThreadBenchmark.benchmark1Jar                avgt    2  3647739.927          ns/op
BigCompressedSingleThreadBenchmark.benchmark2ClassLoader        avgt    2  3610132.580          ns/op
BigCompressedSingleThreadBenchmark.benchmark3Class              avgt    2  3746303.443          ns/op
BigStoredConcurrentThreadBenchmark.benchmark0File               avgt    2   681239.193          ns/op
BigStoredConcurrentThreadBenchmark.benchmark1Jar                avgt    2   723029.661          ns/op
BigStoredConcurrentThreadBenchmark.benchmark2ClassLoader        avgt    2   727717.282          ns/op
BigStoredConcurrentThreadBenchmark.benchmark3Class              avgt    2   721781.855          ns/op
BigStoredSingleThreadBenchmark.benchmark0File                   avgt    2   118465.422          ns/op
BigStoredSingleThreadBenchmark.benchmark1Jar                    avgt    2   127198.459          ns/op
BigStoredSingleThreadBenchmark.benchmark2ClassLoader            avgt    2   127680.858          ns/op
BigStoredSingleThreadBenchmark.benchmark3Class                  avgt    2   127199.391          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark0File         avgt    2    14663.694          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark1Jar          avgt    2    27881.297          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark2ClassLoader  avgt    2    31828.180          ns/op
SmallCompressedConcurrentThreadBenchmark.benchmark3Class        avgt    2    31970.484          ns/op
SmallCompressedSingleThreadBenchmark.benchmark0File             avgt    2     3222.657          ns/op
SmallCompressedSingleThreadBenchmark.benchmark1Jar              avgt    2    11727.999          ns/op
SmallCompressedSingleThreadBenchmark.benchmark2ClassLoader      avgt    2    12636.343          ns/op
SmallCompressedSingleThreadBenchmark.benchmark3Class            avgt    2    13040.278          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark0File             avgt    2    14544.189          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark1Jar              avgt    2     8955.628          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark2ClassLoader      avgt    2    11632.244          ns/op
SmallStoredConcurrentThreadBenchmark.benchmark3Class            avgt    2    11725.994          ns/op
SmallStoredSingleThreadBenchmark.benchmark0File                 avgt    2     3222.512          ns/op
SmallStoredSingleThreadBenchmark.benchmark1Jar                  avgt    2     1943.909          ns/op
SmallStoredSingleThreadBenchmark.benchmark2ClassLoader          avgt    2     3259.750          ns/op
SmallStoredSingleThreadBenchmark.benchmark3Class                avgt    2     3327.034          ns/op
```


## License

The code is released under version 2.0 of the [Apache License][].

## Stay in Touch

Feel free to contact me at kvr000@gmail.com or http://kvr.znj.cz/software/java/ and http://github.com/kvr000/

[Apache License]: http://www.apache.org/licenses/LICENSE-2.0
