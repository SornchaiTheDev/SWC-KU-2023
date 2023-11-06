/**
 * @ชื่อ นายศรชัย สมสกุล
 * @รหัสนิสิต 6510405814
 */

package interfaceI;

public class Data {
    public static double min(Min[] datas) {
        double min = datas[0].getMin();
        for (Min data : datas) {
            if (data.getMin() < min) {
                min = data.getMin();
            }
        }
        return min;
    }

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < a.length; j++) {
                if(a[j].compareTo(a[minPos]) < 0) {
                minPos = j;
                }
            }
            swap(a,i,minPos);
        }
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

}
