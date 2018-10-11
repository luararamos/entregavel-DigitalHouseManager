import java.util.Objects;

public class Aluno {
    private String nome;
    private String sobrenome;
    private Integer codAluno;

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public Integer getCodAluno() {
        return codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass () != o.getClass () ) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals (codAluno, aluno.codAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash (codAluno);
    }
}
