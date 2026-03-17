public class Aluno {
    String nome;
    int idade;
    String tipoVeiculo;
    int aulasTeoricas;
    int aulasPraticas;
    boolean aprovado;

    public Aluno(String nome, int idade, String tipoVeiculo){
        this.nome = nome;
        this.idade = idade;
        this.tipoVeiculo = tipoVeiculo;
        this.aprovado = false;
    }

    public void agendarAulaTeorica(){
        this.aulasTeoricas += 1;
        System.out.printf("Você tem %d aula(s) teóricas %n", this.aulasTeoricas);
    }

    public void agenderAulaPratica(){
        this.aulasPraticas += 1;
        System.out.printf("Você tem %d aula(s) práticas %n", this.aulasPraticas);
    }

    public void cancelarAulaTeorica(){
        if (this.aulasTeoricas >= 1){
            this.aulasTeoricas -= 1;
            System.out.printf("Você tem %d aula(s) teóricas %n", this.aulasPraticas);
        } else {
            System.out.println("NÃO A AULAS TEÓRICAS PARA CANCELAR");
        }
    }

    public void cancelarAulaPratica(){
        if (this.aulasPraticas >= 1){
            this.aulasPraticas -= 1;
            System.out.printf("Você tem %d aula(s) práticas %n", this.aulasPraticas);
        } else {
            System.out.println("NÃO A AULAS PRÁTICAS PARA CANCELAR %n");
        }
    }
}
