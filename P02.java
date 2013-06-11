/** 
 * Project Euler #02 solution
 *
 * by Jayant Sinha
 * 
 */

public class P02 {
    public static void main(String[]p){
        long curr =1;
        long prev=0;
        long sum = 0;
        long even=0;
        for (int i=1;;i++){
            sum = prev+curr;
            prev = curr;
            curr = sum;
            if (sum<4000000&&sum%2==0){
                even = even+sum;
            } else if (sum>4000000) {
                System.out.println(even);
                System.exit(1);
            }
        } 
    }
}
