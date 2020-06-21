package com.algorithms.sorting;

abstract class BaseSort {
    protected int[] data;
    protected int dataSize;

    public BaseSort(int size) {
        this.data = new int[size];
        this.dataSize = 0;
    }

    abstract void sort();

    protected void swap(int one, int two) {
        int temp = data[one];
        data[one] = data[two];
        data[two] = temp;
    }

    void insert(int value) {
        data[dataSize++] = value;
    }

    void display() {
        for (int datum : data) {
            System.out.print(datum + ", ");
        }
        System.out.println();
    }
}
