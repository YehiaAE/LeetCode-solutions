  public String reverseWords(String s) {
        String[] words = s.split(" ");
        String result = "";
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            sb.reverse().toString();
            result += sb.append(" ");
        }
        return result.trim();
    }
