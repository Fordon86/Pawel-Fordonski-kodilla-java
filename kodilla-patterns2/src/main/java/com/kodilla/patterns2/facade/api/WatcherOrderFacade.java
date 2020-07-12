package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrderFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrderFacade.class);

/*    @Before("execution( * com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Order saved");
    }*/

    @Around("execution( * com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
//            "&& args(savedLog)")
    public Object logEvent (final ProceedingJoinPoint joinPoint) throws Throwable {
        try {
            Object result = joinPoint.proceed();
            System.out.println("Log: " + joinPoint.getTarget().toString());
            System.out.println("Log: " + joinPoint.getArgs().toString());
            System.out.println("Log: " + joinPoint.getClass().getName());
            ///System.out.println("dsdas" + joinPoint);
            return result;

        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
    }

}
