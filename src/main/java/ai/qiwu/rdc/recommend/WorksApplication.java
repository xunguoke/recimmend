package ai.qiwu.rdc.recommend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 手表推荐作品启动类
 * @author hjd
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("ai.qiwu.rdc.recommend.dao")
public class WorksApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorksApplication.class,args);
    }
}
