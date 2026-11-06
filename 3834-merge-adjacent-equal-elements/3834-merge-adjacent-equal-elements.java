class Solution{
    public List<Long> mergeAdjacent(int[] nums){
        List<Long> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            long a=nums[i];
            while(!arr.isEmpty()&&arr.get(arr.size()-1)==a){
                a+=arr.remove(arr.size()-1);
            }
            arr.add(a);
        }
        return arr;
    }
}