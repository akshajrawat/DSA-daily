class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // add all the elements in the set
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i] - 1)) {
                continue;
            }

            boolean isCon = true;
            int curr = nums[i];
            int tempLen = 1;
            while (isCon) {
                if (set.contains(curr + 1)) {
                    curr++;
                    tempLen++;
                    continue;
                } else {
                    isCon = false;
                }
            }

            longest = Math.max(longest, tempLen);
        }

        return longest;
    }
}
