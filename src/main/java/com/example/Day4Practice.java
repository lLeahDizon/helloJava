package com.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Day4Practice {
    public static void main(String[] args) {
        String text = "  Java Backend Learning  ";

        System.out.println("原始: [" + text + "]");
        System.out.println("trim: [" + text.trim() + "]");
        System.out.println("length: " + text.length());
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("contains(\"Backend\"): " + text.contains("Backend"));
        System.out.println("startsWith(\"  Java\"): " + text.startsWith("  Java"));
        System.out.println("substring(2, 6): " + text.substring(2, 6));

        String a = "Java";
        String b = "Java";
        String c = new String("Java");

        System.out.println("a == b: " + (a == b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a.equals(c): " + a.equals(c));

        StringBuilder sb = new StringBuilder();
        sb.append("Day4").append("-").append("StringBuilder").append("-").append(2026);
        System.out.println("builder结果: " + sb);

        StringBuilder reverse = new StringBuilder("abcde");
        System.out.println("reverse: " + reverse.reverse());

        LocalDateTime now = LocalDateTime.now();
        System.out.println("now: " + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatted = now.format(formatter);
        System.out.println("formatted: " + formatted);

        LocalDateTime parsed = LocalDateTime.parse("2026-04-22 20:30:45", formatter);
        System.out.println("parsed: " + parsed);

        System.out.println("plusDays(7): " + now.plusDays(7).format(formatter));
        System.out.println("minusHours(3): " + now.minusHours(3).format(formatter));

        String d = "java";
        String e = "Java";
        System.out.println("java == Java: " + (d == e));

        String textHello = "hello world";
        System.out.println("\"hello world\"长度: " + textHello.length());

        String sp = "springboot";
        System.out.println("\"springboot\"提取\"boot\": " + sp.substring(6, 10));

        String[] splitStr = "a,b,c,d".split(",");
        for (int i = 0; i < splitStr.length; i++) {
            System.out.println("按逗号分隔a,b,c,d: " + splitStr[i]);
        }

        StringBuilder sb2 = new StringBuilder();
        sb2.append("user-").append(1001);
        System.out.println("用StringBuilder拼接: " + sb2);

        StringBuilder reverse2 = new StringBuilder("ABCDE");
        System.out.println("\"ABCDE\"反转: " + reverse2.reverse());

        LocalDateTime now2 = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        System.out.println("格式化当前时间为\"yyyy/MM/dd HH:mm\": " + now2.format(formatter1));

        LocalDateTime parsed1 = LocalDateTime.parse("2026-12-31 23:59:59", formatter);
        System.out.println("\"2026-12-31 23:59:59\" parsed: " + parsed1);

        System.out.println("plusDays(30): " + now2.plusDays(30).format(formatter1));
        System.out.println("\"2026-12-31 23:59:59\" isAfter(now): " + parsed1.isAfter(now));

        String sb3 = " spring boot ";
        System.out.println(sb3 + "去前后空格后转大写: " + sb3.trim().toUpperCase());

        String str2 = "JavaBackend";
        System.out.println(str2 + "以 \"Java\" 开头、以 \"end\" 结尾: " + (str2.startsWith("Java") && str2.endsWith("end")));
        String str3 = "a|b|c|d";
        System.out.println("按 | 分割并拼接成 \"a-b-c-d\": " + str3.replace("|", "-"));

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsed2 = LocalDate.parse("2026-04-22", formatter2);
        System.out.println("解析为 LocalDate: " + parsed2);

        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime parsed3 = LocalTime.parse("21:45:30", formatter3);
        System.out.println("解析为 LocalTime: " + parsed3);

        LocalDateTime now3 = LocalDateTime.now();
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        System.out.println("当前时间格式化为\"年月日 时分秒\": " + now3.format(formatter4));
        System.out.println("plusWeeks(2): " + now3.plusWeeks(2).format(formatter));
        System.out.println("minusMinutes(90): " + now3.minusMinutes(90).format(formatter));

        LocalDate now4 = LocalDate.now();
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsed4 = LocalDate.parse("2026-12-31", formatter5);
        System.out.println("LocalDate.parse(\"2026-12-31\")isAfter(now): " + parsed4.isAfter(now4));

        StringBuilder sb4 = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb4.append("ID-").append(i + 1);
            if (i < 4) {
                sb4.append(",");
            }
        }
        System.out.println("循环拼接: " + sb4);
    }
}
