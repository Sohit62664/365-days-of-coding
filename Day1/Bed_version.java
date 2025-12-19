/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Bed_version extends VersionControl {
    public int firstBadVersion(int n) {
        // simple method linerar search
        // for(int i =0 ; i<= n ; i++){
        // if(isBadVersion(i)){
        // return i ;
        // }
        // }
        // return -1;
        // TLE in the 11th test cace

        // With the help of binary search
        int st = 0;
        int end = n;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isBadVersion(mid)) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return st;

    }
}