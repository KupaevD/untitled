package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void numberOfSquareRoots() {
        SQRService service = new SQRService();

        int actual = service.calculate(10, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
}
