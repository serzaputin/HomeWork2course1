public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //task1
        byte a = 27;
        System.out.println("Значение переменной a, с типом byte равно " + a);
        short b = 3785;
        System.out.println("Значение переменной b, с типом short равно " + b);
        int c = 852458;
        System.out.println("Значение переменной c, с типом int равно " + c);
        long d = 3546875245L;
        System.out.println("Значение переменной d, с типом long равно " + d);
        float e = 1.295f;
        System.out.println("Значение переменной e, с типом float равно " + e);
        double f = 95021.265894;
        System.out.println("Значение переменной f, с типом byte равно " + f);

        //task2
        byte g = 67;
        System.out.println(g);
        short h = -159;
        System.out.println(h);
        int i = 569;
        System.out.println(i);
        int j = 27897;
        System.out.println(j);
        long k = 987678965549L;
        System.out.println(k);
        float l = 2.786f;
        System.out.println(l);
        double m = 27.12;
        System.out.println(m);

        //task3
        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        int sheetsPaper = 480;
        int allStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println(allStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPaper / allStudents + " листов бумаги");

        //task4
        int bottle = 16;
        int time1 = 2;
        System.out.println("За " + time1 + " минуты машина произвела " + bottle + " штук бутылок");
        int time2 = 20;
        System.out.println("За " + time2 + " минуты машина произвела " + bottle * 10 + " штук бутылок");
        int time3 = 1440;
        System.out.println("За " + time3 + " минуты машина произвела " + bottle * 72 + " штук бутылок");
        int time4 = 4320;
        System.out.println("За " + time4 + " минуты машина произвела " + bottle * 216 + " штук бутылок");
        int time5 = 43200;
        System.out.println("За " + time5 + " минуты машина произвела " + bottle * 2160 + " штук бутылок");

        //task5
        byte paintCans = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = paintCans / (whitePaint + brownPaint);
        System.out.println("В школе " + totalClasses + " классов");
        System.out.println("В школе, где "
                + totalClasses + " классов, нужно "
                + totalClasses * whitePaint + " банок белой краски и "
                + totalClasses * brownPaint + " банок коричневой краски");

        //task6
        int bananas = 5 * 80;
        int milk = 210;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        System.out.println("Вес спортзавтрака " + (bananas + milk + iceCream + eggs) + " грамм");
        float breakfastWeight = (bananas + milk + iceCream + eggs) / 1000;
        System.out.println(breakfastWeight + " кг!");

        //task7
        byte weight = 7;
        float weightLoss1 = 0.25f;
        System.out.println("Спортсмену понадобиться " + weight / weightLoss1 + " дней");
        float weightLoss2 = 0.5f;
        System.out.println("Спортсмену понадобиться " + weight / weightLoss2 + " дней");
        float weightLoss3 = (weightLoss1 + weightLoss2) / 2;
        System.out.println("В среднем спортсмену понадобиться " + weight / weightLoss3 + " дней");

        //task8
        double mashaSalary = 67760;
        double mashaSalaryPerYear = mashaSalary * 12;
        System.out.println("Зарплата Маши в год составляет " + mashaSalaryPerYear);
        double mashaSalary1 = (mashaSalary * 0.1) + mashaSalary;
        double mashaSalaryPerYear1 = mashaSalary1 * 12;
        System.out.println("Зарплата Маши в год с повышением составляет " + mashaSalaryPerYear1);
        System.out.println("Маша теперь получает " + mashaSalary1 + " рублей. Годовой доход вырос на "
                + (mashaSalaryPerYear1 - mashaSalaryPerYear) + " рублей");

        double denisSalary = 83690;
        double denisSalaryPerYear = denisSalary * 12;
        System.out.println("Зарплата Дениса в год составляет " + denisSalaryPerYear);
        double denisSalary1 = (denisSalary * 0.1) + denisSalary;
        double denisSalaryPerYear1 = denisSalary1 * 12;
        System.out.println("Зарплата Дениса в год с повышением составляет " + denisSalaryPerYear1);
        System.out.println("Денис теперь получает " + denisSalary1 + " рублей. Годовой доход вырос на "
                + (denisSalaryPerYear1 - denisSalaryPerYear) + " рублей");

        double kristinaSalary = 76230;
        double kristinaSalaryPerYear = kristinaSalary * 12;
        System.out.println("Зарплата Кристины в год составляет " + kristinaSalaryPerYear);
        double kristinaSalary1 = (kristinaSalary * 0.1) + kristinaSalary;
        double kristinaSalaryPerYear1 = kristinaSalary1 * 12;
        System.out.println("Зарплата Кристины в год с повышением составляет " + kristinaSalaryPerYear1);
        System.out.println("Кристина теперь получает " + kristinaSalary1 + " рублей. Годовой доход вырос на "
                + (kristinaSalaryPerYear1 - kristinaSalaryPerYear) + " рублей");
    }
}