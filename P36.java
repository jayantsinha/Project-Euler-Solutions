/** 
 * Project Euler #36 solution
 *
 * by Jayant Sinha
 * 
 */
 
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

public class P36 {

    public BigInteger toBinary(int num) {
        return new BigInteger(Integer.toBinaryString(num));
    }

    public boolean isPalindrome(int num) {
        boolean bool;
        String rev = new String(new StringBuffer(String.valueOf(num)).reverse());
        int reverse = Integer.parseInt(rev);
        if (reverse == num) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public boolean isPalindrome(BigInteger NUM) throws UnsupportedEncodingException {
        boolean bool;
        BigInteger R;
        String r = new String(new StringBuffer(NUM.toString()).reverse());
        R = new BigInteger(r);

        if (R.equals(NUM)) {
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    public static void main(String[] sd) throws IOException {
        P36 prob = new P36();
        long sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 1; i < 100000000; i++) {
            if (prob.isPalindrome(i) && prob.isPalindrome(prob.toBinary(i))) {
                sum += i;
            }
        }
        long stop = System.currentTimeMillis() - start;
        System.out.println(sum);
        System.out.println(stop);

    }
}
// Answer: 872187
// time: 576ms