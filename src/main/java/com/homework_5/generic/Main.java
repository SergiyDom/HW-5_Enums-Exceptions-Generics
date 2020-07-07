package com.homework_5.generic;

import com.homework_5.generic.with_class.MyList;
import com.homework_5.generic.with_interface.MyListMod;
import com.homework_5.generic.with_parameter.HighestLowestElements;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> listNumb = new MyList<>();
        for (int i = 0; i < 10; i++) {
            listNumb.add((int) (Math.random() * 10 + i));
        }
        listNumb.print();
        listNumb.sortList();
        listNumb.printList(true);
        listNumb.printList(false);
        System.out.println("largest is: " + listNumb.largest());
        System.out.println("smallest si: " + listNumb.smallest());

        MyListMod<Integer> listNumbMod = new MyListMod<>();
        for (int i = 0; i < 10; i++) {
            listNumbMod.add((int) (Math.random() * 10 + i));
        }
        listNumbMod.print();
        listNumbMod.sortList();
        System.out.println("largest is: " + listNumbMod.largest());
        System.out.println("smallest si: " + listNumbMod.smallest());

        MyListMod<String> listStr = new MyListMod<>();
        listStr.add("Aa");
        listStr.add("Cc");
        listStr.add("Bb");
        listStr.add("Dd");
        listStr.print();
        listStr.sortList();
        System.out.println("largest is: " + listStr.largest());
        System.out.println("smallest si: " + listStr.smallest());

        HighestLowestElements<Integer> intArr = new HighestLowestElements<>(
                new Integer[]{5, 2, 9, 6, 5, 4, 2, 6});
        System.out.println("Highest value is:" + intArr.higest());
        System.out.println("Lowest value is:" + intArr.lowest());
    }
}