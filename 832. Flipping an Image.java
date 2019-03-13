    public int[][] flipAndInvertImage(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        
        int resultArray[][] = new int [rows][cols];
        
        int i,j;
        for(i=0;i<rows;i++){
            for(j=cols-1;j>=0;j--){
                resultArray[i][cols-j-1] = A[i][j] ^ 1;
            }
        }
        return resultArray;
    }
