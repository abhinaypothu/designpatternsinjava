package com.dp.behavioural.strategy;

public class MergeSortStrategy implements SortStrategy{
    private void merge(int[] arr, int low ,int high){
        int mid = (low+high)/2;
        int temp[] = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        for(i=low;i<=high;i++){
            arr[i] = temp[i-low];
        }
    }
    private void mergeSort(int[] arr, int low, int high){
     if(low<high)
     {
         int mid = (low+high)/2;
         mergeSort(arr,low,mid);
         mergeSort(arr,mid+1,high);
         merge(arr,low,high);
     }

    }
    @Override
    public int[] sort(int[] arr) {
        mergeSort(arr,0,arr.length-1);
        return arr;
    }
}
