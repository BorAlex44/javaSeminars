package seminar2;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Seminar2 {
    public static void main(String[] args) {

        //isPalindromeOrNot();
        //String testRes = testStringHundredTimes();
        //System.out.println(testRes);
        writeToFileTestStringHundredTimes();

    }

    public static void isPalindromeOrNot() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String inputWord = in.nextLine().toLowerCase();
        StringBuilder sb = new StringBuilder(inputWord);
        StringBuilder reverse = sb.reverse();
        boolean res = (reverse.toString()).equals(inputWord);
        if (res) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }


    public static void writeToFileTestStringHundredTimes() {
        StringBuilder sb = new StringBuilder(100);
        for (int i = 1; i < 101; i++) {
            sb.append(i).append(": ").append("ТЕСТ").append(System.lineSeparator());
        }
        File output = new File("src/main/resources/files/seminar2_2.txt");
        try (PrintWriter pw = new PrintWriter(output)) {
            pw.print(sb);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден по пути: " + output.getPath());
        }

    }

}