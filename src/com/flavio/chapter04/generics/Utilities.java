package com.flavio.chapter04.generics;

import java.util.List;

public class Utilities {
    public static <T> void fill(List<T> list, T val) {
        for(int i = 0; i < list.size(); i++)
            list.set(i, val);
    }
}
