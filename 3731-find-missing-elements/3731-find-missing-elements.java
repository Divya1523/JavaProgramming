class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        Arrays.sort(nums);
        int i = 0;
        for (int j = min; j <= max; j++) {
            if (i < nums.length && nums[i] == j) {
                i++;
            } else {
                list.add(j); 
            }
        }
        return list;
    }
}
