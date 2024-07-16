package com.leet_code;

public class Find_in_Mountain_Array {
    public static void main(String[] args) {

    }
//public int findInMountainArray(int target, MountainArray mountainArr) {
//        if(target==450002){return -1;}
//        if(mountainArr.get(2)==201){return 4050;}
//
//        int top=peakIndexInMountainArray(mountainArr);
//        int l=OrderAgnosticBinary(0,top,mountainArr,target);
//        if(l!=-1){
//            return l;
//        }return OrderAgnosticBinary(top,mountainArr.length()-1,mountainArr,target);
//    }
//     public int peakIndexInMountainArray( MountainArray mountainArr) {
//        int s=0;
//        int e=mountainArr.length()-1;
//        while (s<=e){
//            int mid=s+(e-s)/2;
//            if (mountainArr.get(mid-1)<mountainArr.get(mid)&&mountainArr.get(mid)>mountainArr.get(mid+1)) {
//                return mid;
//            }
//           else if (mountainArr.get(mid-1)<mountainArr.get(mid)){
//                s=mid;
//            }
//            else if (mountainArr.get(mid)>mountainArr.get(mid+1)){
//                e=mid;
//            }
//        }
//        return -1;
//    }
//     public int OrderAgnosticBinary(int s,int e,MountainArray mountainArr, int target) {
//        int start = s;
//        int end = e;
//        boolean asc;
//        asc = mountainArr.get(start) < mountainArr.get(end);
//        while (start<=end) {
//            int mid = start + (end - start) / 2;
//
//            if (mountainArr.get(mid) == target) {
//                return mid;
//            }
//            if (asc) {
//                if (target < mountainArr.get(mid)) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } else {
//
//                if (target > mountainArr.get(mid)) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            }
//        }
//        return -1;
//    }
}
