package kz.market.yeetcross;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Yeetcross", version = "beta", description = "Yeetcross APIs"))
public class YeetcrossApplication {
    public static void main(String[] args) {
        SpringApplication.run(YeetcrossApplication.class, args);
    }
}
