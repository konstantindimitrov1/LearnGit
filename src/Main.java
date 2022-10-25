import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, age);

        person.greet();

        person.drink();

        for (int i = 0; i < 100; i++) {
            System.out.println("*");
        }
        
        Computer computer = new Computer();
        computer.getMouse().click();
    }
}
