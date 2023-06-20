package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void findMinSales() {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 6, 8};

        long expected = 1;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void findMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 6, 8};

        long expected = 4;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 6, 8};

        float expected = 5.75F;
        float actual = service.averageSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findSumSales() {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 6, 8};

        long expected = 23;
        long actual = service.sumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {4, 5, 6, 8};

        long expected = 2;
        long actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.belowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}
