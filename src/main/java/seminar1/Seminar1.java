package seminar1;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


    public class Seminar1 {
        public static void main(String[] args) {
            //inputNameAndPrintHi();
            //findMaxAndMinElemArray();
            moveElementToEnd();

        }

        private static void moveElementToEnd() {
            int[] array = {3, 2, 2, 1, 5, 3, 3};
            int val = 3;
            int i = 0;
            int j = array.length -1;
            while (i < j){
                while (i < j && array[j] == val){
                    j--;
                }
                if (array[i] == val){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
                i++;
            }
            System.out.println(Arrays.toString(array));


        }



        private static void findMaxAndMinElemArray() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int num = in.nextInt();
            Random rand = new Random();
            int[] array;
            array = new int[num];
            for (int i = 0; i < num; i++) {
                array[i] = rand.nextInt(100);
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int max = getMax(array);
            System.out.println("Максимальное значение массива: " + max);
            int min = getMin(array);
            System.out.println("Минимальное значение массива: " + min);

        }

        public static int getMax(int[] inputArray) {
            int maxValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] > maxValue) {
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        }

        public static int getMin(int[] inputArray) {
            int minValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] < minValue) {
                    minValue = inputArray[i];
                }
            }
            return minValue;
        }

        private static void inputNameAndPrintHi() {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите имя пользователя: ");
            String name = in.nextLine();
            LocalTime now = LocalTime.now();
            int hour = now.getHour();
            if (hour == 23 ^ hour < 5) {
                System.out.printf("Доброй ночи, %s!", name);
            } else if (hour >= 18) {
                System.out.printf("Добрый вечер, %s!", name);
            } else if (hour < 12) {
                System.out.printf("Доброе утро, %s!", name);
            } else {
                System.out.printf("Добрый день, %s!", name);
            }
        }
    }

