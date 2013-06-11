/** 
 * Project Euler #48 solution
 *
 * by Jayant Sinha
 * 
 */

import java.math.BigInteger;

public class P48 {

    public static void main(String[] ar) throws Exception {
        BigInteger seq = BigInteger.valueOf(0);
        int count = 1;
        while (count <= 1000) {
            seq = BigInteger.valueOf(count).pow(count).add(seq);
            count++;
        }
        for (int i=seq.toString().length()-10; i<seq.toString().length(); i++){
            System.out.print(seq.toString().charAt(i));
        }
    }
}
