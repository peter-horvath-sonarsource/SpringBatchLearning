package com.springbatch.SpringBatchLearning.processor;

import com.springbatch.SpringBatchLearning.model.BankAccount;
import com.springbatch.SpringBatchLearning.model.Client;
import org.springframework.batch.item.ItemProcessor;

public class InvalidBankAccountProcessor implements ItemProcessor<Client, BankAccount> {
    @Override
    public BankAccount process(Client client) throws Exception {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setClientId(client.getEmail());
        return bankAccount;
    }
}
