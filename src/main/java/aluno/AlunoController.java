package aluno;

public class AlunoController {

    private AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    public boolean ativar(Aluno aluno) {
        return service.ativar(aluno);
    }

    public boolean cancelar(Aluno aluno) {
        return service.cancelar(aluno);
    }

    public boolean estaAtiva(Aluno aluno) {
        return service.estaAtiva(aluno);
    }
}
