package org.example.counts;

public class CountsExecution {
    /*
    This class is not implemented yet.
     */

    public String[] execCount(int sum) {
        String[] res = new String[5];
        Integer[] bills = {500, 200, 100, 50, 20};
        Integer[] billsCounts = {0, 0, 0, 0, 0};
        int bill500 = 0;

        if ((sum < 20) && (sum > 0)) {
            throw new IllegalStateException("No way to give that amount.");
        }

        int i = 0;
        for (int bill : bills) {
            if ((sum - bill >= 20) && (sum >= 20)) {
                while (sum - bill >= 20) {
                    if ((sum % 20 != 0) && (sum % 50 != 0)) {
                        System.out.println("...");
                        // code
                    }
                    sum -= bill;
                    billsCounts[i] += 1;
                }
            }
            i++;
        }
        i = 0;
        for (int bill : billsCounts) {
            res[i] = String.valueOf(bill);
            i++;
        }
        return res;
    }

}
