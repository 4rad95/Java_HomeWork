package org.example.HW_17_140324;

// 1 уровень сложности: Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
//
//
//        Login:
//        1) Длина login должна быть меньше 20 символов и начинаться с латинской буквы.
//        2*) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
//Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
//
//
//Password:
//        1) Длина password должна быть меньше 20 символов.
//2*) Должен содержать только латинские буквы, цифры.
//Также password и confirmPassword должны быть равны.
//Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
//
//
//
//WrongPasswordException и WrongLoginException - пользовательские классы исключения с  конструкторами:
//        1) один по умолчанию;
//2*) второй принимает сообщение исключения и передает его в конструктор класса Exception.
//
//
//Метод возвращает true, если значения верны или false в другом случае.
//Обработка исключений проводится в вызывающем методе.
public class task1 {
    public static void main(String[] args) {

       try {
           boolean status = validateCredentials("User", "password", "password");
           if (status) {
               System.out.println("Login data : Ok!");
           }
           else {
               System.out.println("Login data : Bad!");
           }
       }
       catch (WrongLoginException e)
       {
           System.out.println("Ошибка ввода логина : " + e.getMessage());
       }
       catch (WrongPasswordException e){
            System.out.println("Ошибка ввода пароля : " + e.getMessage());
        }
    }

public static  boolean validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {

    // Проверка логина
    if (login.length() >= 20 || !Character.isLetter(login.charAt(0))) {
        throw new WrongLoginException("Логин должен быть менее 20 символов и начинаться с буквы");
    }
    if (!login.matches("[a-zA-Z0-9_]+")) {
        throw new WrongLoginException("Паролб должен содержать только буквы и цифры");
    }

    // Проверка пароля
    if (password.length() >= 20) {
        throw new WrongPasswordException("Пароль должен быть менее 20 символов");
    }
    if (!password.matches("[a-zA-Z0-9]+")) {
        throw new WrongPasswordException("Пароль должен состоять из букв и цифр");
    }
    if (!password.equals(confirmPassword)) {
        throw new WrongPasswordException("Пароли не совподают");
    }

    return true;
}

public static class WrongLoginException extends Exception {


    public WrongLoginException(String message) {
        super(message);
    }
}

public static class WrongPasswordException extends Exception {


    public WrongPasswordException(String message) {
        super(message);
    }
}}