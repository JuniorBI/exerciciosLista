// Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // System.in  realiza a leitura do do que é escrito no teclado
        System.out.println("Calculando Vetor de 5 numeros inteiros!\n");

        ArrayList<Integer> array = new ArrayList<Integer>();
        int numero = 5;

        for (int i = 0; i < numero; i++ ) {
            System.out.print("Digite um numero: " + (i+1) + "º Posição: ");
            array.add(scan.nextInt());
        }

        System.out.println("\nArray: ");
        for (Integer number : array) {
            System.out.print(number + "  ");
        }
    }
}
