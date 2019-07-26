package yk.mq.usecase.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yk.mq.model.mq.Mq;
import yk.mq.repository.MqRepository;
import yk.mq.usecase.InputUseCase;

/**
 * @author lcb 2019/7/17
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class SaveMqUseCase implements InputUseCase<Mq> {
    private final MqRepository mqRepository;

    @Override
    public void execute(final Mq mq) {
        mqRepository.save(mq);
    }
}
