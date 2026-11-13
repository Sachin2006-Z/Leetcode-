class Solution {
    public int sumFourDivisors(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=0;
            int b=0;
            for(int j=1;j*j<=nums[i];j++){
                if(nums[i]%j==0){
                    a++;
                    b+=j;
                    if(j*j!=nums[i]){
                        a++;
                        b+=nums[i]/j;
                    }
                }
            }
            if(a==4){
                c+=b;
            }
        }
        return c;
    }
}