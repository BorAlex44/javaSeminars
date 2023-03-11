package seminar3;

import java.util.*;

public class Seminar3 {
    public static void main(String[] args) {
        //removingEvenElemFromArray();
        findMinMaxAverageFromArray();

    }

    private static void findMinMaxAverageFromArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int value = rand.nextInt(1, 100);
            arrayList.add(value);
        }
        System.out.printf("Входящий список \n %s", arrayList + "\n");
        int max = Collections.max(arrayList);
        int min = Collections.min(arrayList);
        double sumElem = 0;
        for (int elem : arrayList) {
            sumElem += elem;
        }
        double elemAverage = sumElem / arrayList.size();
        System.out.printf("Максимальный элемент массива: %d \n", max);
        System.out.printf("Минимальный элемент массива: %d \n", min);
        System.out.printf("Среднее арифметическое элементов массива: %.2f", elemAverage);


    }

    private static void removingEvenElemFromArray() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num = in.nextInt();
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>(num);
        for (int i = 0; i < num; i++) {
            int value = rand.nextInt(1, 100);
            arrayList.add(value);
        }
        System.out.printf("Исходный список \n %s", arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
            } else {
                i++;
            }
        }
        System.out.printf("\n Список без четных элементов \n %s", arrayList);
//        второй вариант
//        System.out.printf("Исходный список \n %s",arrayList + "\n");
//        System.out.print(" Список без четных элементов \n ");
//        arrayList.stream().filter(n -> n % 2 != 0).forEach(n -> System.out.printf(n + " "));
    }


}
