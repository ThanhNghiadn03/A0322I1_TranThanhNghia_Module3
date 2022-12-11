package service;

import java.util.List;

public interface CRUDService <T>{
    List<T> findAll();
    void insert(T t);
    void edit(T t);
    void deleteById(int id);
}
