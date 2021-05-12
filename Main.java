import java.util.Scanner;

/**
 * Main
 */
public class Main {


    public static int equality(int x, int n, int modulo) {
        int res = 1;
        x = x % modulo;
        if  (x == 0) {
            return 0;
        }
        
        while (n > 0) {
            if((n & 1) != 0) {
                res = (res * x) % modulo ;
            }   

            n = n >> 1 ;
            x = (x * x) % modulo ;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int n = sc.nextInt();
            int modulo = 1000000007 ;
            int result = equality(2, n-1, modulo);
            System.out.println(result);
        }
    }
}