/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.email;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EmailSystem {
    private HashMap<String, List<Email>> mailboxes;

    public EmailSystem() {
        this.mailboxes = new HashMap<>();
    }

    public void send(Email email, SendType sendType) {
        Email m = sendType.send(email);
        if (mailboxes.get(email.getSender()) == null) {
            mailboxes.put(email.getSender(), new ArrayList<>());
        }
        if(mailboxes.get(email.getRecipient()) == null) {
            mailboxes.put(email.getRecipient(), new ArrayList<>());
        }
        List<Email> box = mailboxes.get(m.getRecipient());
        box.add(m);
    }


}
