    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int i, j;

        int numRows = grid.length;
        int numCols = grid[0].length;

        int[] maxOfRows = new int[numRows];
        int[] maxOfCols = new int[numCols];

        for (i = 0; i < maxOfRows.length; i++) {
            maxOfRows[i] = 0;
        }
        for (i = 0; i < maxOfCols.length; i++) {
            maxOfCols[i] = 0;
        }

        for (i = 0; i < numRows; i++) {
            for (j = 0; j < numCols; j++) {
                maxOfRows[i] = Math.max(grid[i][j], maxOfRows[i]);
                maxOfCols[j] = Math.max(grid[i][j], maxOfCols[j]);
            }
        }

        int totalValue = 0;
        for (i = 0; i < numRows; i++) {
            for (j = 0; j < numCols; j++) {
                totalValue += Math.min(maxOfRows[i], maxOfCols[j]) - grid[i][j];
            }
        }
        return totalValue;
    }
