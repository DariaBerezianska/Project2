package part2_1_iInheritance_features;

public class Engineer extends Employee {
    private String speciality;

    public Engineer() {

    }

    //2.1.7 super keyword for parent constructor call
    public Engineer(String name, int id, int salary, int birthYear, String speciality) {
        super(name, id, salary, birthYear);
        this.speciality = speciality;
    }

    //2.1.3 method to demonstrate ability to access superclass instance variables inside the child class methods.
    public void demonstration() {
        // String employeeName = name; // Error! when we try to access a private instance variable outside class,
        // we need to use getters and setters
        String employeeName = getName(); // it is the correct way to access the private instance variable
        int employeeId = id;
        int employeebirthYear = birthYear;
    }

    //2.1.4 overloading implemented in inherited class
    public void printSalary(int bonus) {
        System.out.println("Salary of " + getName() + " is " + (salary + bonus));
    }

    //2.1.5 override a parent class method inside a child class +
    //2.1.6 demonstrate ability to call overridden method (method of the superclass)
    // inside the overriding method (method of the child class) using super keyword.
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("speciality: " + speciality);
    }
}
