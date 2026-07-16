class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] out = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int preEl = 1;
            int suffEl = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                } else if (j < i) {
                    preEl *= nums[j];
                } else if (j > i) {
                    suffEl *= nums[j];
                }
            }

            out[i] = preEl * suffEl;
        }

        return out;
    }
}
