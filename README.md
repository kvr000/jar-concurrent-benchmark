# Jar concurrent reading benchmark

## Benchmark

### Comparison

<!--- benchmark:table:jarfile:: --->

|Benchmark                                                     |Mode|Units|    java-19|java-20-concurrent|
|:-------------------------------------------------------------|:---|:----|----------:|-----------------:|
|ADummyBenchmark.concurrentThreadDummy                         |avgt|ns/op|    100.016|            99.472|
|ADummyBenchmark.singleThreadDummy                             |avgt|ns/op|     19.362|            18.858|
|BigCompressedConcurrentThreadBenchmark.benchmark0File         |avgt|ns/op| 580215.974|        562705.132|
|BigCompressedConcurrentThreadBenchmark.benchmark1Jar          |avgt|ns/op|6603444.196|       7826348.283|
|BigCompressedConcurrentThreadBenchmark.benchmark2ClassLoader  |avgt|ns/op|6689257.304|       7699798.128|
|BigCompressedConcurrentThreadBenchmark.benchmark3Class        |avgt|ns/op|6781219.475|       7651769.556|
|BigCompressedSingleThreadBenchmark.benchmark0File             |avgt|ns/op| 133296.352|        117692.514|
|BigCompressedSingleThreadBenchmark.benchmark1Jar              |avgt|ns/op|3663408.254|       3647739.927|
|BigCompressedSingleThreadBenchmark.benchmark2ClassLoader      |avgt|ns/op|3512176.285|       3610132.580|
|BigCompressedSingleThreadBenchmark.benchmark3Class            |avgt|ns/op|3511593.512|       3746303.443|
|BigStoredConcurrentThreadBenchmark.benchmark0File             |avgt|ns/op| 653007.627|        681239.193|
|BigStoredConcurrentThreadBenchmark.benchmark1Jar              |avgt|ns/op|2431353.601|        723029.661|
|BigStoredConcurrentThreadBenchmark.benchmark2ClassLoader      |avgt|ns/op|2408401.442|        727717.282|
|BigStoredConcurrentThreadBenchmark.benchmark3Class            |avgt|ns/op|2446006.128|        721781.855|
|BigStoredSingleThreadBenchmark.benchmark0File                 |avgt|ns/op| 125139.272|        118465.422|
|BigStoredSingleThreadBenchmark.benchmark1Jar                  |avgt|ns/op| 130058.340|        127198.459|
|BigStoredSingleThreadBenchmark.benchmark2ClassLoader          |avgt|ns/op| 135862.411|        127680.858|
|BigStoredSingleThreadBenchmark.benchmark3Class                |avgt|ns/op| 134823.531|        127199.391|
|SmallCompressedConcurrentThreadBenchmark.benchmark0File       |avgt|ns/op|  14612.627|         14663.694|
|SmallCompressedConcurrentThreadBenchmark.benchmark1Jar        |avgt|ns/op|  50741.270|         27881.297|
|SmallCompressedConcurrentThreadBenchmark.benchmark2ClassLoader|avgt|ns/op|  55143.149|         31828.180|
|SmallCompressedConcurrentThreadBenchmark.benchmark3Class      |avgt|ns/op|  55676.240|         31970.484|
|SmallCompressedSingleThreadBenchmark.benchmark0File           |avgt|ns/op|   3124.283|          3222.657|
|SmallCompressedSingleThreadBenchmark.benchmark1Jar            |avgt|ns/op|  11782.596|         11727.999|
|SmallCompressedSingleThreadBenchmark.benchmark2ClassLoader    |avgt|ns/op|  14544.403|         12636.343|
|SmallCompressedSingleThreadBenchmark.benchmark3Class          |avgt|ns/op|  13088.850|         13040.278|
|SmallStoredConcurrentThreadBenchmark.benchmark0File           |avgt|ns/op|  14777.011|         14544.189|
|SmallStoredConcurrentThreadBenchmark.benchmark1Jar            |avgt|ns/op|  31033.640|          8955.628|
|SmallStoredConcurrentThreadBenchmark.benchmark2ClassLoader    |avgt|ns/op|  39996.073|         11632.244|
|SmallStoredConcurrentThreadBenchmark.benchmark3Class          |avgt|ns/op|  40065.367|         11725.994|
|SmallStoredSingleThreadBenchmark.benchmark0File               |avgt|ns/op|   3089.126|          3222.512|
|SmallStoredSingleThreadBenchmark.benchmark1Jar                |avgt|ns/op|   2003.920|          1943.909|
|SmallStoredSingleThreadBenchmark.benchmark2ClassLoader        |avgt|ns/op|   3444.489|          3259.750|
|SmallStoredSingleThreadBenchmark.benchmark3Class              |avgt|ns/op|   3673.886|          3327.034|

### java 19

<!-- benchmark:data:jarfile:java-19: --->

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

<!--- benchmark:data:jarfile:java-20-concurrent: --->

```
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
