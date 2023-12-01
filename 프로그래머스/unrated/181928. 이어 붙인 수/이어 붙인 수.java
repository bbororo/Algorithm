class Solution {
    public int solution(int[] num_list) {
        String num = "";
        String even = "";
        String hol = "";
        for (int i = 0 ; i < num_list.length ; i++){
            if (num_list[i] % 2 == 0){
                even += num_list[i];
                String.join("", even);
            }
            else {
                hol += num_list[i];
                String.join("", hol);
            }
        }
        return Integer.valueOf(even) + Integer.valueOf(hol);
    }
}