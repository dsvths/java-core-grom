package lesson9;

/**
 * Created by DSV_Discovery on 14.06.2017.
 */
public class Employee {
    String name;
    Company company;
    int monthlySalary;

    public Employee(String name, Company company, int monthlySalary) {
        this.name = name;
        this.company = company;
        this.monthlySalary = monthlySalary;
    }
}
