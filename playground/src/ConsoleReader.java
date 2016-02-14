import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Shailesh Meshram on 2/14/2016.
 */
public class ConsoleReader {

    /**
     *  This class demo different ways to read input from StdIn console.
     *
     */


    private static void readUsingBufferReader() throws IOException {

        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Name");
        String name = reader.readLine();
        System.out.println("Your name is: " + name);

        System.out.print("Enter your surname: ");
        String surname = reader.readLine();
        System.out.println("surname = " + surname);

    }

    public static void readUsingScanner(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your nationality: ");
        String nationality = scanner.nextLine();
        System.out.println("nationality = " + nationality);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("age = " + age);
    }

    public static void readUsingConsole() {

        Console console = System.console();
        if (console == null) {
            System.out.println("No console: non-interactive mode!");
            System.exit(0);
        }

        System.out.print("Enter your username: ");
        String username = console.readLine();

        System.out.print("Enter your password: ");
        char[] password = console.readPassword();

        String passport = console.readLine("Enter your %d (th) passport number: ", 2);

    }

    public static void main(String[] args) throws IOException {

        //readUsingBufferReader();
        //readUsingScanner();
        readUsingConsole();
    }

}
