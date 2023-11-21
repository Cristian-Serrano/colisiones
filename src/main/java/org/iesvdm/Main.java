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
}