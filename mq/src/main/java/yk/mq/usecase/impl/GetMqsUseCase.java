package yk.mq.usecase.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yk.mq.model.mq.Mq;
import yk.mq.producer.MsProducer;
import yk.mq.repository.MqRepository;
import yk.mq.usecase.NoInputUseCase;

import java.util.List;

/**
 * @author lcb 2019/7/17
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class GetMqsUseCase implements NoInputUseCase<List<Mq>> {
    private final MqRepository mqRepository;
    private final MsProducer msProducer;

    @Override
    public List<Mq> execute() {
        final Runnable runnable = () -> msProducer.sendMsg("derrick-test");
        final Thread thread = new Thread(runnable);
        thread.start();
        return mqRepository.findAllMq();
    }
}
