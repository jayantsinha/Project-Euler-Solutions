/**
 * Project Euler Problem 30
 *
 * by Jayant Sinha
 * 
 */
public class P30 {

    public boolean isValid(int num) {
        String str = String.valueOf(num);
        int arr[] = new int[str.length()];
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = (int) Math.pow(Character.digit(str.charAt(i), 10), 5);
            sum += arr[i];
        }
        return (sum == num) ? true : false;
    }

    public static void main(String[] r) {
		// The upper bound is 6*9^5 = 354294
        int upper = 354294;
        int sigma = 0;
        P30 p = new P30();
        long start = System.currentTimeMillis();
        for (int i = 12; i <= upper; i++) {
            if (p.isValid(i)) {
                sigma += i;
            }
        }
        long end = System.currentTimeMillis() - start;
        System.out.println(sigma);
        System.out.println(end);
    }
}