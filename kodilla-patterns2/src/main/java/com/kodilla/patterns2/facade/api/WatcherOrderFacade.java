package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrderFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(WatcherOrderFacade.class);

    @Around("execution( * com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..) )" +
            "&& args (orderDto, userId) ")
    public Object logEvent (final ProceedingJoinPoint proceedingJoinPoint, OrderDto orderDto, Long userId) throws Throwable {

        try {
            Object result = proceedingJoinPoint.proceed();;
            LOGGER.info("User ID is: " + userId);
            return result;
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage());
            throw throwable;
        }
    }

}
