class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1;
            int end = nums.length - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                if (sum == 0) {
                    List<Integer> tmp = Arrays.asList(nums[i], nums[start], nums[end]);
                    ans.add(tmp);
                    start++;
                    end--;
                    continue;
                }
                if (sum < 0) {
                    start++;
                    continue;
                }
                if (sum > 0) {
                    end--;
                    continue;
                }
            }
        }

        return new ArrayList(ans);
    }
}
