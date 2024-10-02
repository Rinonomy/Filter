package com.example;

import java.lang.reflect.Array;

public class ArrayFilter {
    public static Object[] applyFilter(Object[] array, MyFilter filter) {
        Object[] result = (Object[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }
}
