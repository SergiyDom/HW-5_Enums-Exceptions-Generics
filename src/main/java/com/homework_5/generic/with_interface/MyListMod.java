package com.homework_5.generic.with_interface;

import com.homework_5.generic.interfaces.Addable;

import java.util.ArrayList;

//public class MyListMod<T extends Comparable> implements Comparable {
//public class MyL <T> implements Comparable<MyL<T>> {
public class MyListMod<T extends Comparable> implements Addable<T> {
    //public class MyL <T extends Comparable<T>>{
    private ArrayList<T> list;

    public MyListMod() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        list.add(item);
    }

    public void print(String text) {
        System.out.print("My " + text + " is: ");
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
    }

    public T getLargest() {
        T value = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(value) > 0) {
                value = list.get(i);
            }
        }
        return value;
    }

    public T getSmallest() {
        T value = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(value) < 0) {
                value = list.get(i);
            }
        }
        return value;
    }
}
