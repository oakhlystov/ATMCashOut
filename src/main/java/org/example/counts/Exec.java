package org.example.counts;

import org.example.check.CheckSum;

public class Exec {
    public String[] execCount(int sum) {
        String[] res = new String[5];
        int cash500 = 0;
        int cash200 = 0;
        int cash100 = 0;
        int cash50 = 0;
        int cash20 = 0;

        if (CheckSum.checkIfSumDiv50HasRest(sum) && CheckSum.checkIfSumDiv20HasRest(sum)) {
            do {
                cash20++;
                sum -= 20;
                if (CheckSum.checkIfSumIsLessThan20(sum)) {
                    throw new IllegalStateException("Sorry, this amount cannot be given. It should be divided by 20, 50, 100, 200, 500");
                }
            } while (CheckSum.checkIfSumDiv50HasRest(sum));
        }

        if (sum >= 500) {
            cash500 = sum / 500;
            sum = sum % 500;
        }
        if (sum >= 200) {
            cash200 = sum / 200;
            sum = sum % 200;
        }
        if (sum >= 100) {
            cash100 = sum / 100;
            sum = sum % 100;
        }
        if (sum >= 50 && sum % 50 == 0) {
            cash50 = sum / 50;
            sum = 0;
        }
        if (sum >= 20) {
            cash20 = sum / 20;
            sum = sum % 20;
        }
        if (CheckSum.checkIfSumIsGreaterThanZero(sum)) {
            throw new IllegalStateException("Sorry, this amount cannot be given. It should be divided by 20, 50, 100, 200, 500");
        }

        res[0] = "Cash 20: " + cash20;
        res[1] = "Cash 50: " + cash50;
        res[2] = "Cash 100: " + cash100;
        res[3] = "Cash 200: " + cash200;
        res[4] = "Cash 500: " + cash500;

        return res;
    }
}
