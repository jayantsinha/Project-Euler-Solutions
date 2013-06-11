/** 
 * Project Euler #14 solution
 *
 * by Jayant Sinha
 * 
 */

import java.util.LinkedList;

public class P14 {

    public static void main(String[] args) {
        long max = 0;
        long val = 0;
        int res = 0;
        LinkedList<Long> list = new LinkedList<Long>();
        for (int i = 1; i <= 1000000; i++) {
            val = i;
            while (val != 1) {
                if (val % 2 == 0) {
                    val /= 2;
                    list.add(val);
                } else {
                    val = (3 * val) + 1;
                    list.add(val);
                }
            }
            if (list.size() > max) {
                max = list.size();
                res = i;
            }
            list.clear();

        }
        System.out.print(res);
    }
}
