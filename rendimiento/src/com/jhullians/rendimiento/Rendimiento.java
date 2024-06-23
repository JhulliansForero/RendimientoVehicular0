package com.jhullians.rendimiento;

import com.jhullians.logica.*;

import java.util.Scanner;

public class Rendimiento {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al rendimiento vehicular");
            System.out.println("Medirá algunas características después de un recorrido");
            System.out.println("Por favor seleccione su marca de auto:");
            System.out.println("1. Ferrari: velocidad máxima 100 km/h");
            System.out.println("2. Lamborghini: velocidad máxima 120 km/h");
            System.out.println("3. Maserati: velocidad máxima 140 km/h");
            System.out.println("4. Ford: velocidad máxima 160 km/h");
            System.out.println("5. Porsche: velocidad máxima 180 km/h");
            System.out.println("6. Salir");
            double velocidadMaxima;
            int opcion = captura.nextInt();
            
            if (opcion == 1) {
                velocidadMaxima = 100;

            } else if (opcion == 2) {
                velocidadMaxima = 120;

            } else if (opcion == 3) {
                velocidadMaxima = 140;

            } else if (opcion == 4) {
                velocidadMaxima = 160;

            } else if (opcion == 5) {
                velocidadMaxima = 180;

            } else if (opcion == 6) {
                continuar = false;

                System.out.println("Hasta luego!");
                break;
            } else {
                System.out.println("Opción inválida, por favor intente de nuevo.");
                continue;
            }

            System.out.println("Ingrese la distancia que recorrió su auto (en km): ");
            double destancia = captura.nextDouble();


            Tiempo tiempo = new Tiempo();
            Gasolina gasolina = new Gasolina();
            Llantas llantas = new Llantas();
            Bateria bateria = new Bateria();
            Aceite aceite = new Aceite();




            double tiempodellegada = tiempo.tiempo(destancia,velocidadMaxima);
            double consumodegas = gasolina.gasolina(destancia, 10);
            double consumodellantas = llantas.llantas(destancia, 100);
            double consumodebateria= bateria.bateria(destancia, 1000);
            double consumodeaceite = aceite.aceite(destancia, 8);

            System.out.println("Datos del recorrido:");
            System.out.printf("Tiempo de recorrido: %.2f horas%n", tiempodellegada);
            System.out.printf("Consumo de gasolina: %.2f%%%n", consumodegas);
            System.out.printf("Desgaste de llantas: %.2f%%%n", consumodellantas);
            System.out.printf("Consumo de la batería: %.2f%%%n", consumodebateria);
            System.out.printf("Consumo de aceite: %.2f%%%n", consumodeaceite);
        }

        captura.close();
    }
}