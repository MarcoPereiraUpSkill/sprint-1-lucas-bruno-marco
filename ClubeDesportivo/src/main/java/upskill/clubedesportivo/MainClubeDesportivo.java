/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

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

        //Nova instância de ClubeDesportivo
        ClubeDesportivo vizela = new ClubeDesportivo("VizelaFC");

        //Armazenamento das instâncias no Clube Desportivo
        vizela.inserirAtleta(new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida", "QueimaGordura", 1200));
        vizela.inserirAtleta(new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo", "CapacidadeCardio", 800));
        vizela.inserirAtleta(new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada", "QueimaGordura", 600));

        System.out.println("###### Obter nome, FCM e FCT de cada atleta semiprofissional e amador ######");
        for (Atleta atleta : vizela.getAtletas()) {
            if (atleta instanceof AtletaSemiPro || atleta instanceof AtletaAmador) {
                System.out.format("Nome: %s, FCM: %s, FCT: %s%n", atleta.getNome(), atleta.calcularFCM(), atleta.calcularFCT());
            }
        }
        System.out.println();

        System.out.println("###### Obter nome e valor a pagar a cada atleta ######");
        for (Atleta atleta : vizela.getAtletas()) {
            System.out.format("Nome: %s, Valor Mensal: %.2f%n", atleta.getNome(), atleta.calcularValorMensal());
        }
        System.out.println();

        System.out.println("###### Apresentar quantidade de instâncias de atletas amadores e profissionais sem percorrer o contentor ######");
        System.out.println("Quantidade de instâncias de atletas amadores: " + AtletaAmador.getQtdAtletaAmador());
        System.out.println("Quantidade de instâncias de atletas profissionais: " + AtletaPro.getQtdAtletaPro());
        System.out.println();

        System.out.println("###### Calcular e apresentar o valor a pagar a cada tipo de atleta ######");
        double valorPro = 0, valorSemiPro = 0, valorAmador = 0;
        for (Atleta atleta : vizela.getAtletas()) {
            if (atleta instanceof AtletaPro) {
                valorPro += atleta.calcularValorMensal();
            } else if (atleta instanceof AtletaSemiPro) {
                valorSemiPro += atleta.calcularValorMensal();
            } else if (atleta instanceof AtletaAmador) {
                valorAmador += atleta.calcularValorMensal();
            } else {
                return;
            }
        }
        System.out.println("Valor a pagar a atletas profissionais: " + valorPro);
        System.out.println("Valor a pagar a atletas semiprofissionais: " + valorSemiPro);
        System.out.println("Valor a pagar a atletas amadores: " + valorAmador);
        System.out.println();

        System.out.println("###### Obter nome do clube ######");
        System.out.println("Nome do clube: " + vizela.getNome());
        System.out.println();

        //Inserir um novo atleta no contentor
        vizela.inserirAtleta(new AtletaPro(400, 350, "Marco", 345452889, "Masculino", 21, 68, "corrida", "QueimaGordura", 2400));

        System.out.println("###### Lista de atletas ordenadas alfabeticamente por nome ######");
        for (Atleta atleta : vizela.ordenarAlfabeticamenteNome()) {
            System.out.format("Nome: %s%n", atleta.getNome());
        }
        System.out.println();

        //Retornar uma lista de atletas, ordenada inversamente pelo valor dos prémios
        System.out.println("###### Lista de atletas ordenadas inversamente por prémios ######");
        for (Atleta atleta : vizela.ordenarInversamentePremios()) {
            System.out.format("Nome: %s, Premios: %.2f%n", atleta.getNome(), atleta.getPremios());
        }
        System.out.println();

        //Retornar o valor total dos atletas, para efeito de IRS
        System.out.println("###### Calcular valor total dos atletas, para efeitos de IRS ######");
        System.out.println("IRS: " + vizela.calcularTotalIRS());
        System.out.println();

        //Retornar uma lista de atletas do clube, ordenada alfabeticamente por categoria, modalidade e nome
        System.out.println("###### Retornar uma lista de atletas do clube, ordenada alfabeticamente por categoria, modalidade e nome #####");
        for (Atleta atleta : vizela.ordenarCategoriaModalidadeNome()) {
            System.out.format("Categoria: %s, Modalidade: %s, Nome: %s%n", atleta.getClass().getSimpleName(), atleta.getAtividade(), atleta.getNome());
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
//                    inserirAtleta();
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

//    private static void inserirAtleta() {
//        Atleta[] atleta = new Atleta[1];
//        int op;
//        String op2;
//        do {
//            System.out.println("Introduza categoria do atleta\n(1-Profissional|2-SemiProfissional|3-Amador): ");
//            op = Integer.valueOf(ler.nextLine());
//        } while (op < 1 || op > 3);
//
//        if (op == 1) {
//            atleta[0] = new AtletaPro();
//        }
//        if (op == 2) {
//            atleta[0] = new AtletaSemiPro();
//        }
//        if (op == 3) {
//            atleta[0] = new AtletaAmador();
//        }
//
//        System.out.println("Introduza nome do atleta: ");
//        atleta[0].setNome(ler.nextLine());
//        System.out.println("Introduza Número de Identificação Civil: ");
//        atleta[0].setNic(Integer.valueOf(ler.nextLine()));
//        do {
//            System.out.println("Introduza género do atleta(Masculino,Feminino): ");
//            atleta[0].setGenero(ler.nextLine());
//        } while (!atleta[0].getGenero().equalsIgnoreCase("masculino") && !atleta[0].getGenero().equalsIgnoreCase("feminino"));
//        System.out.println("Introduza Idade: ");
//        atleta[0].setIdade(Integer.valueOf(ler.nextLine()));
//        System.out.println("Introduza FCR: ");
//        atleta[0].setFcr(Integer.valueOf(ler.nextLine()));
////        do{
//            System.out.println("Introduza Atividade Associada: ");
//            atleta[0].setAtividade(Integer.valueOf(ler.nextLine()));
//        }(while !Atleta.val)
}

//Apresentar quantidade de instâncias de atletas amadores e profissionais sem percorrer o contentor
//        System.out.println("Quantidade de instâncias de atletas amadores: "+AtletaAmador.getQtdAtletaAmador());
//        System.out.println("Quantidade de instâncias de atletas profissionais: "+AtletaPro.getQtdAtletaPro());
//        
//        
//        //Calcular e apresentar valor total a pagar a cada tipo de atleta (Profissional, SemiProfissional, Amador)
//        // Calcular e apresentar valor total de todos os atletas
//        double totalPro=0, totalSemiPro=0, totalAmador=0;
//        for (Atleta atleta : atletas){
//            if (atleta instanceof AtletaPro)    totalPro+=atleta.calcularValorMensal();
//            if (atleta instanceof AtletaSemiPro)    totalSemiPro+=atleta.calcularValorMensal();
//            if (atleta instanceof AtletaAmador)    totalAmador+=atleta.calcularValorMensal();
//        }
//        System.out.format("Valor Total Profissionais: %.2f%nValor Total SemiProfissionais: %.2f%n"
//                + "Valor Total Amadores: %.2f%nValor Total Atletas: %.2f", totalPro, totalSemiPro, totalAmador, totalPro+totalSemiPro+totalAmador);
//    }
//    private static void menu(){
//        int op=0;
//        boolean sair=false;
//        while (op!=7){
//            System.out.println("########## Menu ##########");
//            System.out.println("1.Inserir novo atleta");
//            System.out.println("2.Listar atletas");
//            System.out.println("3.Apresentar valor a pagar ao atleta");
//            System.out.println("4.Apresentar valor total de todos os atletas");
//            System.out.println("5.Calcular FCM");
//            System.out.println("6.Calcular FCT");
//            System.out.println("7.Sair");
//            do{
//                System.out.println("Introduza opção:");
//                op = Integer.valueOf(ler.nextLine());
//                if (op < 1 && op > 7) System.out.println("Opção incorreta!");
//
//            }while(op < 1 && op > 7);
//            
//            switch (op) {
//
//                case 1: inserirAtleta();
//                        break;
//                case 2: break;
//                case 3: break;
//                case 4: break;
//                case 5: break;
//                case 6: break;
//                case 7: break;
//                default:
//            }
//        }      
//    }
//    private static void inserirAtleta() {
//        Atleta[] atleta = new Atleta[1];
//        int op;
//        String op2;
//        do{
//            System.out.println("Introduza categoria do atleta\n(1-Profissional|2-SemiProfissional|3-Amador): ");
//            op = Integer.valueOf(ler.nextLine());
//        }while(op<1 || op>3);
//        
//        
//        if (op==1)  atleta[0] = new AtletaPro();
//        if (op==2)  atleta[0] = new AtletaSemiPro();
//        if (op==3)  atleta[0] = new AtletaAmador();
//        
//        System.out.println("Introduza nome do atleta: ");
//        atleta[0].setNome(ler.nextLine());
//        System.out.println("Introduza Número de Identificação Civil: ");
//        atleta[0].setNic(Integer.valueOf(ler.nextLine()));
//        do{
//            System.out.println("Introduza género do atleta(Masculino,Feminino): ");
//            atleta[0].setGenero(ler.nextLine());
//        }while(!atleta[0].getGenero().equalsIgnoreCase("masculino") && !atleta[0].getGenero().equalsIgnoreCase("feminino"));
//        System.out.println("Introduza Idade: ");
//        atleta[0].setIdade(Integer.valueOf(ler.nextLine()));
//        System.out.println("Introduza FCR: ");
//        atleta[0].setFcr(Integer.valueOf(ler.nextLine()));
//        do{
//            System.out.println("Introduza Atividade Associada: ");
//            atleta[0].setAtividade(ler.nextLine());
//        }while (!atleta[0].validarAtividade());
//        do{
//            System.out.println("Introduza Objetivo(QueimaGordura,CapacidadeCardio): ");
//            atleta[0].setObjetivo(ler.nextLine());
//        }while (!atleta[0].validarObjetivo()); 
//        System.out.println("Introduza Valor Prémios: ");
//        atleta[0].setPremios(Integer.valueOf(ler.nextLine()));
//    }
//}
