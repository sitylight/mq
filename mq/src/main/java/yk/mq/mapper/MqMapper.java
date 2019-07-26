package yk.mq.mapper;

import org.apache.ibatis.annotations.Mapper;
import yk.mq.model.mq.Mq;

import java.util.List;

/**
 * @author lcb 2019/7/17
 */
@Mapper
public interface MqMapper extends tk.mybatis.mapper.common.Mapper<Mq> {
    List<Mq> findAllMq();
}
