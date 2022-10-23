public class Main {
    public static void main(String[] args) {

        //Задача №1
        System.out.println("Задача №1");
        byte nomerPojarnoiSlujby = 101;
        System.out.println("Значение переменной nomerPojarnoiSlujby с типом byte равно " + nomerPojarnoiSlujby +".");
        short vKarmaneNalichnyh = 20500;
        System.out.println("Значение переменной vKarmaneNalichnyh с типом short равно " + vKarmaneNalichnyh +"руб.");
        int aHotelosBy = 1000000;
        System.out.println("Значение переменной aHotelosBy с типом short равно " + aHotelosBy +"руб.");
        long doKoncaJiznyNeUspelByPotratitNaLichnyeNujdy = 1000000000000L;
        System.out.println("Значение переменной doKoncaJiznyNeUspelByPotratitNaLichnyeNujdy с типом short равно " + doKoncaJiznyNeUspelByPotratitNaLichnyeNujdy +"руб.");
        float daje = 0.1f;
        System.out.println("Значение переменной daje с типом float равно " + daje +" часть.");
        double VeroyatnostChtoUspeyu = 0.0000000000000001;
        System.out.println("Значение переменной VeroyatnostChtoUspeyu с типом double равно " + VeroyatnostChtoUspeyu +" процентов.");

        //Задача №2
        System.out.println("Задача №2");
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = 987678965549L;
        float e = 27.12f;
        double f = 2.786;
        char g = 569;
        boolean h = 15 > 18;
        System.out.println("Задача №2 выполнена без вывода в консоль");

        //Задача №3
        System.out.println("Задача №3");
        byte pupilLP = 23;
        byte pupilAS = 27;
        byte pupilEA = 30;
        short sheetPaper = 480;
        int sheetPaperFor1Pupil = sheetPaper/(pupilLP + pupilAS + pupilEA);
        System.out.println("На каждого ученика рассчитано " + sheetPaperFor1Pupil + " листов бумаги.");

        //Задача №4
        System.out.println("Задача №4");
        byte productivityIn2Minutes = 16;
        int productivityIn1Minute = productivityIn2Minutes / 2;
        short minute = 1;
        int minutes20 = minute * 20;
        int minutesInDay = minute * 60 * 24;
        int minutesIn3Day = minutesInDay * 3;
        int minutesInMonth = minutesInDay * 30;
        int productivityIn20Minutes = productivityIn1Minute * minutes20;
        System.out.println("За 20 минут машина произвела бутылок " + productivityIn20Minutes + " штук.");
        int productivityInDay = productivityIn1Minute * minutesInDay;
        System.out.println("За 1 день машина произвела бутылок " + productivityInDay + " штук.");
        int productivityIn3Day = productivityIn1Minute * minutesIn3Day;
        System.out.println("За 3 дня машина произвела бутылок " + productivityIn3Day + " штук.");
        int productivityInMonth = productivityIn1Minute * minutesInMonth;
        System.out.println("За 1 меясц машина произвела бутылок " + productivityInMonth + " штук.");

        //Задача №5
        System.out.println("Задача №5");
        byte PaintForSchool = 120;
        byte whitePaintFor1Class = 2;
        byte brownPaintFor1Class = 4;
        short PaintFor1Class = (short) (whitePaintFor1Class + brownPaintFor1Class);
        int ClassInSchool = PaintForSchool / PaintFor1Class;
        int whitePaint = whitePaintFor1Class * ClassInSchool;
        int brownPaint = brownPaintFor1Class * ClassInSchool;
        System.out.println("В школе, где " + ClassInSchool + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        //Задача №6
        System.out.println("Задача №6");
        byte amountBanana = 5;
        byte weight1Banana = 80;
        short weight5Bananas = (short) (amountBanana * weight1Banana);

        short volume100Milk = 100;
        short weight100Milk = 105;
        short volume200Milk = 200;
        short weight200Milk = (short) (volume200Milk / volume100Milk * weight100Milk);

        byte amountIceCream = 2;
        byte weight1IceCream = 100;
        short weight2IceCreams = (short) (amountIceCream * weight1IceCream);

        byte amountEgg = 4;
        byte weight1Egg = 70;
        short weight4Eggs = (short) (amountEgg * weight1Egg);

        int weightSportsBreakfast = weight5Bananas + weight200Milk + weight2IceCreams + weight4Eggs;
        System.out.println("Вес спорт-завтрака составляет " + weightSportsBreakfast + " граммов");

        int grammsIn1Kg = 1000;
        float weightSportsBreakfastInKg = (float) weightSportsBreakfast / grammsIn1Kg;
        System.out.println("Вес спорт-завтрака составляет " + weightSportsBreakfastInKg + " килограмм");

        int weightSportsBreakfastInKgAndGr = weightSportsBreakfast % grammsIn1Kg;
        System.out.println("Вес спорт-завтрака составляет 1 килограмм и " + weightSportsBreakfastInKgAndGr + " грамм.");

        //Задача №7
        System.out.println("Задача №7");
        byte excessWeightInKg = 7;
        short grammIn1Kg = 1000;
        int excessWeightInG = excessWeightInKg * grammIn1Kg;
        short losingWeightMin = 250;
        short losingWeightMax = 500;
        short losingWeightAvg = (short) ((losingWeightMin + losingWeightMax) / 2);

        int daysLosingWeightMin = excessWeightInG / losingWeightMin;
        System.out.println(daysLosingWeightMin + " дней уйдёт на похудение, если спортсмен будет терять каждый день по " + losingWeightMin + " грамм.");
        int daysLosingWeightMax = excessWeightInG / losingWeightMax;
        System.out.println(daysLosingWeightMax + " дней уйдёт на похудение, если спортсмен будет терять каждый день по " + losingWeightMax + " грамм.");

        float daysLosingWeightAvg = (float) excessWeightInG / losingWeightAvg;
        System.out.println("В среднем " + daysLosingWeightAvg + " дней может потребоваться, чтобы добиться результата похудения.");
        int daysLosingWeightAvg1= excessWeightInG / losingWeightAvg;
        System.out.println("В среднем " + daysLosingWeightAvg1 + " полных дней может потребоваться, чтобы добиться результата похудения.");
        int daysLosingWeightAvg2 = (int)Math.round(daysLosingWeightAvg);
        System.out.println("В среднем " + daysLosingWeightAvg2 + " календарных дней может потребоваться, чтобы добиться результата похудения.");

        byte hoursPerDay = 24;
        float daysAndHoursLosingWeightAvg = daysLosingWeightAvg % daysLosingWeightAvg1;
        float hoursLosingWeightAvg = daysAndHoursLosingWeightAvg * hoursPerDay;
        float hoursLosingWeightAvg1 = Math.round(hoursLosingWeightAvg);
        System.out.println("В среднем " + daysLosingWeightAvg1 + " дней и " + hoursLosingWeightAvg1 + " часов может потребоваться, чтобы добиться результата похудения.");

        //Задача №8
        System.out.println("Задача №8");
        byte increaseRate = 10;
        byte monthPerYear = 12;

        int salaryMasha = 67760;
        int newSalaryMasha = salaryMasha + salaryMasha/increaseRate;
        int annualSalaryIncreaseMasha = (newSalaryMasha - salaryMasha) * monthPerYear;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Ее годовой доход вырос на " + annualSalaryIncreaseMasha + " рублей.");

        int salaryDenis = 83690;
        int newSalaryDenis = salaryDenis + salaryDenis/increaseRate;
        int annualSalaryIncreaseDenis = (newSalaryDenis - salaryDenis) * monthPerYear;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Его годовой доход вырос на " + annualSalaryIncreaseDenis + " рублей.");

        int salaryKristina = 76230;
        int newSalaryKristina = salaryKristina + salaryKristina/increaseRate;
        int annualSalaryIncreaseKristina = (newSalaryKristina - salaryKristina) * monthPerYear;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Ее годовой доход вырос на " + annualSalaryIncreaseKristina + " рублей.");

    }
}