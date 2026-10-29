class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combinations(0 ,candidates,target,new ArrayList<>(), result);
        return result;
    } 
    public void combinations(int i, int[] candidates, int target,List<Integer> ans
    , List<List<Integer>>result){
        if(i==candidates.length){
            if(target==0){
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        if(candidates[i]<= target){
            ans.add(candidates[i]);

            combinations(i,candidates, target-candidates[i],ans,result);

            ans.remove(ans.size()-1);
        }
        combinations(i+1,candidates, target, ans, result);
    }
}