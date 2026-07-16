class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int zero_cnt = 0;
        int index = 0;
        int prdct = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero_cnt++;
                index = i;
            } else {
                prdct *= nums[i];
            }
        }

        if (zero_cnt > 1)
            return output;

        if (zero_cnt == 1) {
            output[index] = prdct;
            return output;
        }

        for (int i = 0; i < nums.length; i++) {
            output[i] = Math.floorDiv(prdct, nums[i]);
        }

        return output;
    }
}
