package Patterns.LLD_Problems.Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public static void main(String[] args){
        int[] nums={1,3,2,4,5,7,9,8,6};
        int n=nums.length;
        mSort(nums,0,n-1);
        for(int e : nums){
            System.out.print(e+" ");
        }

    }
    public static void mSort(int[] nums,int lo,int hi){
        if(lo==hi)return;
        int mid=lo+(hi-lo)/2;
        mSort(nums,lo,mid);
        mSort(nums,mid+1,hi);
        merge(nums,lo,mid,hi);
    }
    public static void merge(int[] nums,int lo,int mid,int hi){
        int left=lo;
        int right=mid+1;
        List<Integer> ans=new ArrayList<>();
        while(left<=mid && right<=hi){

            if(nums[left]<=nums[right]){
                ans.add(nums[left]);
                left++;
            }else{
                ans.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            ans.add(nums[left]);
            left++;
        }
        while(right<=hi){
            ans.add(nums[right]);
            right++;
        }
//        System.out.println(ans);
        for( int i=lo;i<=hi;i++){
            nums[i]=ans.get(i-lo);
        }
    }

}
