import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int gugudan = sc.nextInt();
        int ans = 0;

        for(int i = 1; i<=9; i++){
            ans = gugudan * i;
            System.out.println(gugudan + " * "+ i +" = "+ans);
        }
    }
}