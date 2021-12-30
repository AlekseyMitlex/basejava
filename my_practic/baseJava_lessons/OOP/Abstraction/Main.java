package baseJava_lessons.OOP.Abstraction;

public class Main {
    public static void main(String args[]) {

        Customer henry = new Customer("Henry", "Baskerville", "Baskerville Hall", "GB29 NWBK 6016 1331 9268 19");

        Employee sherlock = new Employee("Sherlock", "Holmes", "221b Baker St", 61632);

        henry.display();
        System.out.println("");
        sherlock.display();
    }
}

class Person {

    protected String firstName;
    protected String lastName;
    protected String address;

    public Person(String firstName, String lastName, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public void display(){
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println("Address: " + this.address);
    }
}

class Customer extends Person {

    private String bankAccountNumber;

    public Customer(String firstName, String lastName, String address, String bankAccountNumber) {
        super(firstName, lastName, address);
        this.bankAccountNumber = bankAccountNumber;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Bank account number: " + this.bankAccountNumber);
    }
}

class Employee extends Person {

    private double salary;

    public Employee(String firstName, String lastName, String address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}
