/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package email;

public class Mail {
    private String sender;
    private String recipient;

    private String text;

    public Mail(String sender, String recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}
