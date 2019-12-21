package by.dev.madhead.shadow_jmh;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.infra.Blackhole;

import java.util.Objects;

public class SimpleBenchmark {
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void init(Blackhole blackhole) {
        blackhole.consume(Objects.hash("String"));
    }
}
