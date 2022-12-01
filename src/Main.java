public class Main {
    public static void main(String[] args) {
        // задача 1
        System.out.println("задача 1");
        int applesCount = 5;
        System.out.println("значение переменной applesCount с типом int равно " + applesCount);
        byte orangesCount = 4;
        System.out.println("значение переменной orangesCount с типом byte равно " + orangesCount);
        short catsCount = 3;
        System.out.println("значение переменной catsCount с типом short равно " + catsCount);
        long peopleCount = 7_500_000_000L;
        System.out.println("значение переменной peopleCount с типом long равно " + peopleCount);
        float pi = 3.141592F;
        System.out.println("значение переменной pi с типом float равно " + pi);
        double e = 2.8; //основание натурального логарифма
        System.out.println("значение переменной e с типом double равно " + e);
        // задача 2
        System.out.println("задача 2");
        float variable1 = 27.12F;
        long variable2 = 982_678_965_549L;
        double variable3 = 2.786;
        boolean variable4 = false;
        char variable5 = 569;
        short variable6 = -159;
        int variable7 = 27897;
        byte variable8 = 67;
        // задача 3
        System.out.println("задача 3");
        int pupilsInFirstClass = 23;
        int pupilsInSecondClass = 27;
        int pupilsInThirdClass = 30;
        int papersCount = 480;
        int papersPerPupils = papersCount /(pupilsInFirstClass + pupilsInSecondClass + pupilsInThirdClass);
        System.out.println("на каждого ученика рассчитано " +papersPerPupils+ " листов бумаги");
        // задача 4
        System.out.println("задача 4");
        int bottles = 16;
        int minutes = 2;
        int productivityPerMinutes = bottles/minutes;
        int firstTimeInMinutes = 20;
        System.out.println("За " + firstTimeInMinutes + " минут машина произвела "+ productivityPerMinutes*firstTimeInMinutes + " штук бутылок");
        int minutesInDay = 24*60;
        System.out.println("За " + minutesInDay + " минут машина произвела "+ productivityPerMinutes*minutesInDay + " штук бутылок");
        int minutesInThreeDay = 3*minutesInDay;
        System.out.println("За " + minutesInThreeDay + " минут машина произвела "+ productivityPerMinutes*minutesInThreeDay + " штук бутылок");
        int minutesInMonth = 10*minutesInThreeDay; // в месяце 30 дней
        System.out.println("За " + minutesInMonth + " минут машина произвела "+ productivityPerMinutes*minutesInMonth + " штук бутылок");
        // задача 5
        System.out.println("задача 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int totalClasses = totalCans/(whiteCansPerClass+brownCansPerClass);
        int totalWhiteCans = totalClasses*whiteCansPerClass;
        int totalBrownCans = totalClasses*brownCansPerClass;
        System.out.println("В школе где," +totalClasses+ " классов, нужно " +totalWhiteCans+ " банок белой краски и " +totalBrownCans+ " банок коричневой краски");
        // задача 6
        System.out.println("задача 6");
        int bananas = 5;
        int bananasWeightGr = bananas*80;
        int milkMl = 200;
        int milkWeightGr = 105*2;
        int iceCream = 2;
        int iceCreamWeightGr = iceCream*100;
        int eggs = 4;
        int egssWeightGr = eggs*70;
        int totalWeightProductsGr = bananasWeightGr+milkWeightGr+iceCreamWeightGr+egssWeightGr;
        int grPerKg = 1000;
        float weightKg = totalWeightProductsGr/1000f;
        System.out.println("вес такого спорт-завтрака " + weightKg + " кг");
        // задача 7
        System.out.println("задача 7");
        int athleteLoseWeightKg = 7;
        int grPerKg1 = 1000;
        int athleteWeightgr = athleteLoseWeightKg*grPerKg1;
        int loseWeightDayGr1 = 250;
        int loseWeightDayGr2 = 500;
        int totalDay1 = athleteWeightgr/loseWeightDayGr1;
        int totalDay2 = athleteWeightgr/loseWeightDayGr2;
        int averageDays = (totalDay1+totalDay2)/2;
        System.out.println("если спортсмен будет терять каждый день по 250 грамм, то у него уйдет на это " +totalDay1+ "дней");
        System.out.println("если спортсмен будет терять каждый день по 500 грамм, то у него уйдет на это " +totalDay2+ "дней");
        System.out.println("в среднем на похудание уйдет " +averageDays+ "дней");
        // задача 8
        System.out.println("задача 8");
        int cashMashaMonht = 67760;
        int cashDenisMonht = 83690;
        int cashKristinaMonht = 76230;
        float salaryIncrease = 0.1f; //  в процентах
        float salaryIncreaseMasha = (cashMashaMonht*salaryIncrease)+cashMashaMonht;
        float salaryIncreaseDenis = (cashDenisMonht*salaryIncrease)+cashDenisMonht;
        float salaryIncreaseKristina = (cashKristinaMonht*salaryIncrease)+cashKristinaMonht;
        float salaryDifferenceMasha = salaryIncreaseMasha-cashMashaMonht;
        float salaryDifferenceDenis = salaryIncreaseDenis-cashDenisMonht;
        float salaryDifferenceKristina = salaryIncreaseKristina-cashKristinaMonht;
        System.out.println("Маша теперь получает " +salaryIncreaseMasha+ " рублей. Годовой доход вырос на " +salaryDifferenceMasha+ " рублей");
        System.out.println("Денис теперь получает " +salaryIncreaseDenis+ " рублей. Годовой доход вырос на " +salaryDifferenceDenis+ " рублей");
        System.out.println("Кристина теперь получает " +salaryIncreaseKristina+ " рублей. Годовой доход вырос на " +salaryDifferenceKristina+ " рублей");
















    }
}