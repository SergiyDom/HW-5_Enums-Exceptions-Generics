package com.homework_5.generic.with_interface;

import java.util.ArrayList;

public class MyListMod<T extends Comparable> implements Comparable {
    private ArrayList<T> list;

    public MyListMod() {
        list = new ArrayList<>();
    }

    public void add(T numberClass) {
        list.add(numberClass);
    }

    public void print() {
        System.out.print("My list is: ");
        for (T i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sortList() {
        T res;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) < 0) {
                    res = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, res);
                }
            }
        }
        System.out.print("My sort list is: ");
        for (T i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public T largest() {
        T value = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(value) > 0) {
                value = list.get(i);
            }
        }
        return value;
    }

    public T smallest() {
        T value = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(value) < 0) {
                value = list.get(i);
            }
        }
        return value;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
