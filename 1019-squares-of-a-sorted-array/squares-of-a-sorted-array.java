class Solution {
    public int[] sortedSquares(int[] nums) {
        int n= nums.length;
        for(int i=0;i<n;i++){
            nums[i]= nums[i]*nums[i];
        }
        int arr[]= new int [n];
        int i=0;
        int j=n-1;
        for(int pos=n-1; pos>=0;pos--){
            if(nums[i] > nums[j]){
                arr[pos]=nums[i];
                i++;
            }
            else{
                arr[pos]=nums[j];
                j--;
            }
        }
        return arr;
    }
}