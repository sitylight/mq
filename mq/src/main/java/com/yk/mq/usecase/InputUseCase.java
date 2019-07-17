package com.yk.mq.usecase;

/**
 * @author lcb 2019/7/17
 */
@FunctionalInterface
public interface InputUseCase<I> {
    void execute(I param);
}
