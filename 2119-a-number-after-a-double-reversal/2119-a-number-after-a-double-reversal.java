class Solution {
    public boolean isSameAfterReversals(int num) {
        int r1, r2;
        r1 = reverse(num);
        r2 = reverse(r1);
        if(r2 == num) return true;
        else return false;
    }
    private int reverse(int n) {
        int t, m = 0;
        while(n > 0) {
            t = n % 10;
            m = (m*10) + t;
            n /= 10;
        }
        return m;
    }
}