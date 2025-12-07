class Solution {
    public int countSeniors(String[] details) {
        int c = 0;
        for(int i = 0; i < details.length; i++){
            int t = details[i].charAt(11) - '0';
            int o = details[i].charAt(12) - '0';
            int age = (t*10) + o;
            if(age > 60) c++;
        }
        return c;
    }
}