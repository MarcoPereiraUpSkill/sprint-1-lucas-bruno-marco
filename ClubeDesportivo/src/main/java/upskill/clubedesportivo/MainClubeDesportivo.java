/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Upskills
 */
public class MainClubeDesportivo {

    /**
     * @param args the command line arguments
     */
    private static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
//        menu();
//
//        // Criação de 3 objetos de cada uma das categorias(Pro,SemiPro,Amador) para serem
//        // posteriormente armazenados na instância ClubeDesportivo.
//        Atleta[] atletas = new Atleta[3];
//
//        // Criação de registos de atletas apenas para teste. Informação terá de ser
//        // introduzida pelo Utilizador
//        atletas[0] = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200);
//        atletas[1] = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800);
//        atletas[2] = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600);
//
////        // Obter nome, FCM e FCT de cada atleta semiprofissional e amador.
////        for (Atleta atleta : atletas) {
////            if (atleta instanceof AtletaSemiPro || atleta instanceof AtletaAmador) {
////                System.out.format("Nome: %s, FCM: %s, FCT: %s%n", atleta.getNome(), atleta.calcularFCM(), atleta.calcularFCT());
////            }
////        }
////        // Obter nome e valor a pagar a cada atleta
////        for (Atleta atleta : atletas) {
////            System.out.format("Nome: %s, Valor Mensal: %.2f%n", atleta.getNome(), atleta.calcularValorMensal());
////        }

        //Nova instância de ClubeDesportivo
        ClubeDesportivo vizela = new ClubeDesportivo("VizelaFC");

        //Armazenamento das instâncias no Clube Desportivo
        vizela.inserirAtleta(new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200));
        vizela.inserirAtleta(new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800));
        vizela.inserirAtleta(new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600));

        //Obter nome, FCM e FCT de cada atleta semiprofissional e amador.
        for (Atleta atleta : vizela.getAtletas()) {
            if (atleta instanceof AtletaSemiPro || atleta instanceof AtletaAmador) {
                System.out.format("Nome: %s, FCM: %s, FCT: %s%n", atleta.getNome(), atleta.calcularFCM(), atleta.calcularFCT());
            }
        }
        System.out.println();

        // Obter nome e valor a pagar a cada atleta
        for (Atleta atleta : vizela.getAtletas()) {
            System.out.format("Nome: %s, Valor Mensal: %.2f%n", atleta.getNome(), atleta.calcularValorMensal());
        }
        System.out.println();

        //Apresentar quantidade de instâncias de atletas amadores e profissionais sem percorrer o contentor
        System.out.println("Quantidade de instâncias de atletas amadores: " + AtletaAmador.getQtdAtletaAmador());
        System.out.println("Quantidade de instâncias de atletas profissionais: " + AtletaPro.getQtdAtletaPro());
        System.out.println();

        //Calcular e apresentar o valor total a pagar a cada tipo de atleta
        double valorPro = 0, valorSemiPro = 0, valorAmador = 0;
        for (Atleta atleta : vizela.getAtletas()) {
            if (atleta instanceof AtletaPro) {
                valorPro += atleta.calcularValorMensal();
            } else if (atleta instanceof AtletaSemiPro) {
                valorSemiPro += atleta.calcularValorMensal();
            } else if(atleta instanceof AtletaAmador) {
                valorAmador += atleta.calcularValorMensal();
            } else return;
        }
        System.out.println("Valor a pagar a atletas profissionais: " + valorPro);
        System.out.println("Valor a pagar a atletas semiprofissionais: " + valorSemiPro);
        System.out.println("Valor a pagar a atletas amadores: " + valorAmador);
        System.out.println();

        //Retornar o nome do clube
        System.out.println("Nome do clube: " + vizela.getNome());
        
        //Inserir um novo atleta no contentor
        vizela.inserirAtleta(new AtletaPro(400, 350, "Marco", 345452889, "Masculino", 21, 68, "corrida", "QueimaGordura", 2400));
        
        //Retornar uma lista de atletas, ordenada alfabeticamente por nome
        Collections.sort(vizela.getAtletas());
        for (Atleta atleta : vizela.getAtletas()) {
            System.out.format("Nome: %s%n", atleta.getNome());
        }
        System.out.println();
        
        //Retornar uma lista de atletas, ordenada inversamente pelo valor dos prémios
        OrdenarPremios ordenarPremios = new OrdenarPremios();
        Collections.sort(vizela.getAtletas(), ordenarPremios.reversed());
        for (Atleta atleta : vizela.getAtletas()) {
            System.out.format("Nome: %s, Premios: %.2f%n", atleta.getNome(), atleta.getPremios());
        }
        
    }

    private static void menu() {
        int op = 0;
        boolean sair = false;
        while (op != 7) {
            System.out.println("########## Menu ##########");
            System.out.println("1.Inserir novo atleta");
            System.out.println("2.Listar atletas");
            System.out.println("3.Apresentar valor a pagar ao atleta");
            System.out.println("4.Apresentar valor total de todos os atletas");
            System.out.println("5.Calcular FCM");
            System.out.println("6.Calcular FCT");
            System.out.println("7.Sair");
            do {
                System.out.println("Introduza opção:");
                op = Integer.valueOf(ler.nextLine());
                if (op < 1 && op > 7) {
                    System.out.println("Opção incorreta!");
                }

            } while (op < 1 && op > 7);

            switch (op) {

                case 1:
                    inserirAtleta();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
            }
        }
    }

    private static void inserirAtleta() {
        Atleta[] atleta = new Atleta[1];
        int op;
        String op2;
        do {
            System.out.println("Introduza categoria do atleta\n(1-Profissional|2-SemiProfissional|3-Amador): ");
            op = Integer.valueOf(ler.nextLine());
        } while (op < 1 || op > 3);

        if (op == 1) {
            atleta[0] = new AtletaPro();
        }
        if (op == 2) {
            atleta[0] = new AtletaSemiPro();
        }
        if (op == 3) {
            atleta[0] = new AtletaAmador();
        }

        System.out.println("Introduza nome do atleta: ");
        atleta[0].setNome(ler.nextLine());
        System.out.println("Introduza Número de Identificação Civil: ");
        atleta[0].setNic(Integer.valueOf(ler.nextLine()));
        do {
            System.out.println("Introduza género do atleta(Masculino,Feminino): ");
            atleta[0].setGenero(ler.nextLine());
        } while (!atleta[0].getGenero().equalsIgnoreCase("masculino") && !atleta[0].getGenero().equalsIgnoreCase("feminino"));
        System.out.println("Introduza Idade: ");
        atleta[0].setIdade(Integer.valueOf(ler.nextLine()));
        System.out.println("Introduza FCR: ");
        atleta[0].setFcr(Integer.valueOf(ler.nextLine()));
//        do{
//            System.out.println("Introduza Atividade Associada: ");
//            atleta[0].setAtividade(Integer.valueOf(ler.nextLine()));
//        }(while !Atleta.val)

    }
}
