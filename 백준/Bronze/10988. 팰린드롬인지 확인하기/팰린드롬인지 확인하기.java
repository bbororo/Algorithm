import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        String reverse ="";
        for(int i = S.length()-1; i >=0 ;i--){
            reverse += S.charAt(i);
        }

        System.out.println(reverse.equals(S)?1:0);
    }
}