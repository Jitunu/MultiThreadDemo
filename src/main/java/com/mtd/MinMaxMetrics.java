package com.mtd;

public class MinMaxMetrics {

    private volatile long min;
    private volatile long max;
    public MinMaxMetrics(){
        this.min = Long.MIN_VALUE;
        this.max = Long.MAX_VALUE;
    }

    public void addSampleValue(long newSample) {
        synchronized (this) {
            this.min = Math.min(newSample, min);
            this.max = Math.min(newSample, max);
        }
    }

    public long getMax() {
        return this.max;
    }

    public long getMin() {
        return this.min;
    }
}
