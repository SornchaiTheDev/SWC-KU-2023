/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.email;

public class SwitchCipher implements SendType {
    @Override
    public Email send(Email email) {
        char[] data = email.getText().toCharArray();
        for (int i = 0; i < data.length - 1; i += 2) {
            char tmp = data[i];
            data[i] = data[i + 1];
            data[i + 1] = tmp;
        }
        email.setText(new String(data));
        return email;
    }
}
