package org.dattv.codebase.swagger.ui.core.service;

import org.dattv.codebase.swagger.ui.core.entity.BaseEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * This class create base service for object
 * @param <T> - entity
 */
public interface BaseService<T extends BaseEntity> {

    /**
     * Function create new object
     *
     * @param t
     * @return
     */
    T create(T t);

    /**
     * Function delete T by id
     *
     * @param id
     */
    void deleteById(int id);

    /**
     * Function get object by id
     *
     * @param id
     * @return
     */
    T getById(int id);

    /**
     * Function list all t with pageable
     *
     * @param pageable
     * @return
     */
    Page<T> listAll(Pageable pageable);

    /**
     * Function update t
     *
     * @param t
     * @return
     */
    T update(T t);
}
