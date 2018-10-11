import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {
    private String nome;
    private Integer codCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantMaxAlunos;
    private List<Aluno> listaAlunosMatriculados = new ArrayList<> ();

    // Percorre a lista de alunos matriculados e retorna true se o aluno ainda não está na lista
    // e pode ser adicionado e false se o alunos já está na lista
    public Boolean percorreListaAlunosMatriculados(Aluno aluno){
        for (Aluno umAluno: listaAlunosMatriculados) {
            if ( umAluno.equals (aluno) ){
                return false;
            }
        }
        return true;
    }
    //Adiciona um aluno a lista de alunos matriculados se e somente se.. A quantidade max de
    // alunos for maior que o tamanho(size) da lista de alunos
    // E se percorrer lista retornar true
    public Boolean adicionarAluno(Aluno umAluno){
        if ( quantMaxAlunos > listaAlunosMatriculados.size () && percorreListaAlunosMatriculados (umAluno)){
            listaAlunosMatriculados.add (umAluno);
            return true;

        }
        return false;
    }

    public void excluirAluno(Aluno umAluno){
        if ( !percorreListaAlunosMatriculados (umAluno) ){
            listaAlunosMatriculados.remove (umAluno);
        }
    }


    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantMaxAlunos() {
        return quantMaxAlunos;
    }

    public void setQuantMaxAlunos(Integer quantMaxAlunos) {
        this.quantMaxAlunos = quantMaxAlunos;
    }

    public List<Aluno> getListaAlunosMatriculados() {
        return listaAlunosMatriculados;
    }

    public void setListaAlunosMatriculados(List<Aluno> listaAlunosMatriculados) {
        this.listaAlunosMatriculados = listaAlunosMatriculados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }


    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass () != o.getClass () ) return false;
        Curso curso = (Curso) o;
        return Objects.equals (codCurso, curso.codCurso);
    }

    @Override
    public int hashCode() {
        return Objects.hash (codCurso);
    }
}
