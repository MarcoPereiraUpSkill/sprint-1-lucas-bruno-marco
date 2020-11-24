/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

/**
 *
 * @author Upskills
 */
public class MainClubeDesportivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criação de 3 objetos de cada uma das categorias(Pro,SemiPro,Amador) para serem
        // posteriormente armazenados na instância ClubeDesportivo
        Atleta[] atletas = new Atleta[3];
        
        // Criação de registos de atletas apenas para teste. Informação terá de ser
        // introduzida pelo Utilizador
        atletas[0] = new AtletaPro(600, 300, "Carlos", 123456789, "Masculino", 32, 70, "corrida");
        atletas[1] = new AtletaSemiPro(7, "Marta", 345678123, "Feminino", 27, 65, "ciclismo");
        atletas[2] = new AtletaAmador(22, "Jorge", 543876098, "Masculino", 40, 55, "caminhada");
        
        // Obter nome e FCM de cada atleta semiprofissional e amador. Falta obter FCT.
        for (int i = 0; i < atletas.length; i++) {
            if (atletas[i] instanceof AtletaSemiPro || atletas[i] instanceof AtletaAmador) System.out.format("Nome: %s, FCM: %s%n",atletas[i].getNome(), atletas[i].calcularFCM());
        }
    }
    
}
