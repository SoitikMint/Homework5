package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/new.csv")
    public void testCalc(int expected, int income, int expenses, int threshold) {
        VacationDay service = new VacationDay();

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

}
