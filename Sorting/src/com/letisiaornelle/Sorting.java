package com.letisiaornelle;

import java.util.ArrayList;
import java.util.List;

public class Sorting {

    public static String[] sorting(String[] names){

        String temp;

        for(int i = 0; i<names.length;i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }


            }
        }
        return names;
    }
}
