public class Main {
    public static <clientOS> void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println();
        System.out.println("Задание 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println();
        System.out.println("Задание 2");

        int clientDeviceYear = 2017;
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите полную версию для IOS");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите полную версию для Android");
        }


        System.out.println();
        System.out.println("Задание 3");

        int year = 1917;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println();
        System.out.println("Задание 4");

        int deliveryDistance = 115;
        int deliveryDays =0;
        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if ((deliveryDistance > 60 && deliveryDistance <= 100)) {
            deliveryDays = 3;
        } else if (deliveryDistance > 100) {
            deliveryDays = 0;
        }
        if (deliveryDays != 0 ) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");

        }
    }

}