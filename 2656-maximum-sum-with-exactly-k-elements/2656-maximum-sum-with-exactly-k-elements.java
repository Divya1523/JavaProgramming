class Solution {
    public int maximizeSum(int[] nums, int k) {
        int s = 0;
        int max = Arrays.stream(nums).max().getAsInt();
        for(int i = 0; i < k; i++){
            s += max + i;
        }
        return s;
    }
}