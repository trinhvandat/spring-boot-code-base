package org.dattv.codebase.core.service;

/**
 * This class create base service for object
 * @param <T> - entity
 */
public interface BaseService<T> {

    /**
     * Function delete T by id
     *
     * @param id
     */
    void deleteById(int id);
}
