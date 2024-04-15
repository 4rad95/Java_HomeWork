package org.example.HW_21_280324;

import java.sql.Date;
import java.time.*;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
// 1 уровень сложности:
//        1) реализовать метод, который принимает год и проверяет на високосность
//        2) вывести на консоль дату локализованную для Индии (например)
//        3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>
//        4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
//        5) проверить дата "10 Января 1985" - это пятница?
//        6) вычесть 10 лет из созданной даты, вывести на консоль
//        7) получить обьект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
//        8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль


public class task {
    public static void main(String[] args) {

        // 1) реализовать метод, который принимает год и проверяет на високосность

        int year = 2024;
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " - " + (isLeap ? "високосный" : "не високосный"));

        // 2) вывести на консоль дату локализованную для Индии (например)
        timeLocaleToIndia();

        //   3) вывести дату в формате 19-12-22, 19, 353, 11:47 <дата, день месяца, день в году, время>

        outputDate();

         // 4) создать дату своего рождения, вывести на консоль в формате "10 Января 1985"
        outputBiryhday();

        // 5) проверить дата "10 Января 1985" - это пятница?
        chkFriday();

        // 6) вычесть 10 лет из созданной даты, вывести на консоль
        get10years();

        // 7) получить обьект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        getInstanceTask7();

        //8) получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        zoneDateTimeTask8();
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0 && year % 400 != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static void timeLocaleToIndia() {

        LocalDate now = LocalDate.now();
        ZoneId zoneId = ZoneId.of("Asia/Kolkata");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("hi"));
        System.out.println(now.format(formatter));
        }

    public static void outputDate() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy D HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(formatter.format(localDateTime));
    }
    public static void outputBiryhday() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy, HH:mm");
        LocalDateTime localDateTime = LocalDateTime.parse("11 03 1972, 03:15",formatter);
        formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy, HH:mm");
        System.out.println(formatter.format(localDateTime));
    }
    public static void chkFriday() {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
                // По идее надо было бы ("dd MMMM yyyy") тогда он понял что Январь, но не понимает.ИМХО локализация
                LocalDate localDate = LocalDate.parse("10 01 1985",formatter);
                DayOfWeek dayOfWeek = localDate.getDayOfWeek();
                boolean isFriday = dayOfWeek.equals(DayOfWeek.FRIDAY);
                System.out.println("10 Января 1985 - это " + (isFriday ? "пятница" : "не пятница"));
    }

    public static void get10years(){
        LocalDate currentDate = LocalDate.now();
        LocalDate tenYearsAgo = currentDate.minusYears(10);
        String formattedDate = tenYearsAgo.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        System.out.println("10 лет назад был день: " + formattedDate);
    }
    public static void getInstanceTask7(){
        String dateTimeString = "2022-12-19T06:55:30.00Z";
        Instant instant = Instant.parse(dateTimeString);
        System.out.println("Instant: " + instant);
    }
    public static void zoneDateTimeTask8(){
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime nowInMidway = ZonedDateTime.now(zoneId);
        System.out.println("ZonedDateTime в Pacific/Midway: " + nowInMidway);
    }

}
