/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

import java.util.Scanner;

/**
 *
 * @author Upskills
 */
public class MainClubeDesportivo {

    /**
     * @param args the command line arguments
     */
    Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        int op;
        
        
        // Criação de 3 objetos de cada uma das categorias(Pro,SemiPro,Amador) para serem
        // posteriormente armazenados na instância ClubeDesportivo.
        Atleta[] atletas = new Atleta[4];
        
        // Criação de registos de atletas apenas para teste. Informação terá de ser
        // introduzida pelo Utilizador
        atletas[0] = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
        atletas[1] = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
        atletas[2] = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600);
        
        // Obter nome, FCM e FCT de cada atleta semiprofissional e amador.
        for (Atleta atleta : atletas) {
            if (atleta instanceof AtletaSemiPro || atleta instanceof AtletaAmador) {
                System.out.format("Nome: %s, FCM: %s, FCT: %s%n", atleta.getNome(), atleta.calcularFCM(), atleta.calcularFCT());
            }
        }
        // Obter nome e valor a pagar a cada atleta
        for (Atleta atleta : atletas){
            System.out.format("Nome: %s, Valor Mensal: %.2f%n", atleta.getNome(), atleta.calcularValorMensal());
        }
        //Apresentar quantidade de instâncias de atletas amadores e profissionais sem percorrer o contentor
        System.out.println("Quantidade de instâncias de atletas amadores: "+AtletaAmador.getQtdAtletaAmador());
        System.out.println("Quantidade de instâncias de atletas profissionais: "+AtletaPro.getQtdAtletaPro());
         
      
    }
    
    private static void menu(){
        System.out.println("########## Menu ##########");
        System.out.println("0.Sair");
        System.out.println("1.Inserir novo atleta");
        System.out.println("2.Listar atletas");
        System.out.println("3.Apresentar valor a pagar ao atleta");
        System.out.println("4.Apresentar valor total de todos os atletas");
        System.out.println("5.Calcular FCM");
        System.out.println("6.Calcular FCT");
        System.out.println("Introduza opção:");
    }
    
}
