public class Main {
    public static void main(String[] args){
        AutoEscola autoEscola1 = new AutoEscola();

        Aluno pedro = new Aluno("Pedro", 19, "Carro");
        pedro.agendarAulaTeorica(3);
        pedro.agendarAulaPratica(2);
        pedro.cancelarAulaTeorica(4);
        pedro.cancelarAulaPratica(6);
        pedro.realizarExame();
        autoEscola1.adicionaAluno(pedro);

        Aluno renan = new Aluno("Renan", 18, "Moto");
        renan.agendarAulaTeorica(6);
        renan.agendarAulaPratica(5);
        renan.realizarExame();
        autoEscola1.adicionaAluno(renan);

        Aluno carlos = new Aluno("Carlos", 22, "Carro");
        carlos.agendarAulaTeorica(7);
        carlos.agendarAulaPratica(5);
        carlos.realizarExame();
        autoEscola1.adicionaAluno(carlos);

        Aluno julia = new Aluno("Julia", 19, "Carro");
        julia.agendarAulaTeorica(5);
        julia.agendarAulaPratica(2);
        julia.realizarExame();
        autoEscola1.adicionaAluno(julia);

        Instrutor mauro = new Instrutor("Mauro", 2, "Carro");
        autoEscola1.adicionaInstrutor(mauro);

        autoEscola1.exibirResumo();
    }
}
