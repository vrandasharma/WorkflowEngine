package com.workflow_runner.sales_workflow.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by vranda on 08/06/20.
 */
@Configuration
public class CommonConfiguration {
    @Bean("commonThreadPool")
    public ExecutorService p2ServicesThreadPool() {
        return new ThreadPoolExecutor(10, 10,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(50),
                new ThreadPoolExecutor.AbortPolicy());
    }
}
