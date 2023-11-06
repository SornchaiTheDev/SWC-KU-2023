/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package email;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        String currentUser = null;


        System.out.println("=========== SWCon Email System ===========");
        while (true) {
            System.out.print("------> Command [Log I)n  S)end R)ead Log O)ut Q)uit] : ");
            Scanner in = new Scanner(System.in);
            String command = in.nextLine();
            switch (command) {
                case "I": {
                    System.out.print("Username: ");
                    String username = in.nextLine();
                    currentUser = username;
                    continue;
                }
                case "S": {
                    if (currentUser == null) {
                        System.out.println("You are not logged In");
                        continue;
                    }
                    System.out.print("Enter recipient: ");
                    String recipient = in.nextLine();
                    System.out.print("Enter text: ");
                    String text = in.nextLine();
                    emailService.sendEmail(new Mail(currentUser, recipient, text));
                    System.out.println("Email to " + recipient + " is Sent");
                    continue;
                }
                case "R": {
                    if (currentUser == null) {
                        System.out.println("You are not logged In");
                        continue;
                    }
                    emailService.readEmail(currentUser);
                    continue;
                }
                case "O": {
                    currentUser = null;
                    continue;
                }
                case "Q": {
                    System.out.println("============ Good Bye  ! ===============");
                    break;
                }
                default: {
                    System.out.println("There is no '" + command + "' command!");
                    continue;
                }
            }
            break;
        }

    }
}
