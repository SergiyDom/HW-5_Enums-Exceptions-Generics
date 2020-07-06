package com.homework_5.task_1;

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
    }
}