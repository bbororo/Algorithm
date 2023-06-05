import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int kind = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= kind ; i++){
            int price = sc.nextInt();
            int cnt = sc.nextInt();
            sum = sum + (price * cnt);
        }
        System.out.println((total==sum)? "Yes" : "No");
    }
}