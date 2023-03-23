import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int lastNum = numbers[numbers.length-1];
        int num = numbers[numbers.length-2];
        return lastNum * num;
    }
}