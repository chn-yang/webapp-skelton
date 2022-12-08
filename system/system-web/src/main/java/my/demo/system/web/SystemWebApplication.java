package my.demo.system.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@ServletComponentScan
@MapperScan("my.demo.system.web.*.mapper")
@SpringBootApplication(scanBasePackages = {"my.demo.system.web", "my.demo.common.redis", "my.demo.common.mybatis"})
public class SystemWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(SystemWebApplication.class);
    }
}
