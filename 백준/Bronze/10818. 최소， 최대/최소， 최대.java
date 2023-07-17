import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] num =  new int[N];

        for(int i = 0;i < N;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(num);

        System.out.println(num[0]+" "+num[num.length-1]);
    }
}