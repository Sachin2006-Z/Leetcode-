class Solution{
    public int[] findEvenNumbers(int[] digits){
        int[] count=new int[10];
        for(int i=0;i<digits.length;i++)count[digits[i]]++;
        int[] arr=new int[900];
        int a=0;
        for(int i=100;i<=998;i+=2){
            int x=i/100;
            int y=(i/10)%10;
            int z=i%10;
            count[x]--;
            count[y]--;
            count[z]--;
            if(count[x]>=0&&count[y]>=0&&count[z]>=0)arr[a++]=i;
            count[x]++;
            count[y]++;
            count[z]++;
        }
        return java.util.Arrays.copyOf(arr,a);
    }
}