package com.modernjava.functiolanPrograming.realexample;

public interface AccountFactory {
    BankAccount getBankAccount(int id, double balance, String accountName);
}
