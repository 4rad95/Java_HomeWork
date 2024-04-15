package org.example.HW_20_260324;

// 1 уровень сложности: 1. Написать регулярное выражение для проверка email (например my_25@domen-38.de).
//        2.* Написать регулярное выражение для проверки корректности нового пароля,
//который соответствует определенным критериям:
//
//
//состоять минимум из 8 символов;
//
//должен обязательно включать хотя бы одну маленькую букву;
//
//должен обязательно включать хотя бы одну большую букву;
//
//должен обязательно включать хотя бы одну цифру;
//
//должен обязательно включать хотя бы один спецсимвол (пример: !@#$%^&_+-=);

public class task {
    public static void main(String[] args) {

        String email ="asd@gmail.com";

        String password = "dfg1sdA@";

        System.out.println( "Check email " + email +" status : " +isEmailValid(email)) ;
        System.out.println();
        System.out.println("Check password " + password + " status : "+ isValidPassword(password));

    }

    public static boolean isEmailValid(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,}$";
        return email.matches(regex);
    }
    public static boolean isValidPassword(String password) {
        String regex = "^(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_+-=])";
        return password.matches(regex);
    }
}
