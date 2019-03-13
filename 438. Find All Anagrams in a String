   /* public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() == 0 | s == null | p.length() == 0 | p == null) {
            return result;
        }
        int i;
        for (i = 0; i <= s.length() - p.length(); i++) {
            String temp = s.substring(i, i + p.length());
            char[] tempArray = temp.toCharArray();
            Arrays.sort(tempArray);
            String sortedTemp = new String(tempArray);
            if (sortedTemp.equals(p)) {
                result.add(i);
            }
        }
        return result;
    } */
    
    public List<Integer> findAnagrams(String s, String p){
        List<Integer> indexResult = new ArrayList<>();
         if (s.length() == 0 | s == null | p.length() == 0 | p == null) {
            return indexResult;
        }
         
        int pAsciiValue = getASCIIValue(p);
        int i;
        for(i=0;i<=s.length()-p.length();i++){
            if(getASCIIValue(s.substring(i, i+p.length()))==pAsciiValue)
                indexResult.add(i);
        }
        return indexResult;
    }
    
    public int getASCIIValue(String str){
        int i, value=1;
        for(i=0;i<str.length();i++){
            value*= (int)str.charAt(i);
        }
        return value;
    }
