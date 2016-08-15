import java.util.Scanner;

/**
 * Created by geniushkg on 8/13/2016.
 */
public class RecursionD9 {
    public static void main(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = factorial(n);
        System.out.println("Answer is : "+ans);
    }
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
