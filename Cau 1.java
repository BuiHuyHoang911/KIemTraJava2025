import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public Person() {
        this.name = "";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();

        while (true) {
            try {
                System.out.println("Enter age: ");
                this.age = Integer.parseInt(scanner.nextLine());
                if (this.age < 0) {
                    System.out.println("Age cannot be negative. Please try again.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Please enter a valid number.");
            }
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.inputInfo();
        person.displayInfo();
    }
}