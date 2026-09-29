//This problem discusses the "hashmap" method.
//Hashmap contains array of elements(i.e) main element with its compliment.
//index starts from 0,,indices are mainly used for this hashmap solving.

//Here I am using normal arr method.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr =new int[2];
        int i,j;

        for(i=0;i<nums.length;i++){
            for(j=i+1;j<nums.length;j++){
                if (nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }
            }
        }
        return arr;
    }
}