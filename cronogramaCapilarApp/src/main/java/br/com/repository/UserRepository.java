package br.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	/*
	 * Esse código define uma interface de repositório que extende a interface
	 * MongoRepository do Data MongoDB para fornecer operações básicas de CRUD
	 * (Create, Read, Update, Delete) em um banco de dados MongoDB para a entidade
	 * User.
	 */
}
