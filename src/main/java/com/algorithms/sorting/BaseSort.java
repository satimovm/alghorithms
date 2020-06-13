package com.algorithms.sorting;

abstract class BaseSort {
    protected int[] data;

    public BaseSort(int size) {
        this.data = new int[size];
    }

    abstract void sort();

    void insert(int a) {

    }

    void display() {
        for (int datum : data) {
            System.out.print(datum + ", ");
        }
        System.out.println();
    }
}
