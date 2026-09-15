class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int sum = -nums[i];
            int left= i+1;
            int right =n-1;
            while(left<right){
                if(nums[left]+nums[right]==sum){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                while(left<n && nums[left] == nums[left-1] ){
                left++;
                }
                while(right>=0 && nums[right]==nums[right+1]){
                right--;
            }
                }
                else if(nums[left]+nums[right] < sum){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return list;
    }
}
 