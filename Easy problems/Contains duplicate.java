class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> s = new HashMap<>();

        for(int i=0 ; i< nums.length ; i++){
            if (s.containsKey(nums[i])){
                return true;
            }
            else{
                s.put(nums[i],i);
            }
        }
        return false;
    }
}