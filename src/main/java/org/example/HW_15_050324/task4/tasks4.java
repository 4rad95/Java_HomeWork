package org.example.HW_15_050324.task4;

//Создать класс Employee с характеристиками:
//
//
//
//фамилия, имя, отчество
//
//        должность
//
//отдел
//
//        зарплата
//
//
//
//Вычислить среднюю зарплату всех сотрудников
//
//Получить список сотрудников с зп > 1000
//        4. Получить список сотрудников из отдела маркетинг и увеличить зп на 15%
//        5. Получить сотрудника с самой низкой зп
//6*. Получить сотрудника с самой высокой зп
//7. Получите сотрудников из всех отделов с максимальной зп
//8. Сгруппировать сотрудников по должности

import java.util.*;

public class tasks4 {
    public static void main(String[] args) {
        List<Employee> employeesList = Arrays.asList(
                new Employee("Joe Read", "Manager","finance",900),
                new Employee("Jon Cread", "Manager","finance",1100),
                new Employee("Dick Rich", "Specialist","technique",800),
                new Employee("Nick Cadr", "Chief department","technique",1200),
                new Employee("Sindy Kart", "Manager","marketing",1000),
                new Employee("Lisa Pink", "Manager","marketing",1100)
        );


        employeesList.stream()
                .filter(x ->x.salary>1000)
                .forEach(System.out::println);

        System.out.println();

        employeesList.stream()
                .filter(x ->x.department.equals("marketing"))
                .map  (x -> new Employee ( x.name,x.jobTitle, x.department, (int) ((x.getSalary())*1.15)) )
                .forEach(System.out::println);

        System.out.println();

        System.out.println(employeesList.stream()
                .min(Comparator.comparingInt(Employee::getSalary)));

        System.out.println();

        System.out.println(employeesList.stream()
                .max(Comparator.comparingInt(Employee::getSalary)));

        System.out.println();

        Set<String>  employeeSet = new TreeSet<String>();

        System.out.println();
        System.out.println("Получите сотрудников из всех отделов с максимальной зп");

        for (Employee  entry:  employeesList) {      // Формирую перечень отделов.
                employeeSet.add(entry.department);
        }

        for (String entry: employeeSet) {
            System.out.println(employeesList.stream()
                    .filter(x -> x.department.equals(entry))
                    .max(Comparator.comparingInt(Employee::getSalary)));

        }


        System.out.println();
        System.out.println("8. Сгруппировать сотрудников по должности");
        System.out.println();

        for (Employee  entry:  employeesList) {      // Формирую перечень должностей.
            employeeSet.add(entry.jobTitle);
        }

        for (String entry: employeeSet) {
                    employeesList.stream()
                    .filter(x -> x.jobTitle.equals(entry))
                    .forEach(System.out::println);
                    System.out.println();
                    }
    }
}
