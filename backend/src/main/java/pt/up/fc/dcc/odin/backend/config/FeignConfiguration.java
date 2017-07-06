package pt.up.fc.dcc.odin.backend.config;

import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "pt.up.fc.dcc.odin.backend")
public class FeignConfiguration {

}
