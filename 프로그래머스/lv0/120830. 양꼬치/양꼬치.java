class Solution {
    public int solution(int n, int k) {
        int sheep = 12000*n;
        int sale = n/10;
        int coke = 2000*(k-sale);
        return sheep + coke;
    }
}