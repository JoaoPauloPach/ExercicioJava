
package exercicios.java;

import java.util.Scanner;

public class ExerciciosJava {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner (System.in);
    
    //___________BLOCO DE DECLARAÇÃO DE VAR______________
        String nome;
        
        double idade;
        
        double cpf;
        
        double matricula;
        
        double N1;
        
        double N2;
        
        double media;
        
        String materia;
       
        
    //___________________________________________________
    
    //___________BLOCO DE ENTRADA DE DADOS_______________
        System.out.println("Digite o seu nome: ");
        
        nome = entrada.nextLine();
        
        System.out.println("Digite a sua idade: ");
        
        idade = entrada.nextInt();
        
        System.out.println("Digite o seu cpf: ");
        
        cpf = entrada.nextDouble ();
        
        System.out.println("Digite o nome da matéria: ");
        
        materia = entrada.next();
        
        System.out.println("Digite o seu numero de matrícula: ");
        
        matricula = entrada.nextDouble ();
        
        System.out.println("Digite sua nota da N1: ");
        
        N1 = entrada.nextDouble ();
        
        System.out.println("Digite sua nota da N2: ");
        
        N2 = entrada.nextDouble ();
        
    //___________________________________________________
   
    
    //___________CALCULO DE MÉDIA________________________
    
        media = (N1+N2)/2 ;
        

    //___________________________________________________
    
    //___________SAÍA DO PROGRAMA________________________
        System.out.println("__________________________");
        
        System.out.println("______DADOS DO ALUNO______");
        
        System.out.println("Nome:"+nome);
        
        System.out.println("Idade:"+idade);
        
        System.out.println("Cpf:"+cpf);
        
        System.out.println("Matrícula:"+matricula);
        
        System.out.println("Matéria:"+materia);
        
        System.out.println("N1:"+N1);
        
        System.out.println("N2:"+N2);
        
        System.out.println("Média:"+media);
        
        if(media >= 8 ){
            System.out.println("Você foi Aprovado");
        } 
        else {
            System.out.println("Você foi Reprovado");
        }
    
        
    //___________________________________________________
    
    }
    
}
