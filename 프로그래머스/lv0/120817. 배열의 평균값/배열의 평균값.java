class Solution {
    public double solution(int[] numbers) {
        double result = 0;
        for(double aver : numbers){
            result += aver;
        }
        return result/(numbers.length);
    }
}