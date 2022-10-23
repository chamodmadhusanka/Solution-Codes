package test;

public class Test {
    public static void main(String[] args){
        int b = 2;
        String[] s = new String[b];

        String c ="";
        for (int i = 1; i <= b; i++){
            c += Integer.toString(i);
        }

        char[] set = c.toCharArray();
        System.out.println(set);
    }
}
