/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
 
package gov.irs;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The IRS maintains a collection of TaxPayers and collects taxes from them.
 *
 * Note the interface type TaxPayer, used throughout the class.
 */
public class IRS {
    // what types of objects can this array contain?
    //private final TaxPayer[] payers = new TaxPayer[100];
    Collection <TaxPayer> payers = new ArrayList<>();


    public void collectTaxes() {
        for (TaxPayer payer : payers) {
            double deduction = payer.getStandardDeduction();
            System.out.printf("Taxpayer's deduction is: %s\n", deduction);
            payer.fileReturn();
            payer.payTaxes();
            System.out.println("\n------------------------------\n");
        }
    }
    
    // helper method to add a TaxPayer to the array
    // what types of objects can be passed to this method?
    public void register(TaxPayer payer) {
        payers.add(payer);
    }
}