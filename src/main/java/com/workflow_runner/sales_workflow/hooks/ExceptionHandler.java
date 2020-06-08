package com.workflow_runner.sales_workflow.hooks;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

/**
 * Created by vranda on 08/06/20.
 */
@ControllerAdvice
@RestController
public class ExceptionHandler {
    private static final Logger logger = Logger.getLogger(ExceptionHandler.class);

//    @Autowired
//    private IEmailSvc emailSvc;

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public final ResponseEntity<String> handleInvalidData(Exception e, WebRequest request) {
        logger.error("Error fetch response for request: " + request.getContextPath() + ",error :" + e, e);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Issue while fetching response");
    }

}

