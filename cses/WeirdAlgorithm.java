package cses;

import java.util.Scanner;

public class WeirdAlgorithm {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            weirdAlgorithmSol(n);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void weirdAlgorithmSol(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        }
        if (n % 2 == 0) {
            weirdAlgorithmSol(n / 2);
        } else {
            weirdAlgorithmSol((n * 3) + 1);
        }

    }
}
