class Solution {
    public int differenceOfSums(int n, int m) {
        int not_divisible_sum = 0;
        int divisible_sum = 0;
        for(int i=1;i<n+1;i++){
            if(i%m!=0){
                not_divisible_sum+=i;
            }else if(i%m==0){
                divisible_sum+=i;
            }
            
        }
        return (not_divisible_sum-divisible_sum);
}
}