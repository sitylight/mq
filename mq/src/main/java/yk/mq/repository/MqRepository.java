package yk.mq.repository;

import yk.mq.model.mq.Mq;

import java.util.List;
import java.util.Optional;

/**
 * @author lcb 2019/7/17
 */
public interface MqRepository {
    void save(Mq mq);

    Optional<Mq> findQueueByName(String queueName);

    List<Mq> findAllMq();
}
