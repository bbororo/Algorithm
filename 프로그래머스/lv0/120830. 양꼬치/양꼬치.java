class Solution {
    public int solution(int n, int k) {
        int sheep = n * 12000;
        int sale = n/10;
        int drink = (k-sale) * 2000;
        return sheep + drink;
    }
}