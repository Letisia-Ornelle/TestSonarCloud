package com.letisiaornelle;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String[] names = new String[]{"Letisia , Ornelle, Nguikoo"};

        for(String i : Sorting.sorting(names)){
            System.out.println(i);
        }
    }
}
