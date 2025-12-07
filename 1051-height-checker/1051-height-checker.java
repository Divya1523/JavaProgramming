class Solution {
    public int heightChecker(int[] heights) {
        int c = 0;
        int[] j = new int[heights.length];
        for(int i = 0;i<heights.length;i++){
            j[i] = heights[i];
        }
        Arrays.sort(j);
        for(int i = 0;i<heights.length;i++){
            if(j[i]!=heights[i]) c++;
        }
        return c;
    }
}