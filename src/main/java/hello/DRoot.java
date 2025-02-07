package hello;

public class DRoot {
    public static int digital_root(int s){
        if (s < 0) {
            s = -s;
        }

        while (s >= 10) {
            int add = 0;
            int n = s;

            
            while (n > 0) {
                add += n * 10;
                n/=10;
            }
            s = add;
        }
        return s;
    }
}
