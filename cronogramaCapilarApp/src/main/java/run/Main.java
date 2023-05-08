package run;

import model.Cabelo;
import enums.*;
import model.AnaliseCapilar;
import view.TelaInicial;
import view.TelaQuestionario;

import java.util.Scanner;
import org.springframework.web.client.RestTemplate;

import controller.UserController;
import model.User;

public class Main {
    public static void main(String[] args) {
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