import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // long int = 4바이트

        int size = sc.nextInt();
        String save = "";

        for(int i = 0; i < size/4; i++) {
            save += "long ";
        }
        System.out.println(save+"int");
    }
}