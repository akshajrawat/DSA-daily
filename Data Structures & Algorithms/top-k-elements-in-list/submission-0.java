class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int elem : nums){
            map.put(elem, map.getOrDefault(elem, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            list.add(new int[]{entry.getKey(), entry.getValue()});
        }

        list.sort((a,b) -> b[1] - a[1]);

        int[] result = new int[k];
        for(int i = 0; i < k; i++){
            result[i] = list.get(i)[0];
        }

        return result;
    }
}
