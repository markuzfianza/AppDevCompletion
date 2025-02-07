package hello;
public class ReducebuGrow {
    public static int grow(int[] x) {
       
        int a = 0;
        int b = 1;

        for(int y = 0 ; y < x.length; y ++){
            a = x[y];
            b = b * a;
        }
        return b;
    }
}
