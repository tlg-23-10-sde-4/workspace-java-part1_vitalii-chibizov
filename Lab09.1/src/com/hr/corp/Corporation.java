/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.corp;

import gov.irs.TaxPayer;

/**
 * Corporate entity - also pays taxes.
 */
public class Corporation implements TaxPayer {
    private String name;

    public Corporation(String name) {
        setName(name);
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        //System.out.println(getName() + " paid no taxes - we lobbied hard and it worked");
        System.out.printf("\n%s paid no taxes - we lobbied hard and it worked", getName());
    }

    @Override   // interface TaxPayer
    public void fileReturn() {
        System.out.printf("Return not filed - we sent our lawyers instead\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}