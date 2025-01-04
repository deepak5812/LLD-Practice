package Patterns.LLD_Problems.Sorting;

public class BubbleSort {
    public static void main(String[] args){
        int[] nums={5,2,3,1,7,6,4};
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        for(int e : nums){
            System.out.print(e+" ");
        }
    }
}
