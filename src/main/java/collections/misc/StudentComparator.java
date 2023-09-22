package collections.misc;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {

    private String firstName;
    private String lastName;
    private Integer age;

    public StudentComparator(String firstName, String lastName, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static void main(String[] args) {

        StudentComparator deepak = new StudentComparator("Deepak", "Mishra", 33);
        StudentComparator ajit = new StudentComparator("Ajit", "Kumar", 22);
        StudentComparator vijaya = new StudentComparator("Vijaya", "Pardhi", 31);
        StudentComparator jitendra = new StudentComparator("Jitendra", "Mishra", 43);
        StudentComparator shobha = new StudentComparator("Shobha", "Tiwari", 19);
        StudentComparator divit = new StudentComparator("Divit", "Thakur", 2);

        List<StudentComparator> students = Arrays.asList(deepak, ajit, vijaya, jitendra, shobha, divit);
        System.out.println(students);

        System.out.println("After sorting by first name");
        Collections.sort(students, Comparator.comparing(StudentComparator::getFirstName));
        System.out.println(students);

        System.out.println("After sorting by last name");
        Collections.sort(students, Comparator.comparing(StudentComparator::getLastName));
        System.out.println(students);

        System.out.println("After sorting by age");
        Collections.sort(students, Comparator.comparing(StudentComparator::getAge));
        System.out.println(students);
    }

    @Override
    public String toString() {
        return "StudentComparator{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
