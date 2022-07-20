package ru.netology.stats;

public class StatsService {

    public long sumMonthSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = (int) (sum + sales[i]);
        }
        return sum;
    }

    public int averageMonthSale(long[] sales) {
        long sum = sumMonthSales(sales);
        long avrSale = sum / sales.length;
        return (int) avrSale;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public int lowerThanAvrMonths(long[] sales) {
        long average = averageMonthSale(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }
    public int higherThanAvrMonths(long[] sales) {
        long average = averageMonthSale(sales);
        int month = 0;
        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}





