package yk.mq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "yk.mq.mapper")
public class MqApplication {

	public static void main(final String[] args) {
		SpringApplication.run(MqApplication.class, args);
	}

}
