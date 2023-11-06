/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.email;

public class Caesar implements SendType {

    final private int key;

    public Caesar(int key) {
        this.key = key;
    }

    @Override
    public Email send(Email email) {
        char[] data = email.getText().toCharArray();
        for (int i = 0; i < data.length; i++) {
            data[i] = (char) (data[i] + key);
        }
        email.setText(new String(data));
        return email;
    }
}
