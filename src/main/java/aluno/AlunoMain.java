package aluno;

public class AlunoMain {
    public static void main(String[] args) {
        AlunoService service = new AlunoService();
        AlunoController controller = new AlunoController(service);

        Aluno aluno1 = new Aluno(1, "Guilherme", "ADS", false);

        System.out.println("Nome do aluno: " + aluno1.getAluno());
        System.out.println("Curso do aluno: " + aluno1.getCurso());
        System.out.println("Status da matrícula: " + aluno1.getStatus());

        controller.ativar(aluno1);

        System.out.println("Status pós controller: " + aluno1.getStatus());
    }
}
