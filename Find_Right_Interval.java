package leet_code;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Right_Interval {
    public static void main(String[] args) {
      int[][] arr = {{3,4},{2,3},{1,2}}; 
        System.out.println(Arrays.toString(findRightInterval(arr)));
    }
    
    static int[] interval(int[][] arr) {
        int[] xxx = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           int x=Integer.MAX_VALUE;
            xxx[i]=-1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][arr[i].length - 1] <= arr[j][0] && x>arr[j][0]) { //my approch whis is log(N^2)
                  
                    xxx[i]=j;
                    x=arr[j][0];}
                
            }
        }
        return xxx;
    }

//=================================================================================

static int[] findRightInterval(int[][] arr) {
     
    int[] xxx = new int[ arr.length];
    int[] ans = new int[ arr.length];
    for(int i = 0; i <  arr.length; ++i){
        xxx[i] = arr[i][0];}
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i <  arr.length; ++i){
        map.put(xxx[i],i);}
    Arrays.sort(xxx);
    for(int i = 0; i <  arr.length; ++i){
        int val = binarySearch(xxx,arr[i][1]);
        if(val == -1){
            ans[i] = -1;}
        else{
         ans[i] = map.get(xxx[val]);// the value is get using key
        }
    }
    return ans;
}
static int binarySearch(int[] xxx,int target){
    int l = 0;
    int r = xxx.length - 1;
    int ans = -1;
    while(l <= r){
        int mid = l + (r - l)/2;
        if(xxx[mid] == target){
            return mid;}
        else if(xxx[mid] > target){
            ans = mid;
            r = mid - 1;
        }
        else{
            l = mid + 1;
        }
    }
    return ans;
  }
}