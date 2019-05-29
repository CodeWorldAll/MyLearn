package com.william.java.learn;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.logging.Logger;

/**
 * @author xuwenxue
 * Created on 2019-05-29
 */
public class LambdaLearn {
    private static Logger logger = Logger.getLogger(LambdaLearn.class.getName());

    private LambdaLearn() {

    }

    private static <T> boolean predicate(Predicate<T> predicate, T t) {
        return predicate.test(t);
    }


    public static void main(String[] args) {
        logger.info("predicate:" + predicate(Objects::isNull, null));
    }
}
