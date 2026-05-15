class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Boolean ans = true;

        if(arr1.length != arr2.length){
            return false;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] == arr2[i]){
                continue;
            } else {
                ans = false;
                break;
            }
        }

        return ans;
    }
}
