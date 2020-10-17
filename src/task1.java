import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
        int D=in.nextInt();
        int arr[] = new int[N];
        //создание
        for(int i=1; i<=N; i++){
            arr[i-1]=i;
        }
        int c=0;
        int copyarr[] = new int[B-A+1];
        for (int i=B-1; i>=A-1; i--){

            copyarr[c]=arr[i];
            c++;

        }
       // System.out.println(Arrays.toString(copyarr));
        for (int i=A-1; i<B; i++){

            arr[i]=copyarr[i-(A-1)];

        }
        //System.out.println(Arrays.toString(arr));
        int j=0;
        int copyarr2[] = new int[D-C+1];
        for (int i=D-1; i>=C-1; i--){

            copyarr2[j]=arr[i];
            j++;

        }
        //System.out.println(Arrays.toString(copyarr2));
        for (int i=C-1; i<D; i++){

            arr[i]=copyarr2[i-(C-1)];

        }
        //System.out.println(Arrays.toString(arr));
        for (int i=0; i<N; i++){
            System.out.print(arr[i]+" ");
        }



    }
}
