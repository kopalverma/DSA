class Solution {
    public List<List<Integer>> subset(int[] nums, int i, int j, List<Integer> at) {
        List<List<Integer>> a = new ArrayList<>();

        if (j == nums.length) {
            a.add(new ArrayList<>(at));
            return a;
        }

        at.add(nums[j]);
        a.addAll(subset(nums, i, j + 1, at));
        at.remove(at.size() - 1);

        a.addAll(subset(nums, i, j + 1, at));

        return a;
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);

        List<Integer> at = new ArrayList<>();
        List<List<Integer>> a = subset(nums, 0, 0, at);

        HashSet<List<Integer>> set = new HashSet<>(a);

        return new ArrayList<>(set);
    }
}