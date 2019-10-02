package com.ajc.main;

import com.ajc.model.City;

public class Main {

    public static void main(String[] arg)
    {
        City tokyo = new City("Tokyo", "Japon", 35, true);
        City hokkaido = new City("Hokkaido", "Japon", 5, false);

        System.out.println(tokyo.makeCompare(tokyo));

    }

}
