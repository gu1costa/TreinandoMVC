package aluno;

public class Aluno {

    private int id;
    private String aluno;
    private String curso;
    private boolean status;

    public Aluno(){}

    public Aluno(int id, String aluno, String curso, boolean status) {
        this.id = id;
        this.aluno = aluno;
        this.curso = curso;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
