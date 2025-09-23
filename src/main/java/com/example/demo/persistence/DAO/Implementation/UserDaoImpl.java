package com.example.demo.persistence.DAO.Implementation;

import com.example.demo.persistence.DAO.Interfaces.IUserDAO;
import com.example.demo.persistence.entity.UserEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.hibernate.grammars.hql.HqlParser.SELECT;


@Repository
public class UserDaoImpl implements IUserDAO {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<UserEntity> findAll() {

        this.em.createQuery("SELECT u FROM UserEntity u").getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<UserEntity> findById(Long id) {

        return Optional.ofNullable((this.em.find(UserEntity.class, id)));
    }

    @Override
    @Transactional
    public void saveUser(UserEntity userEntity) {

        this.em.persist(userEntity);
        this.em.flush();;
    }

    @Override
    @Transactional
    public void updateUser(UserEntity userEntity) {

         this.em.merge(userEntity);;
    }

    @Override
    public void deleteUser(UserEntity userEntity) {

         this.em.remove(userEntity);
    }
}
