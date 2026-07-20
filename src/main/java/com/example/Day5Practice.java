package com.example;

import java.io.*;

public class Day5Practice {
    public static void main(String[] args) {
        String sourcePath = "day5-source.txt";
        String targetPath = "day5-copy.txt";

        createSourceFileIfNotExists(sourcePath);
        copyTextFile(sourcePath, targetPath);
        printFileStatistics(targetPath);

        try {
            countCharacters("not-exists.txt");
        } catch (RuntimeException e) {
            System.out.println("异常演练1: " + e.getMessage());
        }

        try {
            copyTextFile("day5-source.txt", "/invalid/path/day5-copy.txt");
        } catch (RuntimeException e) {
            System.out.println("异常演练2: " + e.getMessage());
        }
    }

    public static void printFileStatistics(String path) {
        int charCount = countCharacters(path);
        int lineCount = countLines(path);
        int wordCount = countWords(path);
        System.out.println("文件统计: " + path);
        System.out.println("字符总数: " + charCount);
        System.out.println("行数: " + lineCount);
        System.out.println("单词数: " + wordCount);
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
            throw new RuntimeException("创建源文件失败: " + path, e);
        }
    }

    public static void copyTextFile(String sourcePath, String targetPath) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
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

    public static void copyBinaryFile(String sourcePath, String targetPath) {
        try (
                BufferedInputStream in = new BufferedInputStream(new FileInputStream(sourcePath));
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(targetPath));) {
            byte[] buffer = new byte[8192];
            int len;
            while ((len = in.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
        } catch (IOException e) {
            throw new RuntimeException("复制二进制文件失败: " + sourcePath + " -> " + targetPath, e);
        }
    }

    public static int countWords(String path) {
        int words = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String trimmed = line.trim();
                if (trimmed.isEmpty()) {
                    continue;
                }
                String[] parts = trimmed.split("\\s+");
                words += parts.length;
            }
        } catch (IOException e) {
            throw new RuntimeException("统计单词失败: " + path, e);
        }
        return words;
    }
}
