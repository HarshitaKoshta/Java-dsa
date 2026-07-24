class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i = 0; i < list1.length; i++) {
        map.put(list1[i], i);  // ✅ string → index
    }
    
    List<String> result = new ArrayList<>();
    int minSum = Integer.MAX_VALUE;
    
    for (int j = 0; j < list2.length; j++) {
        if (map.containsKey(list2[j])) {           
            int idxSum = map.get(list2[j]) + j;   
            if (idxSum < minSum) {
                minSum = idxSum;
                result.clear();                     
                result.add(list2[j]);              
            } else if (idxSum == minSum) {
                result.add(list2[j]);              
            }
        }
    }
    return result.toArray(new String[0]);
}
}