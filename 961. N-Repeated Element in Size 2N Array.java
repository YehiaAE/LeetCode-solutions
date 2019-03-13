public int repeatedNTimes(int[] A) {
        Set<Integer> hashSet = new HashSet<>();
        int i;
        int result = 0;
        for (i = 0; i < A.length; i++) {
            if (hashSet.contains(A[i])) {
                result = A[i];
                break;
            }
            hashSet.add(A[i]);
        }
        return result;
    }
