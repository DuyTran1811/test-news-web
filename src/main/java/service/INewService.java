package service;

import model.NewModel;

import java.awt.print.Pageable;
import java.util.List;

public interface INewService {
    List<NewModel> findByCategory(Long categoryId);

    NewModel save(NewModel newModel);

    NewModel update(NewModel updateModel);

    void delete(long[] ids);

    List<NewModel> findAll(Pageable pageable);

    int getTotalItems();

    NewModel findOne(long id);
}
