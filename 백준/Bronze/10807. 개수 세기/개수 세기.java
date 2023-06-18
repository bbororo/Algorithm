import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // n = 정수의 갯수
        //  찾으려는 정수 v . 문제 ": 정수v가 몇개인지 찾아라
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] array = new int[num];
        int cnt = 0;

        for(int i = 0; i < num; i++){
            array[i] = sc.nextInt();
        }
        int v = sc.nextInt();

        for(int i = 0 ;i < num; i++){
            if(array[i]== v){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}