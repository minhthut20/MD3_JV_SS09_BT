package BT1_NextDayCalculator;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.DisplayName;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NextDayCalculatorTest {

    @Test
    @DisplayName("Day of 2018-Jan-01")
    void checkNextDay20180101() {
        int year = 2018;
        int month = 1;
        int date = 1;
        LocalDate expect = LocalDate.of(2018, 1, 2);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Jan-31")
    void checkNextDay20180131() {
        int year = 2018;
        int month = 1;
        int date = 31;
        LocalDate expect = LocalDate.of(2018, 2, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }

    @Test
    @DisplayName("Day of 2018-Apr-30")
    void checkNextDay20180430() {
        int year = 2018;
        int month = 4;
        int date = 30;
        LocalDate expect = LocalDate.of(2018, 5, 1);
        LocalDate result = NextDayCalculator.findNextDay(year, month, date);
        assertEquals(expect, result);
    }
}