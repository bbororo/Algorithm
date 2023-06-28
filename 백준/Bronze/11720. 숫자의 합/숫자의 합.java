import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String num = br.readLine();
        String[] arr = num.split("");
        int sum = 0;

        for(int i = 0 ; i<arr.length;i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}