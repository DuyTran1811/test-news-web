package dao;

import model.UserModel;

public interface UserDAO extends GenericDAO<UserModel> {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}