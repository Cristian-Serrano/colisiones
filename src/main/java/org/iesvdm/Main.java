package org.iesvdm;
import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) {
        System.out.println("Calcular el area\n");
        System.out.println("Triangulo (altura 99, base 33.2): "+areaTriangulo(99.00,33.2));
        System.out.println("Hexágono (lado 12.5): "+areaHexagono(12.5));
        System.out.println("Circulo de radio 1: "+circulo(BigDecimal.ONE));
        System.out.println("Pentagono (apotema 1, lado 2) "+pentagono(BigDecimal.ONE,BigDecimal.TWO));
        System.out.println("Cuadrado de lado 3.4: "+areaCuadrado(3.4d));
        System.out.println("Rectangulo (altura 6, base 10) "+areaRectángulo(6,10));
    }

    public static BigDecimal circulo(BigDecimal radio){
        return BigDecimal.valueOf(Math.PI).multiply(radio.pow(2));
    }
    
    public static BigDecimal pentagono(BigDecimal apotema, BigDecimal lado){
        return ((lado.multiply(BigDecimal.valueOf(5))).multiply(apotema)).divide(BigDecimal.TWO);

    public static Double areaTriangulo(Double altura, Double base){
        return (base*altura)/2;
    }

    public static Double areaHexagono(Double lado){
        return ((lado*lado)*3*(Math.sqrt(3))/2);


    }
}