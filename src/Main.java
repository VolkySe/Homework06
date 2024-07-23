public class Main {
    public static void main(String[] args) {

        System.out.println("task1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        System.out.println("task2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("task3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        System.out.println("task4");
        for (int i = 10; i > (-11); i--) {
            System.out.println(i);
        }

        System.out.println("task5");
        for (int i = 1904; i < 2097; i += 4) {
            if ((i % 100 != 0) || (i % 400 == 0)) {
                System.out.println(i + " год является високосным");
            }
        }

        System.out.println("task6");
        for (int i = 7; i < 100; i += 7) {
            System.out.println(i);
        }

        System.out.println("task7");
        for (int i = 2; i <= 512; i *= 2) {
            System.out.println(i);
        }

        System.out.println("task8");
        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += deposit;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей ");
        }

        System.out.println("task9");
        deposit = 29000;
        float totalDeposit = 0;
        for (int i = 1; i <= 12; i++) {
            totalDeposit = (float) (totalDeposit * 1.01 + deposit);
            System.out.println("Месяц " + i + " сумма накоплений равна " + Math.round(totalDeposit) + " рублей ");
        }

        System.out.println("task10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + i * 2);
        }
    }
}
