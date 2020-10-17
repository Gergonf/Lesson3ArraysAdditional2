import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N;i++){
            int x =in.nextInt();
            arr[i]=x;
        }
        int sum=1;
        for(int i=1; i<N;i++){
            if (arr[i]!=arr[i-1]){
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}
