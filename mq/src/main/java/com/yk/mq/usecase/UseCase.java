package com.yk.mq.usecase;

/**
 * @author lcb 2019/7/17
 */
@FunctionalInterface
public interface UseCase<I, O> {
    O execute(I param);
}
