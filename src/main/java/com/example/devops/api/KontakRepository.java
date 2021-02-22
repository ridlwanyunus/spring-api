package com.example.devops.api;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontakRepository extends CrudRepository<Kontak, Integer>{

}
