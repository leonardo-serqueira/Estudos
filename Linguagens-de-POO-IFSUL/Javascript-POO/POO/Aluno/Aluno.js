function Aluno () {

    var nome;
    var idade;
    var curso;

    this.setNome = function (vNome) {
        nome = vNome;
    }

    this.setIdade = function (vIdade) {
        idade = vIdade;
    }

    this.setCurso = function (vCurso) {
        curso = vCurso;
    }

    this.getNome = function () {
        return nome;
    }

    this.getIdade = function () {
        return idade;
    }

    this.getCurso = function () {
        return curso;
    }
    
    this.mostraDados = function () {
        alert("Nome do aluno: " + this.getNome() +
        "\nIdade: " + this.getIdade() +
        "\nCurso: " + this.getCurso());
    }

}

var Aluno = new Aluno();

Aluno.setNome("Fernando");
Aluno.setIdade("35");
Aluno.setCurso("Linguagem Javascript");
Aluno.mostraDados();