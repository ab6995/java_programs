package com.ashish;

public class Main {

    public static void main(String[] args) {
        for (int i = 2; i < 9; i++) {
            System.out.println("1000 at " + i + "% interest" + calculateinterest(10000, i));
        }
        System.out.println("*********************");
        for (int i = 8; i > 1; i--) {
            System.out.println("1000 at " + i + "% interest" + calculateinterest(10000, i));
        }
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isprime(i)) {
                count++;
                System.out.println("numbe" + i + "is prime number");
                if (count == 3) {
                    System.out.println("exiting the loop");
                    break;
                }
            }
        }

    }

    public static double calculateinterest(double amount, double interestrate) {
        return ((amount * interestrate) / 100);

    }

    public static boolean isprime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }

    }

