package seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Seminar5 {
    public static void main(String[] args) {
        javaSeminarFive();
    }

    private static void javaSeminarFive() {
        Scanner in = new Scanner(System.in);
        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        boolean book = true;
        while (book){
            System.out.println("""
                    Выберите команду:
                    1 - Добавить контакт в телефонную книгу
                    2 - Показать все контакты
                    0 - Выход""");
            String choice = in.nextLine();
            switch (choice) {
                case "1" -> addContactToPhoneBook(phoneBook, in);
                case "2" -> printPhoneBook(phoneBook);
                case "0" -> {
                    book = false;
                    System.out.println("Работа завершена!!!!");
                }
                default -> System.out.println("Неверный выбор!!!! Повторите выбор!!!!");
            }

        }
    }

    private static void printPhoneBook(Map<String, ArrayList<String>> bookBase) {
        for (String name: bookBase.keySet()) {
            System.out.printf("Фамилия, Имя контакта -  %s\n", name);
            ArrayList<String> phones = bookBase.get(name);
            for (String phone: phones) {
                System.out.printf("Номер телефона -  %s\n", phone);
            }
            System.out.println();
        }
    }

    private static void addContactToPhoneBook(Map<String, ArrayList<String>> pB, Scanner sc) {
        ArrayList<String> phoneNumber = new ArrayList<>();
        System.out.println("Введите фамилию и имя контакта: ");
        String nameContact = sc.nextLine().toUpperCase();
        System.out.println("Введите номер телефона: ");
        String phone = sc.nextLine();
        if (!pB.containsKey(nameContact)){
            pB.put(nameContact, phoneNumber);
        }
        pB.get(nameContact).add(phone);
    }
}
