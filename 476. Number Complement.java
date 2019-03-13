 public static int findComplement(int num) {
        // System.out.println(Integer.toBinaryString(num));
        int bitMask = (Integer.highestOneBit(num) << 1) - 1;
        //System.out.println(Integer.toBinaryString(bitMask));
        num = ~num;
        //System.out.println(Integer.toBinaryString(num));   
        return num & bitMask;
    }
