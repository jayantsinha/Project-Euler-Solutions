/** 
 * Project Euler #16 solution
 *
 * by Jayant Sinha
 * 
 */
 
import java.math.BigInteger;


public class P16 {
    
    public static void main(String[] args)throws Exception{
        BigInteger bigpow = BigInteger.valueOf(2);
        BigInteger w = bigpow.pow(1000);
        char c[] = w.toString().toCharArray();
        int sum = 0;
        for (int i=0;i<c.length;i++){
            sum = sum+Character.getNumericValue(c[i]);
        }
        System.out.println(sum);
    }
    
}
