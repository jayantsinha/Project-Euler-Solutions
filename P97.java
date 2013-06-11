/** 
 * Project Euler #97 solution
 *
 * by Jayant Sinha
 * 
 */
 
import java.math.BigInteger;

public class P97 {
    public static void main(String[] a) throws Exception {
        long m = 10000000000l;
        BigInteger mm = BigInteger.valueOf(m);
        BigInteger expo = BigInteger.valueOf(7830457);
        BigInteger b = BigInteger.valueOf(2).modPow(expo, mm);
        b= b.multiply(BigInteger.valueOf(28433));
        System.out.println(b);
    }
}
