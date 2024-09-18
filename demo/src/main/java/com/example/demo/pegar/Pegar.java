package com.example.demo.pegar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pegar")
public class Pegar {
	
	//Requisicao feita ao endpoint '/pegar' o metodo mensagemJson vai responder.

	// Fazendo uma requisicao GET para http://localhost:8080/pegar o spring manda essa requisicao para o metodo com anotacion get.
	@GetMapping //nao defini nenhum parametro para essa annotacion ent para chegar nesse metodo basta o endpoint: /pegar definido no requestmapping.
	public String mensagemJson() {
		return "{\n" +
            "  \"id\": 7,\n" +
            "  \"title\": \"White Gold Plated Princess\",\n" +
            "  \"price\": 9.99,\n" +
            "  \"description\": \"Classic Created Wedding Engagement Solitaire Diamond Promise Ring for Her. Gifts to spoil your love more for Engagement, Wedding, Anniversary, Valentine's Day...\",\n" +
            "  \"category\": \"jewelery\",\n" +
            "  \"image\": \"https://fakestoreapi.com/img/71YAIFU48IL._AC_UL640_QL65_ML3_.jpg\",\n" +
            "  \"rating\": {\n" +
            "    \"rate\": 3,\n" +
            "    \"count\": 400\n" +
            "  }\n" +
            "}";
	}
}
