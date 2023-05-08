package br.com.demoProject;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import controller.UserController;
import enums.Comprimento;
import enums.Curvatura;
import enums.Estado;
import enums.Oleosidade;
import enums.Porosidade;
import model.AnaliseCapilar;
import model.Cabelo;
import model.User;

@SpringBootApplication
@EnableMongoRepositories("repository")
public class DemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoProjectApplication.class, args);
		
		Cabelo cabelo = new Cabelo(Comprimento.LONGO, Curvatura.LISO, Oleosidade.MISTO, Estado.RALO, false, false, false, Porosidade.BAIXA);
        AnaliseCapilar cronograma = new AnaliseCapilar(cabelo);
         	
    	Scanner scanner = new Scanner(System.in);
        RestTemplate restTemplate = new RestTemplate();
        
        // Pede ao usuário os dados para criar um novo usuário
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        
        System.out.println("Digite a senha:");
        String password = scanner.nextLine();
        
        // Cria um objeto do tipo User com os dados fornecidos pelo usuário
        User user = new User(nome,email,password,cabelo);
        
        // Envia uma solicitação POST para o endpoint /api/user/create para salvar o novo usuário no banco de dados
        //User savedUser = restTemplate.postForObject("localhost:27017/api/user/create", user, User.class);
        
        UserController userController = new UserController();
        userController.createUser(user);
        
        System.out.println("Usuário criado com sucesso!");
        System.out.println("ID do usuário: " + user.getId());
	}

}
