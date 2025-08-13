package com.train.spring.practice.service;


import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.rmi.RemoteException;

@Service
public class RetryableServiceTest {



    @Retryable(retryFor = RemoteException.class, maxAttempts = 3, backoff = @Backoff(delay = 1))
    public void serviceRetryable() throws RemoteException {
        // Simulate a flaky external API call
        if (Math.random() > 0.5) {
            throw new RemoteException("Payment service unavailable");
        }
        System.out.println("Payment processed successfully!");

    }

}
