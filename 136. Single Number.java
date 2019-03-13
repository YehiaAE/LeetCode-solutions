public static int singleNumber(int[] nums) {
        int i,result=0;
        for(i=0;i<nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
