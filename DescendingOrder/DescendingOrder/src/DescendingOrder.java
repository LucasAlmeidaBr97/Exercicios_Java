public class DescendingOrder {
    public static int sortDesc(final int num) {
        String strNum = Integer.toString(num);
        char[] digits = strNum.toCharArray();
        for (int i = 0; i < digits.length; i++) {
            for (int j = i + 1; j < digits.length; j++) {
                if (digits[i] < digits[j]) {
                    char temp = digits[i];
                    digits[i] = digits[j];
                    digits[j] = temp;
                }
            }
        }
        return Integer.parseInt(new String(digits));

    }

}
