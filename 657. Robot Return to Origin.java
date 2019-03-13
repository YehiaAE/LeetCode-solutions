   public static boolean judgeCircle(String input) {
        int x = 0, y = 0;
        for (char ch : input.toCharArray()) {
            if (ch == 'R') {
                x++;
            } else if (ch == 'L') {
                x--;
            } else if (ch == 'U') {
                y++;
            } else if (ch == 'D') {
                y--;
            }
        }
        return (x == 0 && y == 0);
    }
