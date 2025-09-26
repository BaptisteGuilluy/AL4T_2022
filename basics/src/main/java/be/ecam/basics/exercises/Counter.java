package be.ecam.basics.exercises;

public class Counter {
    public static long count(int start, int steps) {
        long c = (long) start;
        for (int i = 0; i < steps; i++) {
            c++;
        }
        return c;
    }
}
