package br.com.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.model.Cabelo;
import br.com.model.User;
import br.com.repository.UserRepository;

/* indicação para o Spring que essa classe é um componente de 
 * serviço e deve ser gerenciada automaticamente pelo contêiner do Spring.*/

@Service
public class UserService {
	
	/*
	 * Esta classe fornece a funcionalidade de criar um novo usuário na aplicação. A classe usa
	 * a interface de repositório UserRepository para salvar o usuário no banco de
	 * dados MongoDB.
	 */

	@Autowired
	UserRepository userRepository;

	@Transactional
																																public User createUser(String nome, String email, String password, Cabelo cabelo) {
		return userRepository.save(new User(nome, email, password, cabelo));
	}
	
	/*
	 * O método createUser recebe um objeto User como parâmetro e chama o método
	 * save do UserRepository para salvar o usuário no banco de dados MongoDB. O
	 * método save retorna o objeto User salvo no banco de dados, que é então
	 * retornado pelo método createUser.
	 */
	
	public User getUserbyId(String id) {
		return userRepository.findById(id).get();
	}
	
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	public User updateUser(User user) {
		return userRepository.save(user);
	}
	
	public String deleteUser(String id) {
		userRepository.deleteById(id);
		return "User deletado!";
	}
	

}
