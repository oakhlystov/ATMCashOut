package org.example;

import org.example.check.CheckInput;
//import org.example.counts.CountsExecution;
import org.example.counts.Exec;
import org.example.input.InputAmount;
import org.example.output.OutputResult;

public class Controller {
    public void start() {
        InputAmount iv = new InputAmount();
        CheckInput ci = new CheckInput();
        Exec ex = new Exec();
//        CountsExecution ce = new CountsExecution(); // not implemented yet.
        OutputResult or = new OutputResult();

        int sum = iv.inputWithdrawalCashAmount();
        ci.checkInputAmount(sum);
        or.printResults(ex.execCount(sum));
    }
}
