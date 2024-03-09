package org.example.HW_15_050324.task4;

public class Employee {

    String name;
    String jobTitle;

    String department;
    int salary;

    public Employee(String name, String jobTitle, String department, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
