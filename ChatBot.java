import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("      JAVA CHATBOT");
        System.out.println("Type 'bye' to exit");
        System.out.println("=================================");

        while (true) {

            System.out.print("You : ");
            String message = sc.nextLine().toLowerCase();

            if (message.equals("bye")) {
                System.out.println("Bot : Goodbye! Have a nice day.");
                break;
            }

            else if (message.contains("hello") || message.contains("hi")) {
                System.out.println("Bot : Hello! How can I help you?");
            }

            else if (message.contains("name")) {
                System.out.println("Bot : My name is Java ChatBot.");
            }
            else if (message.contains("college")) {
                System.out.println("Bot : I can answer college related questions.");
            }

            else if (message.contains("java")) {
                System.out.println("Bot : Java is an Object-Oriented Programming language.");
            }

            else if (message.contains("oop")) {
                System.out.println("Bot : OOP stands for Object-Oriented Programming.");
            }

            else if (message.contains("project")) {
                System.out.println("Bot : I can help you with Java projects.");
            }

            else if (message.contains("thank")) {
                System.out.println("Bot : You're welcome!");
            }

            else {
                System.out.println("Bot : Sorry, I don't understand your question.");
            }
        }

        sc.close();
    }
}