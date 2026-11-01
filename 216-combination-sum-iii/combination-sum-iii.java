class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        combination(1, k, n, new ArrayList<>(), result);
        return result;
    }
    public void combination(int start, int k, int target,
                           List<Integer> ans, List<List<Integer>> result) {
        if (ans.size() == k) {
            if (target == 0) {
                result.add(new ArrayList<>(ans));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            if (i > target) break;

            ans.add(i);
            combination(i + 1, k, target - i, ans, result);
            ans.remove(ans.size() - 1);
        }
    }
}