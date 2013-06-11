/** 
 * Project Euler #21 solution
 *
 * by Jayant Sinha
 * 
 */
 
public class P21 {
    
    public int d(int a){
        int sum = 0;
        for (int i=1;i<=a/2;i++){
            if (a%i==0) sum = sum+i;
        }
        return sum;
    }
    public static void main(String[] args){
        P21 p = new P21();
        int sum = 0;
        int num1=0, num2=0;
        for (int i=1;i<=10000;i++){
            num1 = p.d(i);
            num2 = p.d(num1);
            if (num2==i && i!=num1) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
