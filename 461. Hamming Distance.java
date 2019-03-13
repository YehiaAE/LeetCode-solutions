    public static int hammingDistance(int x, int y) {
         int diff=0;
         String first = String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0');
         String second = String.format("%32s", Integer.toBinaryString(y)).replace(' ', '0');
         char [] firstArray = first.toCharArray();
         char [] secondArray = second.toCharArray();
         for(int i=0;i<firstArray.length;i++){
             if(firstArray[i]!=secondArray[i])
                 diff++;
         }
         return diff;    
    }
