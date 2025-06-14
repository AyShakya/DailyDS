class Solution {
    
        private boolean binarySearch(int[] m, int x, int skipIndex){
        int left = 0, right = m.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (m[mid] == x) {
                if (mid != skipIndex) return true;
                // If found at same index, check neighbors
                if (mid > left && m[mid - 1] == x && mid - 1 != skipIndex) return true;
                if (mid < right && m[mid + 1] == x && mid + 1 != skipIndex) return true;
                return false;
            } else if (m[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && binarySearch(arr, arr[i] / 2, i)) {
                return true;
            }
        }
        return false;
    }
}