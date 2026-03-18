public class Main {
    public static void main(String[] args){
        AutoEscola autoEscola = new AutoEscola();

        Veiculo corsa = new Veiculo("Carro", "Corsa 1992", "F34-H2245");
        autoEscola.adicionaVeiculo(corsa);

        Aluno pedro = new Aluno("Pedro", 19, "Carro");
        pedro.agendarAulaTeorica(3);
        pedro.agendarAulaPratica(2);
        pedro.cancelarAulaTeorica(4);
        pedro.cancelarAulaPratica(6);
        pedro.realizarExame();
        autoEscola.adicionaAluno(pedro);

        Aluno renan = new Aluno("Renan", 18, "Moto");
        renan.agendarAulaTeorica(6);
        renan.agendarAulaPratica(5);
        renan.realizarExame();
        autoEscola.adicionaAluno(renan);

        Aluno carlos = new Aluno("Carlos", 22, "Carro");
        carlos.agendarAulaTeorica(7);
        carlos.agendarAulaPratica(5);
        carlos.realizarExame();
        autoEscola.adicionaAluno(carlos);

        Aluno julia = new Aluno("Julia", 19, "Carro");
        julia.agendarAulaTeorica(5);
        julia.agendarAulaPratica(2);
        julia.realizarExame();
        autoEscola.adicionaAluno(julia);

        Instrutor mauro = new Instrutor("Mauro", 2, "Carro");
        autoEscola.adicionaInstrutor(mauro);

        autoEscola.exibirResumo();
    }
}
