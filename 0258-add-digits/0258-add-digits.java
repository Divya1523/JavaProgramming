class Solution {
    public int addDigits(int num) {
        int n = num;
        while(num >= 10) {
            int s = 0;
            while(num > 0){
                int t = num % 10;
                s += t;
                num /= 10;
            }
            num = s;
            n = s;
        }
        return n;
    }
}