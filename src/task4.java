import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N;i++){
            int x =in.nextInt();
            arr[i]=x;
        }
        int sum=0;
        for(int i=0; i<N;i++){
            if (arr[i]>0){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
