class Solution {
    public int totalMoney(int n) {
        int x = n / 7;
        int y = n % 7;
        int s = 0;
        for(int i = 0; i < x; i++) {
            s += 7 * (i+1) + 21;
        }
        
        for(int d = 0; d < y; d++){
            s += d + (x+1);
        }
        return s;
    }
}