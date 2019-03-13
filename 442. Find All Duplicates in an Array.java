 public static List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        int i;
        for(i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
            else
                result.add(nums[i]);
        }
        return result;
    }
