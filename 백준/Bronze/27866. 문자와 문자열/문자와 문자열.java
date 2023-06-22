import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int num = sc.nextInt();

        String[] word = S.split("");

        System.out.println(word[num-1]);
    }
}