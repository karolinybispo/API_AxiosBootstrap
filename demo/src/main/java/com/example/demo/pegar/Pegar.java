package com.example.demo.pegar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://127.0.0.1:5500") //permite requisicoes dessa origem
@RestController
@RequestMapping("/pegar")
public class Pegar {
	
	//Requisicao feita ao endpoint '/pegar' o metodo mensagemJson vai responder.

	// Fazendo uma requisicao GET para http://localhost:8080/pegar o spring manda essa requisicao para o metodo com anotacion get.
	@GetMapping //nao defini nenhum parametro para essa annotacion ent para chegar nesse metodo basta o endpoint: /pegar definido no requestmapping.
	public String mensagemJson() {
        return "{ \"id\": 7, \"title\": \"White Gold Plated Princess\", \"price\": 9.99, \"description\": \"Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her.\", \"category\": \"jewelery\", \"image\": \"https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg\", \"rating\": { \"rate\": 3, \"count\": 400 }}";

	}
}
