package br.com.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
public class User {

    @Id
    private String id;

    @Field("nome")
    private String nome;

    @Field("email")
    private String email;

    @Field("password")
    private String password;

    private Cabelo cabelo;

    private Tratamento tratamento;

       
    public User(String nome, String email, String password, Cabelo cabelo) {
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.cabelo = cabelo;
		
		AnaliseCapilar analise = new AnaliseCapilar(cabelo);
		this.tratamento = analise.getTratamento();
		
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cabelo getCabelo() {
        return cabelo;
    }

    public void setCabelo(Cabelo cabelo) {
        this.cabelo = cabelo;
    }

    public Tratamento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Tratamento tratamento) {
        this.tratamento = tratamento;
    }
}