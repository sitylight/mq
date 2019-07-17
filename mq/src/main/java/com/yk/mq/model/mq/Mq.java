package com.yk.mq.model.mq;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

/**
 * @author lcb 2019/7/17
 */
@Data
@Table(name = "mq")
public class Mq {
    @Id
    private Integer id;

//    @Column(name = "queue_name")
    private String queueName;

//    @Column(name = "created_on")
    private LocalDateTime createdOn;

}
