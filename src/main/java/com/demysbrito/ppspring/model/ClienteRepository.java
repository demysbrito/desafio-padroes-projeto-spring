package com.demysbrito.ppspring.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Obs: Não é necessário o @Repository pois a interface já estende um repository
@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
