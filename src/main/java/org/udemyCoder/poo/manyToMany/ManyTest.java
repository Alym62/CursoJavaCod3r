package org.udemyCoder.poo.manyToMany;

public class ManyTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Aly");
        Aluno alunoRafael = new Aluno("Rafael");
        Aluno alunoDonatello = new Aluno("Donatello");

        Curso curso = new Curso("Java Completo");
        Curso cursoGo = new Curso("Go Completo");
        Curso cursoPython = new Curso("Python Completo");

        curso.adicionarAluno(aluno);
        cursoGo.adicionarAluno(alunoRafael);
        cursoPython.adicionarAluno(alunoDonatello);

        aluno.adicionarCurso(cursoGo);

        cursoGo.getAlunos()
                .forEach(an -> {
                    System.out.println("Estou me matriculando no curso...");
                    System.out.println("E o meu nome é: " + an.getNome());
                    System.out.println();
                });

        System.out.println(aluno.getCursos().get(0).getAlunos());

        var cursoEncontrado = aluno.obterCursoPorNome("Go Completo");
        System.out.println(cursoEncontrado.getAlunos());
    }
}
