package com.example;

import java.io.*;

public class Day5Practice {
    public static void main(String[] args) {
        String sourcePath = "day5-source.txt";
        String targetPath = "day5-copy.txt";

        createSourceFileIfNotExists(sourcePath);
        copyTextFile(sourcePath, targetPath);
        int charCount = countCharacters(targetPath);
        int lineCount = countLines(targetPath);

        System.out.println("复制完成: " + sourcePath + " -> " + targetPath);
        System.out.println("字符总数: " + charCount);
        System.out.println("行数: " + lineCount);
    }

    public static void createSourceFileIfNotExists(String path) {
        File file = new File(path);
        if (file.exists()) {
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("Java backend day5");
            writer.newLine();
            writer.write("File IO practice");
            writer.newLine();
            writer.write("Count chars and lines");
        } catch (IOException e) {
            throw new RuntimeException("创源文件失败: " + path, e);
        }
    }

    public static void copyTextFile(String sourcePath, String targetPath) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("复制文件失败: " + sourcePath + " -> " + targetPath, e);
        }
    }

    public static int countCharacters(String path) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (ch != '\n' && ch != '\r') {
                    count++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException("统计字符失败: " + path, e);
        }
        return count;
    }

    public static int countLines(String path) {
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                lines++;
            }
        } catch (IOException e) {
            throw new RuntimeException("统计行数失败: " + path, e);
        }
        return lines;
    }
}
