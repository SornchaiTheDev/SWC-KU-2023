/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceII;

import java.util.Comparator;

public class Data {

    public static <T> T min(T[] datas, Comparator<T> comparator) {
        T min = datas[0];
        for (T item : datas) {
            if (comparator.compare(item, min) < 0) {
                min = item;
            }
        }

        return min;
    }

}
