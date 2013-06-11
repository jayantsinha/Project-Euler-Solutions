/** 
 * Project Euler #56 solution
 *
 * by Jayant Sinha
 * 
 */

import java.math.BigInteger;

public class P56 {
    
    public BigInteger digitalSum(String str){
        BigInteger sum = BigInteger.valueOf(0);
        char ch[] = new char[str.length()];
        for (int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
            sum = BigInteger.valueOf(Character.getNumericValue(ch[i])).add(sum);
        }
        
        return sum;
    }

    public static void main(String[] args) {
        BigInteger sm[] = new BigInteger[100];
        BigInteger msm = BigInteger.valueOf(0);
        P56 p = new P56();
        String str;
        CharSequence ch;
        int count = 0;
        for (int i = 90; i < 100; i++) {
            for (int j = 90; j < 100; j++) {
                str = (BigInteger.valueOf(i).pow(j)).toString();
                sm[count] = p.digitalSum(str);
                
                if (sm[count].compareTo(msm)>0) msm = sm[count];
                count++;
            }
        }
        System.out.println(msm);
    }
}
