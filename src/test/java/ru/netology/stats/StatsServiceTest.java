package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class StatsServiceTest {
    @Test
    void shouldReturnSum() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long actual = service.calculateSum(salesAmount);
        assertEquals(expected, actual);

    }

    @Test
    void shouldReturnAverageSum() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long actual = service.calculateAverageSum(salesAmount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMaximumSaleMonth() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.calculateMaxSaleMonth(salesAmount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnMinimumSaleMonth() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(salesAmount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNumberOfMonthWithBelowSales() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.belowTheAverage(salesAmount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnNumberOfMonthWithUpperAverage() {
        StatsService service = new StatsService();
        long[] salesAmount = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.upperAverage(salesAmount);
        assertEquals(expected, actual);
    }

}