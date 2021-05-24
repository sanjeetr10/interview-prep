package dp.impl;

public class TrappingRainWater {

    public int trap(int[] arr){
        int n = arr.length;
        int[] pmax = new int[n];
        int[] smax = new int[n];
        int res = 0;

        if(n==0)
            return 0;

        //prefix max
        pmax[0] = arr[0];
        for(int i=1;i<n;i++){
            pmax[i] = Math.max(pmax[i-1], arr[i]);
        }

        //suffix max
        smax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            smax[i] = Math.max(smax[i+1], arr[i]);
        }

        for(int i=0;i<n;i++){
            res += Math.min(pmax[i],smax[i]) - arr[i];
        }

        return res;
    }
}
