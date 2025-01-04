package Patterns.LLD_Problems.Sorting;

public class SelectionSort {
    public static void main(String[] args){
        int[] nums={5,2,3,1,7,6,4};
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            int idx=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[idx]){
                    idx=j;
                }
            }
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
        }
        for(int e : nums){
            System.out.print(e+" ");
        }
    }
}
