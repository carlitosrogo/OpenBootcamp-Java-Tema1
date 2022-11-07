package com.company;

import java.io.IOException;

public class Function {

    public static void main(String[] args) throws IOException {

        System.out.println(getIVA(setIVA()));



    }
    public static double setIVA() throws IOException {
        System.out.println("Introduzca el precio");
        double price = System.in.read();
        return price;
    }
    public static double getIVA(double price){
        double iva = price + (price * 0.21);
        return iva;
    }
}
