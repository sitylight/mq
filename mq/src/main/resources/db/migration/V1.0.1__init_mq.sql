    DROP TABLE IF EXISTS `mq`;
CREATE TABLE `mq`  (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
`queue_name` varchar(255)NULL DEFAULT NULL COMMENT '应用ID',
`created_on` TIMESTAMP NULL DEFAULT NULL COMMENT '编码',
PRIMARY KEY(`id`)
);
