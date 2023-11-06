/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.pos;

public class AllProduct implements Counter {
    @Override
    public int getAmount(Product product) {
        return 1;
    }
}
