package dao;

import model.CategoryModel;

import java.util.List;

public interface ICategoryDAO {
    List<CategoryModel> findAll();
    CategoryModel findOne(long id);
    CategoryModel findOneByCode(String code);
}
