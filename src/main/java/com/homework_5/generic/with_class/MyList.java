package com.homework_5.generic.with_class;

import com.homework_5.generic.interfaces.Addable;

import java.util.ArrayList;

public class MyList<T extends Number> implements Addable<T> {
    private ArrayList<T> list;

    public MyList() {
        list = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        list.add(item);

    }

    public void print() {
        System.out.print("My list is: ");
        for (T i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void sortList() {
        T value;
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i).doubleValue() > list.get(j).doubleValue()) {
                    value = list.get(j);
                    list.set(j, list.get(i));
                    list.set(i, value);
                }
            }
        }
        System.out.print("My sort list is: ");
        for (T i : list) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public T detLargest() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() > value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }

    public T getSmallest() {
        T value = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).doubleValue() < value.doubleValue()) {
                value = list.get(i);
            }
        }
        return value;
    }

    public void printList(boolean isOdd) {
        int size = list.size();
        if (isOdd) {
            System.out.print("My odd position is: ");
            for (int i = 1; i < size; i += 2) {
                System.out.print(list.get(i).toString() + " ");
            }
            System.out.println();
        } else {
            System.out.print("My even position is: ");
            for (int i = 0; i < size; i += 2) {
                System.out.print(list.get(i).toString() + " ");
            }
            System.out.println();
        }
    }
}