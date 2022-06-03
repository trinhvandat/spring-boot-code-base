package org.dattv.codebase.swagger.ui.core.service.iml;

import org.dattv.codebase.swagger.ui.core.entity.BaseEntity;
import org.dattv.codebase.swagger.ui.core.repository.BaseEntityRepository;
import org.dattv.codebase.swagger.ui.core.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class BaseServiceEntityIml<T extends BaseEntity> implements BaseService<T> {

    private final BaseEntityRepository<T> repository;

    public BaseServiceEntityIml(BaseEntityRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public T create(T t) {
        return repository.save(t);
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    public T getById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Page<T> listAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public T update(T t) {
        return repository.save(t);
    }
}
