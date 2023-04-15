class Solution {
    public int solution(int[] array) {
        int answer = array[0];
        int max = 0; int fre[] = new int[1000];
        
        for(int i = 0; i < array.length; i++) {
            fre[array[i]]++;
            
            if(max < fre[array[i]]) {
                max = fre[array[i]];
                answer = array[i];
            }
        }
        
        int temp = 0;
        for(int j = 0; j < 1000; j++) {
            if(max == fre[j]) temp++;
            if(temp > 1) answer = -1;
        }
        
        return answer;
    }
}