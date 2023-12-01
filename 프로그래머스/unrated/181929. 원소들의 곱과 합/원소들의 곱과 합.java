class Solution {
    public int solution(int[] num_list) {
        int hab = 0;
        int gob = 1;
        for ( int i = 0 ; i< num_list.length ; i++){
            hab += num_list[i];
        }
        for (int i = 0 ; i< num_list.length ; i++){
            gob *= num_list[i];
        }
        return gob < (hab*hab) ? 1 :0;
    }
}