package sliding_window;


public class MaximumSumSubarray {
    public static int max_sum(int[] a, int k){
        if(a.length<k){
            return 0;
        } 
        int total=0;
        for(int i=0;i<k;i++){
            total+=a[i];
        }
        int max_total=total;
        for(int j=0;j<(a.length-k);j++){
            total-=a[j];
            total+=a[j+k];
            max_total=Math.max(max_total, total);
        }
        return max_total;
    }
    public static void main(String[] args) {
        int[] n={2, 3, 4, 1, 5};
        System.out.println("Max sum ="+max_sum(n, 2));
    }
    
}
