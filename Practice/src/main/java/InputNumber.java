import java.util.Scanner;

public class InputNumber {
    Scanner input = new Scanner(System.in);

    public String getUserName(){
        System.out.println("Hello User! What is your name? :)");
        return input.nextLine();
    }
    public void getUserNumber(){
        System.out.println("Hello" + " " + getUserName() + "! Please pick a positive number!");
        if (input.nextInt() < 1){
            System.out.println("Invalid! Please choose a positive number.");
        }
        int userNumber= input.nextInt();
        System.out.println("Multiplication table of " + userNumber + ":");
        for (int i=1; i<=userNumber; i++){
            System.out.println(i + " * " + userNumber + " = " + i * userNumber);
        }
        //dfhasfeawofb
    }

    public static void main(String[] args) {
        InputNumber hello = new InputNumber();
        hello.getUserNumber();
    }
}
