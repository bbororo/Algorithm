class Solution {
    public int solution(int n) {
        int result=0;
        while(0 != n){
            result += n%10;
            n /= 10;
        }
        return result;
    }
}