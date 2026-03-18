import java.util.ArrayList;

public class AutoEscola {
    ArrayList<Aluno> alunos = new ArrayList<>();
    ArrayList<Instrutor> instrutores = new ArrayList<>();
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionaAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void adicionaInstrutor(Instrutor instrutor){
        this.instrutores.add(instrutor);
    }

    public void adicionaVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void exibirResumo(){
        System.out.printf("%n--- AUTOESCOLA ---%n");
        System.out.println("INSTRUTORES");
        for (Instrutor instrutor : instrutores){
            System.out.printf("- Instrutor: %s %n", instrutor.nome);
            System.out.printf("Categoria: %s %n", instrutor.categoria);
            System.out.printf("Experiência: %d Anos %n", instrutor.experiencia);
        }

        System.out.printf("%n");

        System.out.println("VEÍCULOS");
        for (Veiculo veiculo : veiculos){
            System.out.printf("- Veículo: %s %n", veiculo.modelo);
            System.out.printf("Tipo: %s %n", veiculo.tipo);
            System.out.printf("placa: %s %n", veiculo.placa);
        }

        System.out.printf("%n");

        System.out.println("ALUNOS");
        for(Aluno aluno : alunos){
            System.out.printf("- %S %n", aluno.nome);
            System.out.printf("Tipo do Veículo: %s %n", aluno.tipoVeiculo);
            System.out.printf("Aulas Teóricas feitas: %d %n", aluno.aulasTeoricas);
            System.out.printf("Aulas Práticas feitas: %d %n", aluno.aulasPraticas);
            if(aluno.aprovado){
                System.out.printf("%S foi aprovado %n %n", aluno.nome);
            } else {
                System.out.printf("%S NÃO foi aprovado(a) %n", aluno.nome);
            }
        }
    }
}
