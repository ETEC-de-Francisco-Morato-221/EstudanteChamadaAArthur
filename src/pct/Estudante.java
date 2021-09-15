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
public class Estudante {
    String nome;
    char nota;
    double frequencia;
    boolean matriculaTrancada;
    String Matricula;
    int registoAluno;
    
    
    public void apresentarEstudante() {
        if (matriculaTrancada = false) 
        {
            Matricula = "Trancado";
        } else 
        {
            Matricula = "Cursando";
        }
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Situação da matricula: " + Matricula);
        System.out.println("Frequencia: " + frequencia);
        System.out.println("RM: " + registoAluno);
        
    }
    public void responderChamada() { 
        System.out.println("Presente!!!");
        frequencia += 1.25;
        
        System.out.println(nome + " sua frequencia atual é: " + frequencia + "h/aula.");
        

    
    }
}
