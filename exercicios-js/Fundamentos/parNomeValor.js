// par nome/valor
const saudacao = 'Opa'; // Contexto léxico 1
function exec() {
  const saudacao = 'Falaaa'; //contexto léxico2
  return saudacao;
}

//Objetos são grupos aninhados de pares nome/valor
const cliente = {
  nome: 'Pedro',
  idade: 32,
  peso: 90,
  endereco: {
    logradoruro: 'Rua Muito legal',
    numero: 123,
  },
};

console.log(saudacao);
console.log(exec());
