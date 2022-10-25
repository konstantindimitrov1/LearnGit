import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Person person = new Person(name, age);

        person.greet();

        System.out.println("Prase");

        System.out.println("Pingvin");

        person.drink();
    }
}
