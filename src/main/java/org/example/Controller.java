package org.example;

import org.example.check.CheckInput;
import org.example.counts.Exec;
import org.example.input.InputValue;
import org.example.output.OutputResult;

public class Controller {
    public void start() {
        InputValue iv = new InputValue();
        CheckInput ci = new CheckInput();
        Exec ex = new Exec();
        OutputResult or = new OutputResult();

        int sum = iv.inputValue();
        ci.checkInputAmount(sum);
        or.printResults(ex.execCount(sum));
    }
}
