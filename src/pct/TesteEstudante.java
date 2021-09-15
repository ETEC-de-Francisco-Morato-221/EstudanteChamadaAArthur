/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Artu
 */
public class TesteEstudante {
    public static void main(String[] args) {

    
    // Criação e instancia do objeto de classe Estudante
    Estudante meuAluno = new Estudante();
    
    // Construção do objeto
    meuAluno.nome = "Arthur";
    meuAluno.nota = 'B';
    meuAluno.frequencia = 0;
    meuAluno.matriculaTrancada = false;
    meuAluno.registoAluno = 20067;
    
    // Apresentando aluno.
    System.out.println("Nosso Aluno: ");
    meuAluno.apresentarEstudante();
    
    // Respondendo chamada.
    meuAluno.responderChamada();
    
    meuAluno.responderChamada();
    
    meuAluno.responderChamada();
    
    
    
    
    
}
}
