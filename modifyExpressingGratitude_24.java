import java.util.Scanner;

/**
 * modifyExpressingGratitude_24
 */
public class modifyExpressingGratitude_24 {
    public static String getGreetingRecipient() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the name of people you want to greet : ");
        String recipientName = input.nextLine();
        input.close();
        return recipientName;
    }
    public static void sayThankyou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you "+name+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like i could ask you anything.");
    }
    public static void sayAdditionalGreetings(String additionalMessage) {
        System.out.println("Additional Greeting: " + additionalMessage);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter additional greeting message: ");
        String additionalGreeting = input.nextLine();
        sayThankyou();
       
        input.close();
    }
}