/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {
   
    public int findInMountainArray(int num, MountainArray arr) {

        int l = 0;
        int h = arr.length() -1;
        // int ans = 0;
        int maxposition = -1;
        // int mid;
        while (l < h) {
            int mid = l + (h - l) / 2;
            if (arr.get(mid) < arr.get(mid+1)) {
                l = mid + 1;
            } else {
                h = mid;
            }

        }
        maxposition = l;
        l = 0;
        h = maxposition;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr.get(mid) == num) {
                return mid;
            } else if (arr.get(mid)< num) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        l = maxposition;
        h = arr.length()-1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr.get(mid) == num) {
                return mid;
            } else if (arr.get(mid) < num) {
                h = mid - 1;

            } else {
                l = mid + 1;
            }

        }

        return -1;
    }
}