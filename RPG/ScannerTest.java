package RPG;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("Enter command (quit to exit):");
            String input = keyboard.nextLine();
            if(input != null) {
                System.out.println("Your input is : " + input);
                if ("quit".equals(input)) {
                    System.out.println("Exit programm");
                    exit = true;
                } else if ("x".equals(input)) {
                    //Do something
                }
            }
        }
        keyboard.close();
    }

}