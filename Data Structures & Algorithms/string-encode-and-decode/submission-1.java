class Solution {
    public String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str.length()).append("#").append(str);
        }
        return result.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> result = new ArrayList<>();

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            result.add(str.substring(j + 1, j + 1 + length));
            i = j + 1 + length;
        }
        return result;
    }
}
