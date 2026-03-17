public class Main {
    public static void main(String[] args){
        Aluno pedro = new Aluno("Pedro", 19, "Carro");
        pedro.agendarAulaTeorica();
        pedro.agenderAulaPratica();
        pedro.cancelarAulaPratica();
        pedro.cancelarAulaPratica();
        pedro.realizarExame();
    }
}
