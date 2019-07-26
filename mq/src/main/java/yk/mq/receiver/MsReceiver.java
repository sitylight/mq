package yk.mq.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import yk.mq.common.RabbitConfig;

/**
 * @author lcb 2019/7/19
 */
@Slf4j
@Component
@RabbitListener(queues = RabbitConfig.QUEUE_A)
public class MsReceiver {

    @RabbitHandler
    public void process(final String content) {
        log.info("接收处理队列A当中的消息： " + content);
    }

}
