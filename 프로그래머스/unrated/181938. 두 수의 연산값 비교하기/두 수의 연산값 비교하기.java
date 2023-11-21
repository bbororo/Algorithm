class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int ajoin = Integer.parseInt(a+""+b);
        int gob = 2 * a * b;
        
        return (ajoin >= gob) ? ajoin : gob;
    
    }
}