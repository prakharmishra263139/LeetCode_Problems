class Solution {
    public String fractionAddition(String expression) {
        int num = 0;
        int den = 1;
        int n = expression.length();
        int i = 0;

        while (i < n) {
            int currentNum = 0;
            int currentDen = 0;
            boolean isNeg = false;

            char ch = expression.charAt(i);

            if (ch == '+' || ch == '-') {
                if (ch == '-') {
                    isNeg = true;
                }
                i++;
            }

            int start = i;

            while (i < n && Character.isDigit(expression.charAt(i))) {
                i++;
            }

            currentNum = Integer.parseInt(expression.substring(start, i));
            if (isNeg) currentNum *= -1;

            i++;

            start = i;

            while (i < n && Character.isDigit(expression.charAt(i))) {
                i++;
            }

            currentDen = Integer.parseInt(expression.substring(start, i));

            num = num * currentDen + currentNum * den;
            den *= currentDen;

            int gcd = Math.abs(getGCD(num, den));
            num /= gcd;
            den /= gcd;
        }

        return num + "/" + den;
    }

    public int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
