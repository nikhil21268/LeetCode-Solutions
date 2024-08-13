package DayOfTheWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {

        LocalDate date = LocalDate.of(year, month, day);

        DayOfWeek dayOfWeek = date.getDayOfWeek();


        return dayOfWeek.toString().charAt(0) + dayOfWeek.toString().substring(1).toLowerCase();

    }
}