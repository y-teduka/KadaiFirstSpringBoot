package com.techacademy;

import java.util.Calendar;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {
    @GetMapping("/dayofweek/{day1}")
    public String dispDayOfWeek(@PathVariable String day1) {
        String y = day1.substring(0, 4);
        int yp = Integer.parseInt(y);
        String m = day1.substring(4, 6);
        int mp = Integer.parseInt(m);
        String d = day1.substring(6, 8);
        int dp = Integer.parseInt(d);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, yp);
        cal.set(Calendar.MONTH, mp - 1);
        cal.set(Calendar.DAY_OF_MONTH, dp);
        int result = cal.get(Calendar.DAY_OF_WEEK);

        switch (result) {
        case 1:
            return "Sunday";
        case 2:
            return "Monday";
        case 3:
            return "Tuesday";
        case 4:
            return "Wednesday";
        case 5:
            return "Thursday";
        case 6:
            return "Friday";
        case 7:
            return "Saturday";
        }
        String rr = String.valueOf(result);
        return rr;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int Plus = val1 + val2;
        return Plus;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int Minus = val1 - val2;
        return Minus;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int Times = val1 * val2;
        return Times;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calvDivide(@PathVariable int val1, @PathVariable int val2) {
        int Divide = val1 / val2;
        return Divide;
    }

}
