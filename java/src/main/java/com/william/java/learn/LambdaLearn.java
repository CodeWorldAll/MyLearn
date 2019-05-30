package com.william.java.learn;

import java.util.Objects;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xuwenxue
 * Created on 2019-05-29
 */
public class LambdaLearn {

    private String name;

    private static final Logger logger = LoggerFactory
            .getLogger(LambdaLearn.class);

    private LambdaLearn(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static <T> boolean predicate(Predicate<T> predicate, T t) {
        return predicate.test(t);
    }

    private static <T> T unaryOperator(UnaryOperator<T> unaryOperator, T t) {
        return unaryOperator.apply(t);

    }

    private static <T> T binaryOperator(BinaryOperator<T> binaryOperator, T t1, T t2) {
        return binaryOperator.apply(t1, t2);
    }


    public static void main(String[] args) {
        logger.info("predicate:{}", predicate(Objects::isNull, null));
        logger.info("unaryOperator:{}", unaryOperator(t -> t, new LambdaLearn("test")));
        logger.info("binaryOperator:{}", binaryOperator((t1, t2) -> t2, new LambdaLearn("t1"), new LambdaLearn("t2")));

    }
}
