
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        boolean ans = false;

        for(int num : nums){
            if(set.contains(num)){
                ans = true;
                break;
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}