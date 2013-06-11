/** 
 * Project Euler #52 solution
 *
 * by Jayant Sinha
 * 
 */

import java.util.HashMap;

public class P52 {

    public boolean isSimilar(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        for (char c : first.toCharArray()) {
            if (hash.get(c) != null) {
                int count = hash.get(c);
                count++;
                hash.put(c, count);
            } else {
                hash.put(c, 1);
            }
        }
        for (char c : second.toCharArray()) {
            if (hash.get(c) != null) {
                int count = hash.get(c);
                count--;
                if (count < 0) {
                    return false;
                }
                hash.put(c, count);
            } else {
                return false;
            }
        }
        for (Integer i : hash.values()) {
            if (i.intValue() != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        P52 p = new P52();
        for (int i = 11;;i++){
            if(p.isSimilar(String.valueOf(i), String.valueOf(i*2)) && p.isSimilar(String.valueOf(i), String.valueOf(i*3)) && p.isSimilar(String.valueOf(i), String.valueOf(i*4)) && p.isSimilar(String.valueOf(i), String.valueOf(i*5)) && p.isSimilar(String.valueOf(i), String.valueOf(i*6))){
                System.exit(i);
            }
        }
    }
}
