package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class StatsServiceTest {

    @Test

    public void shouldFindCorrectSumSales() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedSum = 78;
        long actualSum = service.sumMonthSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test

    public void shouldFindAvrMonthSale() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedAvr = 6;
        long actualAvr = service.averageMonthSale(sales);

        Assertions.assertEquals(expectedAvr, actualAvr);
    }

    @Test

    public void shouldFindMaxSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedMax = 12;
        long actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test

    public void shouldFindMinSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedMin = 1;
        long actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test

    public void shouldFindMinThanAverageSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedMinAvr = 5;
        long actualMinAvr = service.lowerThanAvrMonths(sales);

        Assertions.assertEquals(expectedMinAvr, actualMinAvr);
    }

    @Test

    public void shouldFindHigherThanAverageSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        long expectedMinAvr = 6;
        long actualMinAvr = service.higherThanAvrMonths(sales);

        Assertions.assertEquals(expectedMinAvr, actualMinAvr);
    }
}

