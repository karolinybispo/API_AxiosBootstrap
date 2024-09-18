
const url = "https://fakestoreapi.com/products"; // inseri a url da minha api desenvolvida no spring

const meuPrimeiroApp = Vue.createApp({
    data() {
        return {
            results: []
        };
    },
    mounted() {
        axios.get(url)
       
        .then(response => {
          this.results = response.data
        })

        .cath(error => {
            console.error("erro" , error);
        });
      }
  }).mount('#app')