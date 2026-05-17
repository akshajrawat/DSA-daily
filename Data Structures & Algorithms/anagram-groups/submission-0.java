class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        List<String> seen = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            List<String> sub = new ArrayList<>();
            String curr = strs[i];
            char[] arr = curr.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            sub.add(strs[i]);

            if(seen.contains(key)) continue;

            for (int j = i + 1; j < strs.length; j++) {
                String curr2 = strs[j];
                char[] arr2 = curr2.toCharArray();
                Arrays.sort(arr2);
                boolean isAnagram = true;

                if (arr.length != arr2.length) {
                    isAnagram = false;
                } else {
                    for (int k = 0; k < arr.length; k++) {
                        if (arr[k] != arr2[k]) {
                            isAnagram = false;
                            break;
                        }
                    }
                }

                if (isAnagram) {
                    sub.add(strs[j]);
                }
            }

            ans.add(sub);
            seen.add(key);
        }

        return ans;
    }
}
