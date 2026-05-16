class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] list = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            list[i][0] = nums[i];
            list[i][1] = i;
        }

        Arrays.sort(list, Comparator.comparingInt(a -> a[0])); 
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int sum = list[start][0] + list[end][0];

            if (sum == target) {
                return new int[] {
                    Math.min(list[start][1], list[end][1]), Math.max(list[start][1], list[end][1])
                };
            } else if (sum < target){
                start++;
                continue;
            } else if (sum > target){
                end--;
                continue;
            }
        }

        return new int[0];
    }
}
