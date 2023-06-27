
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //바구니 수
        int M = Integer.parseInt(st.nextToken()); // 공 넣는 방법
        int[] basket = new int[N];

        for(int i = 0;i < M;i++) {
            st = new StringTokenizer(br.readLine());
            int fist = Integer.parseInt(st.nextToken()); // 1 바구니
            int last = Integer.parseInt(st.nextToken()); // last 바구니
            int ball = Integer.parseInt(st.nextToken()); // 공 번

            for (int j = fist - 1; j < last; j++) {
                basket[j] = ball;
            }
        }
        for(int i = 0 ;i < basket.length; i++){
            bw.write(basket[i] + " ");
        }
        bw.close();
    }
}
