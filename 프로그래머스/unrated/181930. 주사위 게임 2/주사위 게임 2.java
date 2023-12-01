class Solution {
    public int solution(int a, int b, int c) {
        double plus = a + b + c;
        double two = (Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        double three = (Math.pow(a,3) + Math.pow(b,3) + Math.pow(c,3));

        if (a == b && b == c && a == c) return (int)(plus*two*three);
        else if (a !=b && b!= c && a!=c) return (int)(plus);
        else return (int)(plus * two);
    }
} 