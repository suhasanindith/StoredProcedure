package com.cg.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.Model.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long>  {

}
