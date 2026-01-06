package aluno;

public class AlunoService {
    public boolean ativar(Aluno aluno){
        aluno.setStatus(true);
        return true;
    }

    public boolean cancelar(Aluno aluno){
        aluno.setStatus(false);
        return true;
    }

    public boolean estaAtiva(Aluno aluno){
        if(aluno.getStatus() == true){
            return true;
        } else {
            return false;
        }
    }
}
