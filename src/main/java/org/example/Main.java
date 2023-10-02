package org.example;

import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array<String> arr = new Array<String>();
        Scanner scan = new Scanner(System.in);

        arr.addItem(scan.nextLine());
        System.out.println("----");
        arr.addItem(scan.nextLine());

        System.out.println("----");
        arr.addItem(scan.nextLine());

        System.out.println("----");
        arr.addItem(scan.nextLine());

        System.out.println("----");
        arr.addItem(scan.nextLine());

        System.out.println(arr.toString());

//        arr.fillArray(new iRandom<String>() {
//            @Override
//            public String random() {
//                int step = (int)(Math.random()*10 + 5);
//                String str = new String();
//                for (int i = 0; i < step; i++) {
//                    str += (char)(Math.random()*26 + 65);
//                }
//                return str;
//            }
//        });

        System.out.println(arr.toString());

        String max = arr.searchMaxItem(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(max);

        String min = arr.searchMinItem(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(min);

        int medium = arr.searchMedium(new iMedium<String>() {
            @Override
            public int medium(String s) {
                int sum = 0;
                for(int i = 0; i < s.length(); i++) {
                    sum += s.charAt(i);
                }
                return sum/s.length();
            }
        });

        System.out.println(medium);

        arr.sortArray(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(arr.toString());

        arr.sortArray(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(arr.toString());

        String str = scan.nextLine();

        int index = arr.binarySearch(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(index);

    }
}