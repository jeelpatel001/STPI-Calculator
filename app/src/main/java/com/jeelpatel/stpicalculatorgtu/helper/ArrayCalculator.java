package com.jeelpatel.stpicalculatorgtu.helper;

import java.util.ArrayList;

public class ArrayCalculator {
    private ArrayList<Integer> items;
    private int sum;

    public ArrayCalculator() {
        items = new ArrayList<Integer>();
        sum = 0;
    }

    public void addItem(int item) {
        items.add(item);
        sum = 0;
        for (int i = 0; i < items.size(); i++) {
            sum += items.get(i);
        }
    }

    public int getSum() {
        return sum;
    }
}
