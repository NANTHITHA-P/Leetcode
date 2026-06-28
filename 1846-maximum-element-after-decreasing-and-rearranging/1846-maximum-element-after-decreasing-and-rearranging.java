class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        // if(arr[0]!=1){
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==1){
        //         int temp = arr[0];
        //         arr[0] = arr[i];
        //         arr[i] = temp;
        //     }
        //    }
        // }
        Arrays.sort(arr);
        arr[0] = 1;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i+1] - arr[i])>1){
               arr[i+1] = arr[i]+1;
            }
        }
        // int max = arr[0];
        // for(int i=0;i<arr.length;i++){
        //    if(arr[i]>max){
        //       max = arr[i];
        //    }
        // }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        return arr[arr.length-1];
    }
}