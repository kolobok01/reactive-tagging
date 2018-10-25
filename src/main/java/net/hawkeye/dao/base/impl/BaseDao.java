package net.hawkeye.dao.base.impl;

import net.hawkeye.model.entity.base.BaseEntity;
import reactor.core.publisher.Mono;

public interface BaseDao<T extends BaseEntity, ID extends String> {

    public Mono<T> insert(T entity) throws Exception;
}
