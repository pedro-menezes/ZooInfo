package com.projeto.zooinfo.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.zooinfo.models.Animal;

public interface AnimalRepository extends CrudRepository<Animal, String> {

}
