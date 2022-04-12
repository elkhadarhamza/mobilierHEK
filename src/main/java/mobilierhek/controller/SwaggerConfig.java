package mobilierhek.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.function.Predicate;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
public class SwaggerConfig {
    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return regex("/api/article.*");
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Site API")
                .description("API reference for developers")
                .termsOfServiceUrl("http://localhost:8080")
                .licenseUrl("elkhadar@gmail.com").version("1.0").build();
    }
}
