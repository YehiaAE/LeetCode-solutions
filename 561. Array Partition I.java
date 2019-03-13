   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String a = scan.nextLine();
            if (a.isEmpty()) {
                break;
            }
            int value = Integer.parseInt(a);
            list.add(value);
        }
        int[] numbers = new int[list.size()];
        for(int i=0;i<list.size();i++){
            numbers[i]=list.get(i);
        }
        System.out.println(arrayPairSum(numbers));
    }

    public static int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
