package org.luger.app.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.rest.core.config.RepositoryRestConfiguration
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter

/**
 * Created by gerardo8.
 */
@Configuration
class SpringDataRestConfig : RepositoryRestConfigurerAdapter() {

    override fun configureRepositoryRestConfiguration(config: RepositoryRestConfiguration) {
        config.setBasePath("/api")
        config.corsRegistry.addMapping("/api/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("PUT", "DELETE", "GET", "POST", "OPTIONS", "PATCH")
//                .allowedHeaders("header1", "header2", "header3")
//                .exposedHeaders("header1", "header2")
                .allowCredentials(false).maxAge(3600)
    }

}