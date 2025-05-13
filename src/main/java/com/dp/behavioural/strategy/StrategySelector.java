package com.dp.behavioural.strategy;

public class StrategySelector {
    SortStrategy strategy;
    StrategySelector(SortStrategy strategy)
    {
        this.strategy = strategy;
    }
    public int[] sort(int[] arr){
        return strategy.sort(arr);
    }

    public static void main(String[] args) {
        int arr[] = {33,22,11,0,99,467};
        StrategySelector ss = new StrategySelector(new MergeSortStrategy());
        arr = ss.sort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\n-----------");
        int arr2[] = {33,22,11,0,99,467};
        ss = new StrategySelector(new SelectionSort());
        arr2 = ss.sort(arr2);
        for(int i:arr2){
            System.out.print(i+" ");
        }
        System.out.println("\n-----------");

        int arr3[] = {33,22,11,0,99,467};
        ss = new StrategySelector(new BubbleSortStrategy());
        arr3 = ss.sort(arr3);
        for(int i:arr3){
            System.out.print(i+" ");
        }
        System.out.println("\n-----------");
    }
}
