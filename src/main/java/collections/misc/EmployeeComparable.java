package collections.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

    private String name;
    private Double salary;
    private String department;


    public EmployeeComparable(String name, Double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        // The following sorts in ascending order
        // for descending order use o.name.compareTo(this.name)
        return this.salary.compareTo(o.salary);
    }

    public static void main(String[] args) {
        EmployeeComparable e1 = new EmployeeComparable("Deepak", 12345.0,"IT");
        EmployeeComparable e2 = new EmployeeComparable("Ameya", 1234.0,"Banking");
        EmployeeComparable e3 = new EmployeeComparable("Jitesh", 123.0,"Chemical");
        EmployeeComparable e4 = new EmployeeComparable("Zinedin", 12.0,"Ascetic");

        List<EmployeeComparable> employees = Arrays.asList(e1, e2, e3, e4);
        System.out.println(employees);

        Collections.sort(employees);

        System.out.println("\n"+employees);

    }

    @Override
    public String toString() {
        return "EmployeeComparable{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
