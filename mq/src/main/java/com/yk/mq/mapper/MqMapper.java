package com.yk.mq.mapper;

import com.yk.mq.model.mq.Mq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lcb 2019/7/17
 */
@Mapper
public interface MqMapper extends tk.mybatis.mapper.common.Mapper<Mq> {
    List<Mq> findAllMq();
}
