import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            System.out.println("===== AI ChatBot Started =====");
            System.out.println("Type 'bye' to exit");

            while (true) {

                System.out.print("You: ");
                String input = sc.nextLine()
                                .toLowerCase()
                                .trim()
                                .replace("?", "");

                if (input.equals("bye")) {

                    System.out.println("Bot: Goodbye!");
                    break;
                }

                else if (input.contains("hello") || input.contains("hi")) {

                    System.out.println("Bot: Hello! Nice to meet you.");
                }

                else if (input.contains("how are you")) {

                    System.out.println("Bot: I am doing great.");
                }

                else if (input.contains("what is java")) {

                    System.out.println("Bot: Java is an object-oriented programming language.");
                }

                else if (input.contains("who created java")) {

                    System.out.println("Bot: James Gosling created Java.");
                }

                else if (input.contains("your name")) {

                    System.out.println("Bot: I am a simple Java ChatBot.");
                }

                else if (input.contains("thank")) {

                    System.out.println("Bot: You're welcome!");
                }

                else {

                    System.out.println("Bot: Sorry, I don't understand. Try another question.");
                }
            }
        }
    }
}