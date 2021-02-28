package dao;

import model.NewModel;
import paging.Pageble;

import java.util.List;

public interface INewDao {
    NewModel findOne(Long id);

    List<NewModel> findByCategoryId(Long categoryId);

    Long save(NewModel newModel);

    void update(NewModel updateNew);

    void delete(long id);

    List<NewModel> findAll(Pageble pageble);

    int getTotalItem();
}
