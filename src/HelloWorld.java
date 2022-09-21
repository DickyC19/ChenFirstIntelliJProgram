import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello World! How are you today? ");
        String response = scan.nextLine();
        System.out.println(response + " you are!");

    }
}
