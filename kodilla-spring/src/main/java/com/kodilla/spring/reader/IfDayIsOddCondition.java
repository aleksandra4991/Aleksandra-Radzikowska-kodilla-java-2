package com.kodilla.spring.reader;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.time.LocalDate;


public abstract class IfDayIsOddCondition implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return LocalDate.now().getDayOfMonth() % 2 != 0;
    }

}