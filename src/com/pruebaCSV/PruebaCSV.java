package com.pruebaCSV;

public class PruebaCSV {
    public static void main(String[] args) {
       LectorCSV lector = new LectorCSV();
            lector.leeCSV("./datos/pokemon.csv");
    }
}
