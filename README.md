#### API_axiosEbotstrap

# Pagina web com Vue e Botstrap que faz requisicao get a API:

## Botstrap
- Link: https://getbootstrap.com/: o site oficial fornece o link para incluir o css e js do botstrap.
*  css: fica na tag 'link' dentro de head.
*  js: fica na tag 'script' antes de fechar o body.

## API (criada no spring boot):
* usei as dependencias: Spring Boot DevTools e Sring Web.
- spring web: constroi api rest e lida com requisicoes http || spring boot devtools: recarrega o servidor automaticamente.
### Passos no spring:
- spring foi colocado dentro da pasta do github.
- criei: 'Create new Spring Starter Project'.
- adc dependencias: Spring Boot DevTools e Sring Web.
- testei o servidor 8080 no "run as". 
- criei uma classe: sobre o pacote do nosso projeto (com.example.demo) e escolha New>Class. No package e name deixe o nome igual. No name (que eh a classe) deixe maiusculo e no package deixe minusculo/
- nessa classe inicia o processo de criacao da API.
- adicionando anotacoes: acima do public adicione  @RestController, ela informa ao Spring que esta classe é um controlador REST | O @RequestMapping é responsável por mapear as requisições do cliente com endpoint específico, o parametro dessa anotacao será o que voce preferir (?).