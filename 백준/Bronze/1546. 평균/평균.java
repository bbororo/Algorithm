import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());  // 과목ㄱ 갯수
        double[] credit = new double[N];
        double max = credit[0];
        double sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i < N ;i++){
            credit[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0 ; i < N ; i++) {
            if (credit[i] > max) {
                max = credit[i];
            }
        }

        for(int i = 0;i < N ;i++){
            credit[i] = (credit[i]/max)*100;
            sum += credit[i];
        }

        System.out.println(sum/N);

    }
}