
const url = "http://127.0.0.1:8080/pegar";

const meuPrimeiroApp = Vue.createApp({
    data() {
        return {
            results: []
        };
    },
    mounted() {
        axios.get(url)
            .then(response => {
                this.results = [response.data];
            })
            .catch(error => {
                console.error(error);
            });
    }
  }).mount('#app')
