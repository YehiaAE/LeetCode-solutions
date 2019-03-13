 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Jewels = scan.nextLine();
        String Stones = scan.nextLine();
        int result = numJewelsInStones(Jewels,Stones);
        System.out.println(result);
       
    }
    
    public static int numJewelsInStones(String Jewels,String Stones){
        char[] JewelsArray = Jewels.toCharArray();
        char[] StonesArray = Stones.toCharArray();
        int i, j, count = 0;
         for (i = 0; i < StonesArray.length; i++) {
            for (j = 0; j < JewelsArray.length; j++) {
                if (StonesArray[i] == JewelsArray[j]) {
                    count++;
                }
            }
        }
         return count;
    }
