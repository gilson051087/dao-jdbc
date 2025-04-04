package model.dao;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

    void insert(Seller obj);
    void update(Seller obj);
    void deleteByid(Integer id);
    Seller findById(integer id);
    List<Seller> findAll();


}
