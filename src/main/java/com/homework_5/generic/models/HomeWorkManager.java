package com.homework_5.generic.models;

import com.homework_5.generic.interfaces.Addable;
import com.homework_5.generic.with_class.MyList;
import com.homework_5.generic.with_interface.MyListMod;
import com.homework_5.generic.with_parameter.HighestLowestElements;

public class HomeWorkManager {
    public void manage() {
        this.manageGenericWithClass();
        this.manageGenericWithInterface();
        this.manageGenericWithParameter();
    }

    private void compileList(Addable list) {
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10 + i));
        }
    }

    private void manageGenericWithClass() {
        MyList<Integer> listNumb = new MyList<>();
        this.compileList(listNumb);
        listNumb.print();
        listNumb.sortList();
        listNumb.print();
        listNumb.printList(true);
        listNumb.printList(false);
        System.out.println("detLargest is: " + listNumb.detLargest());
        System.out.println("getSmallest si: " + listNumb.getSmallest());
    }

    private void manageGenericWithInterface() {
        MyListMod<Integer> listNumbMod = new MyListMod<>();
        this.compileList(listNumbMod);
        listNumbMod.print("list");
        listNumbMod.sortList();
        listNumbMod.print("sorted list");
        System.out.println("detLargest is: " + listNumbMod.getLargest());
        System.out.println("getSmallest si: " + listNumbMod.getSmallest());

        MyListMod<String> listStr = new MyListMod<>();
        listStr.add("Aa");
        listStr.add("Cc");
        listStr.add("Bb");
        listStr.add("Dd");
        listStr.print("list");
        listStr.sortList();
        listNumbMod.print("sorted list");
        System.out.println("detLargest is: " + listStr.getLargest());
        System.out.println("getSmallest si: " + listStr.getSmallest());
    }

    private void manageGenericWithParameter() {
        HighestLowestElements<Integer> intArr = new HighestLowestElements<>(
                new Integer[]{5, 2, 9, 6, 5, 4, 2, 6});
        System.out.println("Highest value is:" + intArr.getHighest());
        System.out.println("Lowest value is:" + intArr.getLowest());
    }
}
