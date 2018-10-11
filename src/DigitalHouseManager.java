import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DigitalHouseManager {
    private List<Aluno> listaDeAlunos  = new ArrayList<> ();
    private List<Professor> listaDeProfessores  = new ArrayList<> ();
    private List<Curso> listaDeCursos = new ArrayList<> ();
    private List<Matricula> listaDeMatriculas  = new ArrayList<> ();


    //////////////////////// Adiciona e remove Curso//////////////////////////

    // Percorre lista de curso e retorna boolean
    // true se ele nao esta na lista
    // false se ele esta na lista
    public Boolean percorreCursoRetornaBoolean(Integer codCurso){
        for (Curso umCurso:listaDeCursos) {
            if ( umCurso.getCodCurso().equals(codCurso) ) {
                return false;
            }
        }
        return true;
    }

    // Percorre lista de curso e retorna um curso
    public Curso percorreCursoRetornaCurso(Integer codCurso){
        for (Curso umCurso:listaDeCursos) {
            if ( umCurso.getCodCurso().equals(codCurso) ) {
                return umCurso;
            }
        }
        return null;
    }

    // Registra um curso e adiciona a lista de cursos
    public void registrarUmCurso(String nome,Integer codCurso,Integer quantMaxAlunos){
        if ( percorreCursoRetornaBoolean (codCurso) ){
            Curso curso = new Curso ();
            curso.setNome (nome);
            curso.setCodCurso (codCurso);
            curso.setQuantMaxAlunos (quantMaxAlunos);

            listaDeCursos.add (curso);
            System.out.println ("O curso de "+ nome+" de codigo "+ codCurso +" foi registrado com sucesso");
            System.out.println (listaDeCursos);
        }else {
                System.out.println ("O curso de codigo "+ codCurso+ " já existe, logo não pode ser adicionado!");
            }
    }
    // Exclui um curso se o codCurso estiver na lista de cursos
    // percorre a lista de cursos para poder excluir curso
    public void excluirCurso(Integer codCurso){
        if (!percorreCursoRetornaBoolean (codCurso) ){
            Curso cursoAserRemovido = percorreCursoRetornaCurso (codCurso);
            listaDeCursos.remove (cursoAserRemovido) ;
            System.out.println ("O curso "+ cursoAserRemovido.getNome ()+ " de código "+ codCurso+ "foi removido com sucesso!");
        }else {
            System.out.println ("O curso de código "+ codCurso + " não existe! Logo não pode ser excluido!");
        }

    }

    //////////////////////// Adiciona e remove Professor//////////////////////////
    // Percorre lista de professores e retorna boolean
    // true se ele nao esta na lista
    // false se ele esta na lista
    public Boolean percorreProfessorRetornaBoolean(Integer codProfessor){
        for (Professor umProfessor:listaDeProfessores) {
            if ( umProfessor.getCodProfessor ().equals (codProfessor) ) {
//                System.out.println ("professor esta na lista ");
                return false;
            }
        }
//        System.out.println ("professor nao esta na lista ");
        return true;
    }

    // Percorre lista de professores e retorna um professor
    public Professor percorreProfessoresRetornaProfessor(Integer codProfessor){
        for (Professor umProfessor:listaDeProfessores) {
            if ( umProfessor.getCodProfessor ().equals (codProfessor) ) {
                return umProfessor;
            }
        }
        return null;
    }

    //**Adiciona Professor Adjunto**//
    // Registra um Professor Adjunto e adiciona a lista de professores
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codProfessor, Integer quantHorasMonitoria) {
        if ( percorreProfessorRetornaBoolean (codProfessor)){
            ProfessorAdjunto professorAdjunto = new ProfessorAdjunto ();
            professorAdjunto.setNome (nome);
            professorAdjunto.setSobrenome (sobrenome);
            professorAdjunto.setCodProfessor (codProfessor);
            professorAdjunto.setQuantHorasMonitoria (quantHorasMonitoria);
            professorAdjunto.setTempoDeCasa (0);


            listaDeProfessores.add (professorAdjunto);
            System.out.println ("Professor adjunto "+ nome  +" registrado com sucesso!");
            System.out.println (listaDeProfessores);
        }else {
            System.out.println ("O professor de codigo "+ codProfessor+ " já existe, logo não pode ser adicionado!");
        }
    }
    //**Adiciona Professor Titular**//
    // Registra um Professor Titular e adiciona a lista de professores
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codProfessor, String especialidade) {
        if ( percorreProfessorRetornaBoolean (codProfessor)){
            ProfessorTitular professorTitular = new ProfessorTitular();
            professorTitular.setNome (nome);
            professorTitular.setSobrenome (sobrenome);
            professorTitular.setCodProfessor (codProfessor);
            professorTitular.setEspecialidade (especialidade);
            professorTitular.setTempoDeCasa (0);

            listaDeProfessores.add (professorTitular);
            System.out.println ("Professor Titular "+ nome  +" registrado com sucesso!");
            System.out.println (listaDeProfessores);
        }else {
            System.out.println ("O professor de codigo "+ codProfessor+ " já existe, logo não pode ser adicionado!");
        }
    }

    //**Remove Professor Adjunto e Professor Titular**//
    // Exclui um Professor se o codProfessor estiver na lista de Professores
    // percorre a lista de Professores para poder excluir Professor
    public void excluirProfessor(Integer codProfessor){
        if (!percorreProfessorRetornaBoolean (codProfessor) ){
            Professor professorAserRemovido = percorreProfessoresRetornaProfessor (codProfessor);
            listaDeProfessores.remove (professorAserRemovido) ;
            System.out.println ("Professor "+ professorAserRemovido.getNome ()+ " removido com sucesso!" );
        }else {
            System.out.println ("O professor de código "+ codProfessor + " não existe! Logo não pode ser excluido!");
        }

    }

    //////////////////////// Matricula e Remove Aluno//////////////////////////
    // Percorre lista de aluno e retorna boolean
    // true se ele nao esta na lista
    // false se ele esta na lista
    public Boolean percorreAlunoRetornaBoolean(Integer codAluno){
        for (Aluno umAluno:listaDeAlunos) {
            if ( umAluno.getCodAluno ().equals(codAluno) ) {
                return false;
            }
        }
        return true;
    }

    // Percorre lista de aluno e retorna um aluno
    public Aluno percorreAlunoRetornaAluno(Integer codAluno){
        for (Aluno umAluno:listaDeAlunos) {
            if ( umAluno.getCodAluno ().equals(codAluno) ) {
                return umAluno;
            }
        }
        return null;
    }
    // Registra um ALuno e adiciona a lista de alunos
    public void matricularAluno(String nome, String sobrenome, Integer codAluno){
        if ( percorreAlunoRetornaBoolean (codAluno) ){
            Aluno aluno = new Aluno (nome,sobrenome,codAluno);

            listaDeAlunos.add (aluno);
            System.out.println ("Aluno "+ nome  +" registrado com sucesso!");
            System.out.println (listaDeAlunos);
        }


    }

    // Exclui um aluno se o codAluno estiver na lista de alunos
    // percorre a lista de alunos para poder excluir alunos
    public void excluirAluno(Integer codAluno){
        if (!percorreAlunoRetornaBoolean (codAluno) ){
            Aluno alunoAserRemovido = percorreAlunoRetornaAluno (codAluno);
            listaDeAlunos.remove (alunoAserRemovido) ;
            System.out.println ("Aluno(a)"+ alunoAserRemovido.getNome ()+ " removido com sucesso!" );
            System.out.println (listaDeAlunos);
        }else {
            System.out.println ("O aluno de código "+ codAluno+ " não existe! Logo não pode ser excluido!");
        }

    }

    //////////////////////// Matricular Aluno em curso//////////////////////////

    // Percorre lista de matriculas e retorna boolean
    // true se ela nao esta na lista
    // false se ela esta na lista
    public Boolean percorreMatriculasRetornaBoolean(Integer codAluno, Integer codCurso){
        for (Matricula umaMatricula:listaDeMatriculas) {
            if ( umaMatricula.getUmAluno ().getCodAluno ().equals (codAluno) && umaMatricula.getUmCurso ().getCodCurso ().equals (codCurso)){
                return false;
            }
        }
        return true;
    }

    // Percorre lista de matricula e retorna uma matricula
    public Matricula percorreMatriculasRetornaMatricula(Integer codAluno, Integer codCurso){
        for (Matricula umaMatricula:listaDeMatriculas) {
            Boolean comparaAlunosMatriculado = umaMatricula.getUmAluno ().getCodAluno ().equals (codAluno);
            Boolean comparaCursos = umaMatricula.getUmCurso ().getCodCurso ().equals (codCurso);
            if ( comparaAlunosMatriculado && comparaCursos ) {
                return umaMatricula;
            }
        }
        return null;
    }


    // matricula um aluno a um curso(obs: estamos usando ---------- para o metodo matricularAluno)
    public void matricularAluno(Integer codigoAluno, Integer codigoCurso){
        Curso  cursoAserMatriculado = percorreCursoRetornaCurso (codigoCurso);
        Aluno alunoAserMatriculado = percorreAlunoRetornaAluno (codigoAluno);

        // Primeira parte do if verifica se o aluno já foi matriculado ao curso
        // segundo ele verifica se o aluno pode ser adicionado ao curso pela regra de quantidade de alunos e se ele já está em curso
        if ( percorreMatriculasRetornaBoolean (codigoAluno,codigoCurso) && cursoAserMatriculado.adicionarAluno (alunoAserMatriculado) ){
            Matricula matricula = new Matricula (alunoAserMatriculado,cursoAserMatriculado);
            listaDeMatriculas.add (matricula);
            System.out.println ("Aluno(a) "+alunoAserMatriculado.getNome () + " matriculado(a) ao curso "+ cursoAserMatriculado.getNome ());
            System.out.println ("Lista de matriculas: " + listaDeMatriculas);
            System.out.println ("Lista de matriculados no curso"+ cursoAserMatriculado.getListaAlunosMatriculados ());
        }else{
            System.out.println ("O aluno já foi matriculado ao curso");
        }

    }

    //////////////////////// Alocar Professores Adjunto e Titular em curso//////////////////////////
    // Percorre lista de professores e retorna um professor titular
    public ProfessorTitular percorreProfessoresTitularRetornaProfessor(Integer codProfessor){
        for (Professor umProfessor:listaDeProfessores) {
            if ( umProfessor.getCodProfessor ().equals (codProfessor) ) {
                return (ProfessorTitular) umProfessor;
            }
        }
        return null;
    }
    // Percorre lista de professores e retorna um professor Adjunto
    public ProfessorAdjunto percorreProfessoresAdjuntoRetornaProfessor(Integer codProfessor){
        for (Professor umProfessor:listaDeProfessores) {
            if ( umProfessor.getCodProfessor ().equals (codProfessor) ) {
                return (ProfessorAdjunto) umProfessor;
            }
        }
        return null;
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        Curso  cursoAserAlocado = percorreCursoRetornaCurso (codigoCurso);
        ProfessorTitular professorTitular = percorreProfessoresTitularRetornaProfessor (codigoProfessorTitular);
        ProfessorAdjunto professorAdjunto = percorreProfessoresAdjuntoRetornaProfessor (codigoProfessorAdjunto);

        if(!percorreProfessorRetornaBoolean (codigoProfessorTitular) && !percorreProfessorRetornaBoolean (codigoProfessorAdjunto)){
            cursoAserAlocado.setProfessorTitular (professorTitular);
            cursoAserAlocado.setProfessorAdjunto (professorAdjunto);
            System.out.println ("Professores "+ professorTitular.getNome () +" e "+ professorAdjunto.getNome ()+" alocados no curso de "+ cursoAserAlocado.getNome ());
        }else {
            System.out.println ("Código de curso ou de Professores incorreto!");
        }

    }








}