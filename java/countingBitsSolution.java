class Solution {
    public int[] countBits(int n) {
        if(n == 0){
            int[] results = new int[1];
            results[0] = 0;
            return results;
        } else {
            int[] results = new int[n+1];
            results[0] = 0;
            results[1] = 1;
            for(int i = 2; i <= n; i++){
                results[i] = countSetBits(i);
            }
            return results;
        }
    }
    
    private int countSetBits(int num) {
        int count = 0;
        while(num > 0) {
            count += num & 1; // adds 1 if 1 is in right most place
            num >>= 1; //shift the bits to the right 1
        }
        return count;
    }
}
