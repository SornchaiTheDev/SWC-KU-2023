/**
 *
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 *
 */

package strategy.pos;

public class Instock implements Counter {
    @Override
    public int getAmount(Product product) {
        return product.getQuantity() > 0 ? 1 : 0;
    }
}
