     public int numUniqueEmails(String[] emails) {
        Set<String> seenEmails = new HashSet();
        for (String email: emails) {
            int index = email.indexOf('@');
            String firstPart = email.substring(0, index);
            String secondPart = email.substring(index);
            if (firstPart.contains("+")) {
                firstPart = firstPart.substring(0, firstPart.indexOf('+'));
            }
            firstPart = firstPart.replaceAll(".", "");
            seenEmails.add(firstPart + secondPart);
        }

        return seenEmails.size();
    }
