import javax.swing.*;
import java.util.Locale;
import java.util.Random;

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
        System.out.printf("%n--- %S CRIADO COM SUCESSO --- %n", this.nome);
        JOptionPane.showMessageDialog(null, this.nome.toUpperCase(Locale.ROOT) + " CRIADO COM SUCESSO", "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }

    public void agendarAulaTeorica(int qtd){
        this.aulasTeoricas += qtd;
        System.out.printf("%S tem %d aula(s) teóricas %n", this.nome, this.aulasTeoricas);
    }

    public void agendarAulaPratica(int qtd){
        this.aulasPraticas += qtd;
        System.out.printf("%S tem %d aula(s) práticas %n", this.nome, this.aulasPraticas);
    }

    public void cancelarAulaTeorica(int qtd){
        if (this.aulasTeoricas >= qtd){
            this.aulasTeoricas -= qtd;
            System.out.printf("AULA(S) TEÓRICA(S) CANCELADAS COM SUCESSO - %S tem %d aula(s) teóricas %n", this.nome, this.aulasPraticas);
        } else {
            System.out.printf("%S TEM MENOS QUE %d AULAS PRÁTICAS PARA CANCELAR %n", this.nome, qtd);
        }
    }

    public void cancelarAulaPratica(int qtd){
        if (this.aulasPraticas >= qtd){
            this.aulasPraticas -= qtd;
            System.out.printf("AULA(S) PRÁTICA(S) CANCELADAS COM SUCESSO - %S tem %d aula(s) práticas %n", this.nome, this.aulasPraticas);
        } else {
            System.out.printf("%S TEM MENOS QUE %d AULAS PRÁTICAS PARA CANCELAR %n", this.nome, qtd);
        }
    }

    public void realizarExame(){
        if(this.aulasPraticas >= 5 && this.aulasTeoricas >= 5){
            Random random = new Random();
            this.aprovado = random.nextBoolean();
            if (this.aprovado){
                System.out.printf("PARABÉNS %S VOCÊ FOI APROVADO %n", this.nome);
            } else {
                System.out.printf("%S VOCÊ NÃO FOI APROVADO %n", this.nome);
            }

        } else {
            System.out.printf("%S NÃO TEM AULAS O SUFICIENTE PARA REALIZAR O EXAME / Aulas Práticas: %d - Aulas Teóricas: %d %n", this.nome, this.aulasPraticas, this.aulasTeoricas);
        }
    }
}
