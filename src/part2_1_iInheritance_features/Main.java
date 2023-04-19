package part2_1_iInheritance_features;

public class Main {
    public static void main(String[] args) {
        //2.1.2 Demonstrate possibility to create instance of subclass while declaring it as of type of superclass
        Employee employee = new Engineer(); //Every method and instance variable of the superclass
        // is inherited by the subclass. As a result, the object of the subclass can be used in any situation where
        // the object of the superclass is expected to be use
        //2.1.2 getClass()
        System.out.println("employee belongs to " + employee.getClass());
        //2.1.1 Create an instance of the subclass.
        Engineer engineer1 = new Engineer("Vlada", 209800, 8000, 1990, "Software Engineer");
        //2.1.4 Demonstrate a call of the overloaded method.
        engineer1.printSalary(700);
        //2.1.5 call overridden method and ensure that correct method is called
        engineer1.printInfo();
        System.out.println();
        Employee employee1 = new Employee("Dima", 882091, 4500, 1985);
        employee1.printSalary("$");
        employee1.printInfo();


    }
}