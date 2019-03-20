class Solution {
     public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> count = new HashMap<>();
        ArrayList<String> resultArray = new ArrayList<>(); 
        for(String word : A.split(" "))
            count.put(word , count.getOrDefault(word,0)+1);
         for(String word : B.split(" "))
            count.put(word , count.getOrDefault(word,0)+1);
        for(String word : count.keySet()){
            if(count.get(word) == 1)
                resultArray.add(word);
        }
         
         String[] finalArray = new String[resultArray.size()];
         for(int i=0;i<resultArray.size();i++)
             finalArray[i]=resultArray.get(i);
         return finalArray;
    }
}
