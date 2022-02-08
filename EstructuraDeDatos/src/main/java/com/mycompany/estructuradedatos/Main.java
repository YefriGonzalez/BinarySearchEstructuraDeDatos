/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradedatos;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *@author LuisMedez
 * @author jose
 * @author MelanniTzul
 * @author YefriGonzalez
 */
public class Main {

    static int[] arreglo;
    static int contador = 0;

    public static void main(String[] args) {
        Scanner pedir = new Scanner(System.in);
        System.out.println("Ingresar el tamaño del arreglo");
        int tamaneo = pedir.nextInt();
        llenar(tamaneo);
        System.out.println("\nIngresa el numero que desas buscar");
        int dato = pedir.nextInt();
        binarySearch(dato);
        System.out.println("pasos: "+contador);
    }

    public static void llenar(int maximo) {
        arreglo = new int[maximo];
        for (int i = 0; i < arreglo.length; i++) {
            int getRandomValue = (int) (Math.random() * (maximo - 0)) + 0;
            arreglo[i] = getRandomValue;
        }
        imprimir();
        ordenar();

    }

    public static void ordenar() {
        Arrays.sort(arreglo);
        System.out.println("");
        imprimir();
    }

    public static void imprimir() {
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
    }

    public static int binarySearch(int dato) {
        int inicio = 0;
        int fin = arreglo.length - 1;
        int pos;
        while (inicio <= fin) {
            pos = (inicio + fin) / 2;
            if (arreglo[pos] == dato) {
                return pos;
            } else if (arreglo[pos] < dato) {
                inicio = pos + 1;
                contador++;
            } else {
                fin = pos - 1;
                contador++;
            }
        }
        return -1;
    }
}
