package seminar4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Seminar4 {
    public static void main(String[] args) {

        //javaSeminarFourOne();
        javaSeminarFourTwo();
    }

    private static void javaSeminarFourTwo() {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("один");
        linkedList.add("два");
        linkedList.add("три");
        linkedList.add("четыре");
        linkedList.add("пять");
        System.out.println(linkedList);
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private static void javaSeminarFourOne() {
        Scanner in = new Scanner(System.in);
        LinkedList<String> wordList = new LinkedList<>();
        while (true) {
            System.out.print("Введите строку: ");
            String inputString = in.nextLine();

            if (inputString.isBlank()) {
                System.out.println("Строка не должна быть пустой!!!! Повторите ввод!");
                continue;
            }
            if (inputString.equalsIgnoreCase("stop")) {
                break;
            }
            if (inputString.equalsIgnoreCase("print")) {
                if (wordList.size() == 0) {
                    System.out.println("Список пуст. Печатать нечего");
                } else {
                    printAllValues(wordList);
                }

            }
            if (inputString.equalsIgnoreCase("revert")) {
                if (wordList.size() == 0 || wordList.size() == 1) {
                    System.out.println("Удалять пока нечего!!!!");
                } else {
                    String removeWord = wordList.remove(1);
                    System.out.printf("Удалена строка - %s\n", removeWord);
                }
            }
            wordList.addFirst(inputString);
        }
    }

    private static void printAllValues(LinkedList<String> wordList) {
        for (int i = 0; i < wordList.size(); i++) {
            System.out.printf("%d) %s%n", i + 1, wordList.get(i));
        }
    }
}
