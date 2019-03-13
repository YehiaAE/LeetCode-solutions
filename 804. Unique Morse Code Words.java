public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<>();
        for (String line = scan.nextLine(); !line.isEmpty(); line = scan.nextLine()) {
            input.add(line);
        }
        String[] scannedInput = new String[input.size()];
        for (int i = 0; i < input.size(); i++) {
            scannedInput[i] = input.get(i);
        }
        System.out.println(uniqueMorseRepresentations(scannedInput));
    }

    public static int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."};
        HashSet<String> set = new HashSet<>();
        for (String x : words) { // Handle each word
            String result = "";
            for (char y : x.toCharArray()) { // Handle each character
                result += morseCodes[y - 'a'];
            }
            set.add(result);
        }
        return set.size();
    }
