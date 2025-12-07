class Solution {
    public int smallestIndex(int[] nums) {
        int res = -1;
        for(int i = 0; i < nums.length; i++) {
            int s = sum(nums[i]);
            if(s == i) {
                res = i;
                break;
            }
        }
        return res;
    }
    private int sum(int i){
        int s = 0;
        while(i > 0){
            int t = i % 10;
            s += t;
            i /= 10;
        }
        return s;
    }
}