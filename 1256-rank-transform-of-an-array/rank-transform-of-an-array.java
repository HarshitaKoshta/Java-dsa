class Solution {
    public int[] arrayRankTransform(int[] arr) {
    int[] sorted = arr.clone();
    Arrays.sort(sorted);
    
    HashMap<Integer, Integer> map = new HashMap<>();
    int rank = 1;
    for (int val : sorted) {
        if (!map.containsKey(val)) {
            map.put(val, rank);  
            rank++;               
        }
    }
    
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
        result[i] = map.get(arr[i]);  
    }
    return result;
}
}