package org.dattv.codebase.core.service.iml;

import org.dattv.codebase.core.entity.BaseEntity;
import org.dattv.codebase.core.repository.BaseEntityRepository;
import org.dattv.codebase.core.service.BaseService;

public class BaseServiceEntityIml<T extends BaseEntity> implements BaseService {

    private final Class<T> tClass;
    private final BaseEntityRepository<T> repository;

    public BaseServiceEntityIml(Class<T> tClass, BaseEntityRepository<T> repository) {
        this.tClass = tClass;
        this.repository = repository;
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
