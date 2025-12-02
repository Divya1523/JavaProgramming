class Solution {
    public boolean isHappy(int n) {
        while(n > 4) {
            n = sumn(n);
        }
        return n == 1;
    }

     int sumn(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}