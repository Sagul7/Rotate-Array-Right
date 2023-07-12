import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotateArray(array,0, array.length-1);
        rotateArray(array,0,k-1);
        rotateArray(array,k, array.length-1);

        for(int result : array)
        {
            System.out.print(result+" ");
        }

    }
    public static void rotateArray(int[] array,int start,int end)
    {
        int i = start;
        int j = end;
        while(i<j)
        {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }
}
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.leetcode 189
Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

approach : if rotate right means have to do 3 steps
1.reverse the array(0,size-1)
2.reverse(swap within the k)0 to k-1
3.reverse to swap remaining elements in array (k,size-1)

approach : if rotate left means have to do 2 steps
1.reverse(swap within the k)0 to k-1
2.reverse to swap remaining elements in array (k,size-1)

 */