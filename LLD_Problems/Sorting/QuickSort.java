package Patterns.LLD_Problems.Sorting;

public class QuickSort {

    public static void main(String[] args){
        int[] nums={1,3,2,4,5,7,9,8,6};
        int n=nums.length;
        quickSort(nums,0,n-1);
        for(int e : nums){
            System.out.print(e+" ");
        }
    }
    public static void quickSort(int[] nums, int lo,int hi){
        if(lo>=hi)return;
        int left=lo;
        int right=hi;
        int mid=lo+(hi-lo)/2;
        int pivot=nums[mid];
        while(left<=right){

            while(nums[left]<pivot){
                left++;
            }
            while(nums[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
        }
        quickSort(nums,lo,right);
        quickSort(nums,left,hi);
    }
}
