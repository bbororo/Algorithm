class Solution {
    public int solution(int a, int b) {
        
        String afirst = Integer.toString(a) + Integer.toString(b);
        String bfirst = Integer.toString(b) + Integer.toString(a);
        
        int aint = Integer.parseInt(afirst);
        int bint = Integer.parseInt(bfirst);
        
        if( aint > bint) return aint;
        else if(bint > aint) return bint;
        else return aint;
    }
}