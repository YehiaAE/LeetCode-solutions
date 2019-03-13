public int[] sortedSquares(int[] A) {
        int length = A.length;
        int resultArr[] = new int[length];
        for (int i = 0; i < A.length; i++) {
            resultArr[i] = A[i] * A[i];
        }
        Arrays.sort(resultArr);
        return resultArr;
    }
