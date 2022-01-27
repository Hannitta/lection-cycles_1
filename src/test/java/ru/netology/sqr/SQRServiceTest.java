package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    public void shouldNumberWithinBorder() {
        SQRService service = new SQRService();
        int bottomBorder = 100;
        int topBorder = 110;
        int expected = 1;

        int actual = service.rangeCalculator(bottomBorder, topBorder);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberWithoutBorder() {
        SQRService service = new SQRService();
        int bottomBorder = 5;
        int topBorder = 9;
        int expected = 0;

        int actual = service.rangeCalculator(bottomBorder, topBorder);

        assertEquals(expected, actual);
    }
}