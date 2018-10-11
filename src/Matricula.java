import java.util.Date;

public class Matricula {
    private Aluno umAluno;
    private Curso umCurso;
    private Date dataDeMatricula;


    public Matricula(Aluno umAluno, Curso umCurso) {
        this.umAluno = umAluno;
        this.umCurso = umCurso;
        Date dataDeMatricula = new Date ();
    }

    public Aluno getUmAluno() {
        return umAluno;
    }

    public Curso getUmCurso() {
        return umCurso;
    }

    public Date getDataDeMatricula() {
        return dataDeMatricula;
    }
}
