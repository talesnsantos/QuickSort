/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Scanner;

/**
 *
 * @author tales
 */
public class modelo {

    public void selecao() {

        Scanner scan = new Scanner(System.in);

        int i, count, x = 1;

        System.out.println("Quantos numeros ira digitar ");
        count = scan.nextInt();
        int[] num = new int[count];

        for (i = 0; i < count; i++, x++) {
            System.out.println("digite o " + x + " elemento");
            num[i] = scan.nextInt();
        }

        quicksort(num, 0, count - 1);

        System.out.println("os numeros ordenados são");
        for (i = 0; i < count; i++) {
            System.out.println(num[i]);
        }

    }

    public void quicksort(int[] number, int first, int last) {
        int i, j, pivot, temp;

        if (first < last) {
            pivot = first;
            i = first;
            j = last;

            while (i < j) {
                while (number[i] <= number[pivot] && i < last) {
                    i++;
                }
                while (number[j] > number[pivot]) {
                    j--;
                }
                if (i < j) {
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
            }

            temp = number[pivot];
            number[pivot] = number[j];
            number[j] = temp;
            quicksort(number, first, j - 1);
            quicksort(number, j + 1, last);

        }
    }
}
