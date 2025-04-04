package model.dao;

import model.entities.Department;

public interface DepartamentDao {

    void insert(Department obj);
    void update(Department obj);
    void deleteByid(Integer id);
    Department findById(integer id);
    List<Department> findAll();

}
