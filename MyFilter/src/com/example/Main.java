package com.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Object[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        MyFilter multiplyBy6 = new MyFilter() {
            @Override
            public Object apply(Object o) {
                if (o instanceof Number) {
                    return ((Number) o).intValue() * 6;
                }
                return o;
            }
        };

        Object[] filteredArray = ArrayFilter.applyFilter(numbers, multiplyBy6);

        System.out.println("Test Multiply By 6:");
        for (Object num : filteredArray) {
            System.out.println(num);
        }
    }
}