/** 
 * Project Euler #29 solution
 *
 * by Jayant Sinha
 * 
 */


import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;

public class P29 {

    public static void main(String[] args) throws IOException {
        HashSet<BigInteger> hs = new HashSet<BigInteger>();
        BigInteger A;
        for (long a = 2; a<=100;a++){
            for (int b=2;b<=100;b++){
                A = BigInteger.valueOf(a);
                hs.add(A.pow(b));
            }
        }
        Iterator itr = hs.iterator();
        int sum = 0;
        while(itr.hasNext()){
            sum+=1;
            itr.next();
        }
        System.out.println(sum);
    }
}