
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numOfTest = sc.nextInt();
        int a[] = new int[numOfTest];
        int b[] = new int[numOfTest];
        int n[] = new int[numOfTest];
        for (int i = 0; i< numOfTest;i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            n[i] = sc.nextInt();
        }

        for (int i=0;i<numOfTest;i++){
            int num = n[i];
            for(int j=1;j<=num;j++){
                int  multplus = 0;
                for(int k=0;k<j;k++){
                    multplus += (Math.pow(2,k)) * b[i];
                }
                System.out.print(a[i]+multplus+" ");
            }
            System.out.println();
        }
    }
}