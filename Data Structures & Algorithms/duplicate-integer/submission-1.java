class Solution {
    public boolean hasDuplicate(int[] nums) {
        // ArrayList<> storedNums = Arrays.asList(nums);
        // set has unique values only
        Set uniqueNums = new HashSet<>();
        for (int num: nums) {
            uniqueNums.add(num);
        }
        System.out.println(uniqueNums.size());
        return nums.length != uniqueNums.size();  
    }
}