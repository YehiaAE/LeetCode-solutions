   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        System.out.println(selfDividingNumbers(left, right));
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int current = i;
            while (current > 0) {
                int x = current % 10;
                current /= 10;
                if (x == 0 || i % x > 0) {
                    break;
                }
                if(current==0)
                    result.add(i);
            }
        }
        return result;
    }
