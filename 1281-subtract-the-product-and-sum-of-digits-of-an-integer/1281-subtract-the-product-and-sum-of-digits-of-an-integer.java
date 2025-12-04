class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, m;
        int prod = 1;
        while(n > 0) {
            m = n % 10;
            sum += m;
            prod *= m;
            n /= 10;
        }
        return (prod - sum);
    }
}