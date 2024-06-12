package leet_code;


public class find_missing_number {
    public static void main(String[] args) {
      int[] arr={0,1,4,2};
        System.out.println(missing(arr));
    }

    static int missing(int[]arr) {
      int i=0;
       while (i < arr.length){
          if (arr[i] < arr.length && arr[i] != arr[arr[i]]) {
              int temp=arr[arr[i]];
              arr[arr[i]]=arr[i];
              arr[i]=temp;
          }else {
              i++;
          }
       }
        for (int j = 0; j < arr.length; j++) {
            if (j!= arr[j]){
                return j;
            }
        }
        return arr.length;
    }
}



