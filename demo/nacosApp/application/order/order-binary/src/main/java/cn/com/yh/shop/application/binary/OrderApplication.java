package cn.com.yh.shop.application.binary;/**
 * Created by wyh in 2021/7/16 13:46
 **/

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program:
 * @description:
 * @author: forever-wang
 * @create: 2021-07-16 13:46
 **/
@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
public class OrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
}
