class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=i+1;
        int result = 1;
        while(j<n){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                j++;
                result++;
            }
        }
        return result;
    }
}