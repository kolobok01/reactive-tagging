package net.hawkeye.service.application.interfaces;

import net.hawkeye.model.entity.domain.TypeAddEntity;
import net.hawkeye.service.base.interfaces.BaseService;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

public interface TypeAddService extends BaseService<TypeAddEntity, String> {


    public Mono<ServerResponse> insert(ServerRequest request);
}
