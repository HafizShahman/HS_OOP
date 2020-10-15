package com.shahman;

public class LogicalOperator {

    public static void main(String[] args) {
        // write your code here
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

    }
}
