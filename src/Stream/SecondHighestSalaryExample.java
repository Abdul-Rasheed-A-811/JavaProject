package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

//public class SecondHighestSalaryExample {
//    public static void main(String[] args) {
//        List<Employee> employees = Arrays.asList(
//                new Employee("John", 50000),
//                new Employee("Alice", 60000),
//                new Employee("Bob", 75000),
//                new Employee("Eve", 70000)
//        );
//
//        Optional<Double> secondHighestSalary = employees.stream()
//                .map(Employee::getSalary)
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1) // Skip the highest salary
//                .findFirst();
//
//        if (secondHighestSalary.isPresent()) {
//            System.out.println("Second highest salary: " + secondHighestSalary.get());
//        } else {
//            System.out.println("There is no second highest salary.");
//        }
//    }
//}

public class SecondHighestSalaryExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 60000),
                new Employee("Bob", 75000),
                new Employee("Abdul", 100000),
                new Employee("Eve", 70000)
        );

        Optional<Double> secondHighestSalary = employees.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1) // Skip the highest salary
                .findFirst();

        secondHighestSalary.ifPresentOrElse(
                value -> System.out.println("Second highest salary: " + value),
                () -> System.out.println("There is no second highest salary.")
        );
    }
}

