import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N;i++){
            int x =in.nextInt();
            arr[i]=x;
        }
        int max=arr[0];
        for(int i=1; i<N;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
