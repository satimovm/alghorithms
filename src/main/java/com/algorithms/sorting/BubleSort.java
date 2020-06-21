package com.algorithms.sorting;

public class BubleSort extends BaseSort {

    public BubleSort(int size) {
        super(size);
    }

    void sort() {
        for (int out = dataSize - 1; out > 1; out--) {
            for (int inner = 0; inner < out; inner++) {
                if (data[inner] > data[inner + 1]) {
                    swap(inner, inner + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        BubleSort bubleSort = new BubleSort(10);

        bubleSort.insert(7);
        bubleSort.insert(1);
        bubleSort.insert(5);
        bubleSort.insert(3);
        bubleSort.insert(2);
        bubleSort.insert(6);
        bubleSort.insert(8);
        bubleSort.insert(4);
        bubleSort.insert(9);
        bubleSort.insert(10);
        bubleSort.display();
        bubleSort.sort();
        bubleSort.display();
    }
}
