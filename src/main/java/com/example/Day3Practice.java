package com.example;

public class Day3Practice {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("第一个元素 = " + numbers[0]);
        System.out.println("最后一个元素 = " + numbers[numbers.length - 1]);
        System.out.println("数组长度 = " + numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("add = " + add(3, 5));
        System.out.println("max = " + max(10, 8));
        System.out.println("isEven(4) = " + isEven(4));
        System.out.println("isEven(7) = " + isEven(7));

        System.out.println("sumArray = " + sumArray(numbers));
        System.out.println("maxInArray = " + maxInArray(numbers));
        System.out.println("average = " + average(numbers));
        System.out.println("contains(3) = " + contains(numbers, 3));
        System.out.println("contains(9) = " + contains(numbers, 9));
        System.out.println("countEven = " + countEven(numbers));

        System.out.println("min = " + min(10, 8));
        int[] reversed = reverserArray(numbers);
        for (int i = 0; i < reversed.length; i++) {
            System.out.println("reversed[" + i + "] = " + reversed[i]);
        }
        System.out.println("add(1,2,3) = " + add(1, 2, 3));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int maxInArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static double average(int[] arr) {
        int sum = sumArray(arr);
        return (double) sum / arr.length;
    }

    public static boolean contains(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int[] reverserArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }
}
