var idade;
idade = prompt("Digite a sua idade: ");

if (idade >= 18) {
    var maiorIdade = true;
} else {
    var maiorIdade = false;
}

if (maiorIdade){
    document.write("Maior de idade. Pode dirigir! ");
} else {
    document.write("Menor de idade. :( ");
}