public class Main {
    public static void main(String[] args) {

        System.out.println("Задача №1");

        int currentAmount = 0;
        int monthlyPayment = 15_000;
        int targetAmount = 2_459_000;
        int months = 0;

        while (currentAmount < targetAmount) {
            months++;
            currentAmount += monthlyPayment;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + currentAmount + " рублей.");
        }
        System.out.println("Для накопления суммы " + targetAmount + " рублей потребуется " + months + " месяца.");

        System.out.println("Задача №2");

        int i = 0;
        while (i++ < 10) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        int birthRate = 17;
        int deathRate = 8;
        int years = 10;
        int currentYear = 2024;
        int year = 0;
        for (year = currentYear + 1; year <= currentYear + years; year++)
            population += (birthRate - deathRate) * population / 1000;
        System.out.println("Год " + year + ", численность населения составляет: " + population + " человек.");


        System.out.println("Задача №4");

        monthlyPayment = 15_000;
        targetAmount = 12_000_000;
        currentAmount = monthlyPayment;
        months = 0;
        int percent = 107;

        while (currentAmount < targetAmount) {
            currentAmount += monthlyPayment;
            currentAmount = currentAmount * percent / 100;
            monthlyPayment = monthlyPayment * percent / 100;
            months++;

            if (months % 6 == 0)         // Задача №5


                System.out.println("Месяц : " + months);
            System.out.println("Сумма накоплений равна : " + currentAmount);
        }

        System.out.println("Задача №6");


        currentAmount = 0;
        monthlyPayment = 15_000;
        targetAmount = 12_000_000;
        percent = percent;
        months = 0;
        year = 0;

        while (currentAmount < targetAmount && year < 9) {
            currentAmount += monthlyPayment;
            currentAmount = currentAmount * percent / 100;
            monthlyPayment = monthlyPayment * percent / 100;
            months++;
            if (months % 6 == 0) {
                System.out.println("Месяц " + months);
                System.out.println("Сумма накоплений равна : " + currentAmount);
            }
        }

        System.out.println("Задача №7");

        int firstFriday = 5;
        int dayInMonth = 31;
        int currentDay = firstFriday;

        while (currentDay <= dayInMonth) {
            if ((currentDay - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница " + currentDay + "-e число.Необходимо подготовить отсчёт.");
            }
            currentDay++;
        }

        System.out.println("Задача  №8");

        currentYear = 2024;
        int startYear = 1824;
        int endYear = 2124;
        for (int cometYear = startYear; cometYear < endYear; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);

            }
        }


    }
}