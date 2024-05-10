package onezeze.diginom.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Configuration;
@OpenAPIDefinition(
        info = @Info(
                title = "Diginom API Docs",
                description = "default",
                version = "v1.0"
//                termsOfService = "a month"
        )
)
@Configuration
public class SwaggerConfig {

    public OpenAPI openAPI() {
        return new OpenAPI();
    }
}
