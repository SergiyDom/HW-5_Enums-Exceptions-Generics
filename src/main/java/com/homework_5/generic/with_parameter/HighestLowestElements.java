package com.homework_5.generic.with_parameter;

public class HighestLowestElements<T extends Comparable> {
    private T[] arr;

    public HighestLowestElements(T[] arr) {
        this.arr = arr;
    }

    public T higest() {
        T max = arr[0];
        for (T count : arr) {
            if (count.compareTo(max) > 0) {
                max = count;
            }
        }
        return max;
    }

    public T lowest() {
        T min = arr[0];
        for (T count : arr) {
            if (count.compareTo(min) < 0) {
                min = count;
            }
        }
        return min;
    }
}