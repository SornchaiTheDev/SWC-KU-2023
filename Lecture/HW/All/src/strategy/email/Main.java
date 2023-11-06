/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.email;

public class Main {
    public static void main(String[] args) {
        Email email1 = new Email("Kwan", "Kate", "Hello");
        Email email2 = new Email("George", "Ken", "Hi");
        EmailSystem emailSystem = new EmailSystem();
        emailSystem.send(email1, new Caesar(2));
        emailSystem.send(email2, new SwitchCipher());
    }
}
