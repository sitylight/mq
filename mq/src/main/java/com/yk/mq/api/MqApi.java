package com.yk.mq.api;

import com.yk.mq.model.mq.Mq;
import com.yk.mq.usecase.impl.GetMqsUseCase;
import com.yk.mq.usecase.impl.SaveMqUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author lcb 2019/7/17
 */
@RestController
@RequestMapping("/mq")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class MqApi {
    private final SaveMqUseCase saveMqUseCase;
    private final GetMqsUseCase getMqsUseCase;

    @PostMapping("/save")
    public void saveMq() {
        final Mq mq = new Mq();
        mq.setQueueName("test");
        mq.setCreatedOn(LocalDateTime.now());
        saveMqUseCase.execute(mq);
    }

    @GetMapping("/get")
    public ResponseEntity getMqs() {
        return ResponseEntity.ok().body(getMqsUseCase.execute());
    }
}
