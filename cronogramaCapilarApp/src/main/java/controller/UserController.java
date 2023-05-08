package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.User;
import services.UserService;

// define que essa classe é um controlador REST
@RestController
/*
 * define o caminho base para todos os endpoints neste controlador. Neste caso,
 * o caminho base é /api/user.
 */
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	UserService userService;

	/*
	 * indicar que ele deve ser mapeado para solicitações POST enviadas para o
	 * endpoint /api/user/create
	 */
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/getById/{id}")
	public User getUserbyId(@PathVariable String id) {
		return userService.getUserbyId(id);
	}
	
	@GetMapping("/all")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	
	@DeleteMapping
	public String deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);
	}
}
	
