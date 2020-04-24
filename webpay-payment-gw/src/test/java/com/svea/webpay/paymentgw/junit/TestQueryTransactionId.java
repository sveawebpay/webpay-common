package com.svea.webpay.paymentgw.junit;

import org.junit.Before;
import org.junit.Test;

import com.svea.webpay.paymentgw.PaymentGwClient;
import com.svea.webpay.paymentgw.entity.Transaction;

/**
 * Query a transaction.
 * 
 * @author Daniel Tamm
 *
 */
public class TestQueryTransactionId {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testQueryTransactionId() {

		PaymentGwClient cl = new PaymentGwClient(
				TestConfig.testMerchantId, 
				TestConfig.testSecretWord);
		
		if (TestConfig.transactionId!=null && TestConfig.transactionId>0) {
			Transaction tr = cl.queryByTransactionId(TestConfig.transactionId);
			if (tr!=null) {
				TestConfig.testLogger.info("Successfully retrieved transaction: " + tr.getId() + " - " + tr.getCustomer().getFullName());
			}
		}
		
		
	}

}
