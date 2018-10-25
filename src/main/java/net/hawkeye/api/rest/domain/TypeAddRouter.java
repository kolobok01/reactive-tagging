package net.hawkeye.api.rest.domain;

import net.hawkeye.api.rest.base.BaseRouter;
import net.hawkeye.service.application.interfaces.TypeAddService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class TypeAddRouter extends BaseRouter {

    @Bean(value = "type-add")
    public RouterFunction<ServerResponse> router(TypeAddService typeAddService){
        return route(POST(baseRest + "/type-add").and(accept(APPLICATION_JSON)).and(contentType(APPLICATION_JSON)), typeAddService::insert);
    }
}
