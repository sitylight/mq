package yk.mq.usecase;

/**
 * @author lcb 2019/7/17
 */
@FunctionalInterface
public interface NoInputUseCase<O> {
    O execute();
}
