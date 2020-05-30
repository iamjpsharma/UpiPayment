package com.iamjpsharma.upipaymentlib.listener;


import com.iamjpsharma.upipaymentlib.model.TransactionDetails;

public interface PaymentStatusListener {
    void onTransactionCompleted(TransactionDetails transactionDetails);

    void onTransactionSuccess();

    void onTransactionSubmitted();

    void onTransactionFailed();

    void onTransactionCancelled();

    void onAppNotFound();
}
