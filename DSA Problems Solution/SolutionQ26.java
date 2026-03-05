public class MoveHash {
    public static String moveHash(String str) {
        StringBuilder hashes = new StringBuilder();
        StringBuilder letters = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch == '#')
                hashes.append(ch);
            else
                letters.append(ch);
        }

        return hashes.toString() + letters.toString();
    }

    public static void main(String[] args) {
        String input = "Move#Hash#to#Front";
        System.out.println(moveHash(input));
    }
}