package com.example.demo.persistence.DAO.Interfaces;

import com.example.demo.persistence.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserDAO {

    // El DAO opera con el entity no con DTO, ya que interactua con la BD y
    //en la capa de persistencia la logica y metodos son con entity

    List<UserEntity> findAll();
    Optional<UserEntity> findById (Long id);
    void saveUser(UserEntity userEntity);
    void updateUser(UserEntity userEntity);
    void deleteUser (UserEntity userEntity);

}
