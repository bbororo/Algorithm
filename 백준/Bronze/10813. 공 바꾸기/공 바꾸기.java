
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // 1-N번호 매김, 공이 1개씩, 처음엔 바구니번호=공번호, 공 바꿀 바구지2개선택, 두개 공 교환
        //

        int N = Integer.parseInt(st.nextToken()); // 바구니 갯수
        int M = Integer.parseInt(st.nextToken());
        int[] basket = new int[N];

        for(int i = 0;i<N;i++){
            basket[i] = i+1;
        }

        for(int i = 0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int temp = basket[I-1];

            basket[I-1] = basket[J-1];
            basket[J-1] = temp;
        }
        for(int i =0;i < N ;i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
