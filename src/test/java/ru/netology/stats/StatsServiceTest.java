package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void sailsSum() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.sailsSum(sails);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    void averageSails() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.averageSails(sails);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    void maxSails() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.maxSails(sails);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void minSails() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.minSails(sails);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    void lessAverage() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.lessAverage(sails);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void moreAverage() {
        StatsService service = new StatsService();
        int[] sails = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double actual = service.moreAverage(sails);
        int expected = 5;
        assertEquals(expected, actual);
    }
}