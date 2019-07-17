package com.yk.mq.usecase.impl;

import com.yk.mq.model.mq.Mq;
import com.yk.mq.repository.MqRepository;
import com.yk.mq.usecase.InputUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
