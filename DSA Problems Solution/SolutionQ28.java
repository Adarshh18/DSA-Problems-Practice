public class CountingValleys {
    public static int countValleys(String path) {
        int level = 0, valleys = 0;

        for (char step : path.toCharArray()) {
            if (step == 'U') {
                level++;
                if (level == 0)
                    valleys++;
            } else {
                level--;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countValleys("UDDDUDUU"));
    }
}