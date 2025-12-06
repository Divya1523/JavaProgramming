class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        int dsum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            dsum += digit(nums[i]);
        }
        return Math.abs(sum - dsum);
    }
    private int digit(int n) {
        int s = 0;
        while(n > 0){
            int d = n % 10;
            s += d;
            n /= 10;
        }
        return s;
    }
}