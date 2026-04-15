package com.example;

public class Day2Practice {
    public static void main(String[] args) {
        String name = "Leah";
        int age = 33;
        double price = 99.9;
        boolean isStudent = false;
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("price = " + price);
        System.out.println("isStudent = " + isStudent);
        int result = 10 + 20 * 3;
        System.out.println("result = " + result);
        System.out.println("age >= 18 ? " + (age >= 18));
        int number = 15;
        if (number > 0) {
            System.out.println("正数");
        } else if (number == 0) {
            System.out.println("零");
        } else {
            System.out.println("负数");
        }

        int score = 85;
        if (score >= 90) {
            System.out.println("优秀");
        } else if (score >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }

        int a = 10;
        double b = a;
        System.out.println("b = " + b);
        double c = 12.8;
        int d = (int) c;
        System.out.println("d = " + d);
        int x = 5;
        System.out.println("x++ = " + x++);
        System.out.println("x = " + x);
        int y = 5;
        System.out.println("++y = " + ++y);
        System.out.println("y = " + y);
        int age2 = 32;
        if (age2 >= 18 && age2 <= 60) {
            System.out.println("年龄在18~60之间");
        }
        String title = "Java";
        if (title != null && title.length() > 0) {
            System.out.println("字符串不为空");
        }
        if (7/2 == 3) {
            System.out.println("7 / 2 = " + 7 / 2);
        }
        int score2 = 85;
        if (score2 >= 90) {
            System.out.println("优秀");
        } else if (score2 >= 80) {
            System.out.println("良好");
        } else if (score2 >= 60) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            default:
                System.out.println("其他");
                break;
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("for i = " + i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
        int n = 10;
        while (n >= 1) {
            System.out.println("while n = " + n);
            n--;
        }
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("奇数：" + i);
            }
        }
        int number2 = 8;
        if (number2 % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("偶数：" + i);
            }
        }
        int sum100 = 0;
        for (int i = 1; i <= 100; i++) {
            sum100 += i;
        }
        System.out.println("sum100 = " + sum100);
        int oddCount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("oddCount = " + oddCount);
        int n2 = 5;
        int factorial = 1;
        while (n2 >= 1) {
            factorial *= n2;
            n2--;
        }
        System.out.println("5! = " + factorial);
        int year = 2024;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("闰年");
        } else {
            System.out.println("平年");
        }
        int q = 1, w = 2, e = 3;
        int max = q;
        if (max < w) {
            max = w;
        }
        if (max < e) {
            max = e;
        }
        System.out.println("1, 2, 3中, 最大数：" + max);

        int day2 = 1;
        switch (day2) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期天");
                break;
            default:
                System.out.println("其他");
                break;
        }

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + j*i + "\t");
            }
            System.out.println();
        }
    }
}
