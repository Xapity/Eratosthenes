/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eratosthenes;

import java.util.*;

/**
 *
 * @author camac2045
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //delcare boolean array
        boolean numbers[] = new boolean[1001];
        Arrays.fill(numbers, true);
        //0 and 1 aernt prime numbers
        numbers[0] = numbers[1] = false;
        //test of numbers that are primes
        for (int x = 2; x <= 1000; x++) {
            if (numbers[x]) {
                for (int y = x * x; y < numbers.length; y += x) {
                    numbers[y] = false;
                }

            }
        }
        //printing in the correct manner
        System.out.println("The prime numbers from 1-1000 are:");
        int println = 0;
        for (int t = 0; t < numbers.length; t++) {
            if (numbers[t] && println < 10) {
                System.out.print(t + " ");
                println++;
            } else if (println == 10 && numbers[t]) {
                System.out.print("\n" + t + " ");
                println = 0;
            }
        }
    }
}
