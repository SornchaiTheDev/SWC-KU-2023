/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package email;

import java.util.ArrayList;

public class Inbox {
    ArrayList<Mail> inbox;

    private String accountName;

    public Inbox() {
        inbox = new ArrayList<>();
    }

    public Inbox(Mail mail) {
        this();
        inbox.add(mail);
        accountName = mail.getRecipient();
    }


    public void addEmail(Mail mail) {
        inbox.add(mail);
    }

    public String getAccountName() {
        return accountName;
    }

    public void read() {
        for (Mail mail : inbox) {
            System.out.println("************");
            System.out.println("From: " + mail.getSender());
            System.out.println("To: " + mail.getRecipient());
            System.out.println(mail.getText());
            System.out.println("************");
        }
    }
}
