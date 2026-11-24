import java.math.BigInteger;
class Solution {
    public String smallestGoodBase(String n) {
        BigInteger num=new BigInteger(n);
        for(int m=60;m>=2;m--){
            BigInteger low=BigInteger.TWO;
            BigInteger high=num.subtract(BigInteger.ONE);
            while(low.compareTo(high)<=0){
                BigInteger mid=low.add(high).shiftRight(1);
                BigInteger sum=BigInteger.ONE;
                BigInteger power=BigInteger.ONE;
                for(int i=1;i<m;i++){
                    power=power.multiply(mid);
                    sum=sum.add(power);
                    if(sum.compareTo(num)>0) break;
                }
                int cmp=sum.compareTo(num);
                if(cmp==0) return mid.toString();
                if(cmp<0) low=mid.add(BigInteger.ONE);
                else high=mid.subtract(BigInteger.ONE);
            }
        }
        return num.subtract(BigInteger.ONE).toString();
    }
}
