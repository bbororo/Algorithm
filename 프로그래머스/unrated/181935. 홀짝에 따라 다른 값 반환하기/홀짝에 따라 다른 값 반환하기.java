class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n % 2 == 0){
           for(int i = n ; i > 0 ; i-- ) {
               if(i % 2 == 0){
                   answer += (i*i);
               }
           }
        }
        else {
            for(int j = n ; j > 0 ; j-- ) {
               if(j % 2 != 0){
                   answer += j;
                }
            }
        }
        return answer;
    }
            
}