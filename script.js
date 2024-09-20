
const url = "http://127.0.0.1:8080/pegar"; 

const meuPrimeiroApp = Vue.createApp({ //Vue.createApp: criei uma nova instancia do aplicativo vue que sera montado no id app
    data() { // funcao que retorna um objeto com as propriedades e valores q quero usar dentro meu aplicativo.
        return {
            results: [] // array vazio que sera retornado.
        };
    },
    mounted() { // eh executado automaticamente assim que a pg eh mostrada ao user. Ou seja, assim que o aplicativo vue eh montado, o mounted entra em acao.
        axios.get(url) // axios faz requisicao get.
            .then(response => { //.then lida com a resposta da API.
                                //response: contem os dados da API.
            this.results = [response.data];  // response.data: passa a resposta da API para o array results
            })

            .catch(error => { // entra em acao apenas se ocorrer erros durante a requisicao
                console.error(error);
            });
    }
  }).mount('#app') // monta o aplicativo vue no id app. Isso faz com que o Vue controle esse pedaço do DOM e preencha a interface com os dados e a lógica que você definiu;
                // o obj eh conectar o app Vue ao DOM.
