/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package email;

import java.util.ArrayList;

public class EmailService {

    ArrayList<Inbox> inboxes;

    public EmailService() {
        inboxes = new ArrayList<>();
    }

    private Inbox findInbox(String accountName) {
        for (Inbox inbox : inboxes) {
            if (inbox.getAccountName().equals(accountName)) {
                return inbox;
            }
        }
        return null;
    }

    public void sendEmail(Mail mail) {
        if (findInbox(mail.getRecipient()) == null) {
            inboxes.add(new Inbox(mail));
        } else {
            for (Inbox inbox : inboxes) {
                if (inbox.getAccountName().equals(mail.getRecipient())) {
                    inbox.addEmail(mail);
                    break;
                }
            }
        }
    }

    public void readEmail(String accountName) {
        Inbox inbox = findInbox(accountName);

        if (inbox == null) {
            System.out.println("No mail.");
        } else {
            inbox.read();
        }
    }

}
