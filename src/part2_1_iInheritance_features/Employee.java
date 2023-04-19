package part2_1_iInheritance_features;

public class Employee extends Person {
    //2.1.3 instance variables for superclass with different access modifiers: private, protected, public.
    private String name;
    protected int id;
    public int birthYear;

    protected final String superField = "This is a field from a superclass";

    public Employee() {
        System.out.println("demonstration that default superclass constructor is called even when no direct superclass constructor call present");
    }

    public Employee(String name, int id, int salary, int birthYear) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    // 2.1.8 implementation of abstract method
    @Override
    public void printTaxes() {
        if (salary >= 6000) {
            System.out.println("taxes per month: " + (salary * 0.15));
        } else {
            System.out.println("taxes per mont: " + (salary * 0.1));
        }
    }

    //2.1.4 overloading inside the same class
    public void printSalary() {
        System.out.println("Salary of " + name + " is " + salary);
    }

    public void printSalary(String symbol) {
        System.out.println("Salary of " + name + " is " + symbol + salary);
    }

    public void printInfo() {
        System.out.println("Full info: \n" +
                "name: " + name + "\n" +
                "id: " + id + "\n" +
                "salary: " + salary + "\n" +
                "birthYear: " + birthYear);
        printTaxes();
    }

}
