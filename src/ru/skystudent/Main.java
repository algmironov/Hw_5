package ru.skystudent;

public class Main {

    public static void main(String[] args) {
        // Задание 1

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        float[] numbers2 = {1.57f, 7.654f, 9.986f};

        int[] customNumbers = {2, 34, 45, 0, 0};
        customNumbers[3] = 8;
        int numberEleven = 11;
        customNumbers[4] = numberEleven;

        // Задание 2

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i < numbers2.length; i++) {
            if (i == numbers2.length - 1) {
                System.out.print(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = 0; i < customNumbers.length; i++) {
            if (i == customNumbers.length - 1) {
                System.out.print(customNumbers[i]);
            } else {
                System.out.print(customNumbers[i] + ", ");
            }
        }

        System.out.print("\n");

        // Задание 3


        for (int i = numbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers[i]);
            } else {
                System.out.print(numbers[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = numbers2.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numbers2[i]);
            } else {
                System.out.print(numbers2[i] + ", ");
            }
        }
        System.out.print("\n");

        for (int i = customNumbers.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(customNumbers[i]);
            } else {
                System.out.print(customNumbers[i] + ", ");
            }
        }
        System.out.print("\n");

        // Задание 4

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");
            } else {
                numbers[i] += 1;
                System.out.print(numbers[i] + ", ");
            }


        }
    }
}