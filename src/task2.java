import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N;i++){
            int x =in.nextInt();
            arr[i]=x;
        }
        for(int i=0; i<N;i++){
            if (i%2==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
