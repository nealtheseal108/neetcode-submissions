class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ArrayList<> storedNums = Arrays.asList(nums);
        // set has unique values only
        // specify type of set - don't use polymorphism for fastest and don't leave in system out println
        // specify in generics
        HashSet<Integer> uniqueNums = new HashSet<Integer>();
        for (int num: nums) {
            uniqueNums.add(num);
        }
        return nums.length != uniqueNums.size();  
    }
}