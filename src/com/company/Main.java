package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            arr1.add(random.nextInt(1,100));
        }
        for (Integer a : arr1) {
            System.out.print(a+" ");
        }
        System.out.println();
        ArrayList<Integer> arrJup = new ArrayList<>();
        ArrayList<Integer> arrTak = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            if (arr1.get(i) % 2 == 0) {
                arrJup.add(arr1.get(i));
            } else {
                arrTak.add(arr1.get(i));
            }
        }
        System.out.print("Jup sandar: ");
        for (Integer b : arrJup) {
            System.out.print(b+" ");
        }
        System.out.println();
        System.out.print("Tak sandar: ");
        for (Integer c : arrTak) {
            System.out.print(c+" ");
        }
    }
}