package seminar6;

import java.util.List;
import java.util.Scanner;

public class Seminar6 {
    public static void main(String[] args) {
        Laptop Msi010XRU = new Laptop("MSI", "14C5M-010XRU", 14, "AMD",
                16, "SSD", 512, "черный");
        Laptop HuaweiWFH9 = new Laptop("Huawei", "MateBookD15", 15.6, "Intel",
                16, "SSD", 512, "серебристый");
        Laptop HuaweiRLEFX = new Laptop("Huawei", "MateBookD16", 16, "Intel",
                16, "SSD", 512, "серый");
        Laptop HuaweiWDI9 = new Laptop("Huawei", "MateBookD15", 15.6, "Intel",
                8, "SSD", 256, "серый");
        Laptop HIPERG16 = new Laptop("HIPER", "G16", 16.1, "Intel",
                64, "SSD", 1024, "черный");
        Laptop ASUSM1502I = new Laptop("ASUS", "Vivobook15", 15.6, "AMD",
                8, "SSD", 512, "серебристый");
        Laptop REALMEBook = new Laptop("REALME", "Book", 14, "Intel",
                8, "SSD", 512, "синий");

        List<Laptop> laptopList = List.of(Msi010XRU, HuaweiWFH9, HuaweiRLEFX, HuaweiWDI9, HIPERG16, ASUSM1502I, REALMEBook);

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите фильтр:\n1 - Брэнд\n2 - Объем оперативной памяти\n3 - цвет ");
        int choiceUser = sc.nextInt();
        Scanner scFromUser = new Scanner(System.in);
        if (choiceUser == 1) {
            System.out.println("Введите название брэнда: ");
            String answerUser = scFromUser.nextLine();
            for (Laptop brand : laptopList) {
                if (brand.getBrand().equalsIgnoreCase(answerUser)) {
                    brand.printInfo();
                }

            }
        } else if (choiceUser == 2) {
            System.out.println("Введите необходимый объем оперативной памяти: ");
            int answerUser = scFromUser.nextInt();
            for (Laptop volumeRam : laptopList) {
                if (volumeRam.getVolumeRam() == answerUser) {
                    volumeRam.printInfo();
                }

            }

        } else if (choiceUser == 3) {
            System.out.println("Введите необходимый цвет:");
            String answerUser = scFromUser.nextLine();
            for (Laptop color : laptopList) {
                if (color.getColor().equalsIgnoreCase(answerUser)) {
                    color.printInfo();
                }

            }

        }

    }
}
