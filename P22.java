/** 
 * Project Euler #22 solution
 *
 * by Jayant Sinha
 * 
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class P22 {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new File("names.txt")).useDelimiter("[\",]+");
        ArrayList<String> text = new ArrayList<String>();
        while (in.hasNext()) {
            text.add(in.next());
        }
        Collections.sort(text);
        Iterator itr = text.iterator();
        String str = "";
        long soln=0;
        int sum =0;
        int ind =1;
        while (itr.hasNext()){
            str = String.valueOf(itr.next());
            sum=0;
            for (int i = 0; i<=str.length()-1;i++){
                sum += str.charAt(i)%65+1;
            }
            soln += sum*ind;
            ind++;
        }
        System.out.println(soln);
    }
}
