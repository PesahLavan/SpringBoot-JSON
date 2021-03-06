package com.pesahlavan.example.hibernate.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.pesahlavan.example.hibernate.entity.Manager;

@Repository
@Transactional
public interface ManagerRepository extends CrudRepository<Manager, Long>{
}
