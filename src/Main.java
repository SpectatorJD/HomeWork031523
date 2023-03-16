public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void task1() {
        int year = 2023;
        checkYear(year);
    }


    public static void checkOS (int clientOS){

        if (clientOS == 1) {
            System.out.println("для Android по ссылке ");
        } else {
            System.out.println("для iOS по ссылке");
        }
    }
    public static void checkYearDevice(int deviceYear){
        if (deviceYear < 2015) {
            System.out.print("Установите облегченную версию приложения ");
        } else {
            System.out.print("Установите версию приложения ");
        }
    }
    public static void task2(){
        int clientOS = 1;
        int deviceYear = 2005;
        checkYearDevice(deviceYear);
        checkOS(clientOS);
    }
    public static void checkRange(int deliveryDistance, int daysDelivery) {
        if (deliveryDistance > 20) {
            daysDelivery++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            daysDelivery++;
        }
        System.out.println("Потребуется дней " + daysDelivery + " + срок доставки.");
    }

    public static void task3() {
        int deliveryDistance = 95;
        int daysDelivery = 1;
        checkRange(deliveryDistance,daysDelivery);
    }
}





