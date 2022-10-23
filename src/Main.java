import java.util.*;
import java.lang.*;


class Main {
    public static int count = 0;
    public static void main (String[] args) throws java.lang.Exception {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        String c ="";

        for (int i = 1; i <= b; i++){
            c += Integer.toString(i);
        }
        char[] set = c.toCharArray();
        int k = a;
        printAllKLength(set, k);
        System.out.println(count);

    }

    public static void printAllKLength(char[] set, int k){
        int n = set.length;
        printRec(set, "", n, k);


    }
    public static void printRec(char[] set, String prefix, int n, int k){

        if (k == 0) {
            int a = prefix.length();
            if (check(prefix, a)){
                count++;
            }else{}
            return;
        }

        for (int i = 0; i < n; ++i){
            String newPrefix = prefix + set[i];

            printRec(set, newPrefix, n, k - 1);

        }

    }
    // check whether if given string can be split into any number of contiguous
    // subsequences of even length, each one being a palindrome
    public static boolean check(String s, int n){
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < n; i++){
            if(!st.isEmpty() && st.peek() == s.charAt(i)){
                st.pop();
            }else{
                st.add(s.charAt(i));
            }
        }
        if (st.isEmpty()){
            return true;
        } else{
            return false;
        }
    }


}