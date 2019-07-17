package com.yk.mq.usecase.impl;

import com.yk.mq.model.mq.Mq;
import com.yk.mq.repository.MqRepository;
import com.yk.mq.usecase.NoInputUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author lcb 2019/7/17
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetMqsUseCase implements NoInputUseCase<List<Mq>> {
    private final MqRepository mqRepository;

    @Override
    public List<Mq> execute() {
        return mqRepository.findAllMq();
    }
}
