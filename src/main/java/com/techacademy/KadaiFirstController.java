package com.techacademy;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime; // 追加
import java.time.Month;
import java.time.format.DateTimeFormatter; // 追加
import java.time.format.FormatStyle;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{date}")
    public DayOfWeek dispDayOfWeek(@PathVariable String date) {

           LocalDate LDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyyMMdd")); //日付を取得

           DayOfWeek yobi = LDate.getDayOfWeek(); //曜日を取得
           return yobi ;

}
    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 + val2;
        return res;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 - val2;
        return res;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 * val2;
        return res;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2) {
        int res = 0;
        res = val1 / val2;
        return res;
    }

}