package com.diseno.ralv.main;

public class main {

    public static void main(String[] args) {

       System.out.println("Hello World");

       double precioNormal = 100.0;
       System.out.println("El precio unitario es " + precioNormal);
        System.out.println("El precio con Iva es: " + getPrecio(100));

    }

    static double getPrecio(double precio){
        double iva = 0.19;
        return precio + (precio * iva);

    }


}


