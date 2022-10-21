package com.pruebaCSV;

public class PruebaCSV {
    public static void main(String[] args) {
        String csv = "1,2,3,4,5,6,7,8,9,10";
        String[] values = csv.split(",");
        for (String value : values) {
            System.out.println(value);
        }
    }
}
