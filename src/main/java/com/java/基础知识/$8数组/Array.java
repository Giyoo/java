package com.java.基础知识.$8数组;


/**
 * Created by banma on 2018/9/17.
 */
public class Array {

    //取最值
    private static int findMax(int[] arr){
        int firstNum = 0;
        for (int i = 1;i<arr.length;i++){
            if (arr[firstNum] < arr[i]){
                firstNum = i;
            }
        }
        return arr[firstNum];
    }
    //选择排序
    private static void selectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    //冒泡排序
    private static void bubbleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j = i;j<arr.length-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
    //二分查找
    private static int binSearch(int[] arr,int key){
        int min,mid,max;
        min = 0;
        max = arr.length - 1;
        mid = (min+max)/2;
        while (key != arr[mid]){
            if (key > arr[mid]){
                min = mid+1;
            }else if(key < arr[mid]){
                max = mid-1;
            }

            mid = (min+max)/2;
            if (min>max){
                return -1;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        int[] arr = {4,47,23,90,33,23,56,56};
        System.out.println("最大值"+findMax(arr));

        System.out.println("选择排序：");
//        selectionSort(arr);
        for (int a:arr){
            System.out.print(a+",");
        }

        System.out.println("冒泡排序：");
        bubbleSort(arr);
        for (int a:arr){
            System.out.print(a+",");
        }

        System.out.println("二分查找：" + 47);
        System.out.println(binSearch(arr,47));
    }
}
