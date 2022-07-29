class Solution {
    //cardPoints = [1,2,3,4,5,6,1], k = 3
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int startWindow = 0;
        int endWindow = n - k;
        int total = 0; 
        int res = 0;
        for(int i=endWindow;i<n;i++){
            total += cardPoints[i];
        }

        res = total;

        while(endWindow < n){
            total = total + (cardPoints[startWindow] - cardPoints[endWindow]);
            res = Math.max(res,total);
            startWindow++;
            endWindow++;
        }
        return res;        
    }
}
