package yk.mq.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.entity.Example;
import yk.mq.mapper.MqMapper;
import yk.mq.model.mq.Mq;
import yk.mq.repository.MqRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author lcb 2019/7/17
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MqMybatisRepository implements MqRepository {
    private final MqMapper mqMapper;

    @Override
    public void save(final Mq mq) {
        if (mq.getId() == null) {
            mqMapper.insertSelective(mq);
        } else {
            mqMapper.updateByPrimaryKeySelective(mq);
        }
    }

    @Override
    public Optional<Mq> findQueueByName(final String queueName) {
        final Example example = new Example(Mq.class);
        final Example.Criteria criteria = example.createCriteria();
        criteria.andEqualTo("queueName", queueName);
        return Optional.ofNullable(mqMapper.selectOneByExample(example));
    }

    @Override
    public List<Mq> findAllMq() {
        return mqMapper.findAllMq();
    }
}
