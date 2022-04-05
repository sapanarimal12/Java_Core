package com.javacore;

import  java.util.*;
public class treeSet {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        set.add("Ram");
        set.add("Hari");
        set.add("Anita");

        Iterator<String > itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
