package com.shifa;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(countRoatations(arr));
    }

    private static int countRoatations(int[] arr) {
        int pivot = findpivot(arr);
        return pivot + 1;
    }

    //use this for no duplicates
    static int findpivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //case 3
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    // use this when array contains duplicates
    static int findpivotWithDuplcates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
          int  mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            // if elements at middle,start,end are equal the skip the duplicate
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //Note what if this elements at start and end were the pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                //check whether end is pivot or not
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted , so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            return -1;
        }
        return start;
    }
}