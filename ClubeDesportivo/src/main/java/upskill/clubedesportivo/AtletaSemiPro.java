/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;

/**
 *
 * @author
 */
public class AtletaSemiPro extends AtletaNaoPro implements IRS{
   
    private static double parcelaFixa=500;

    /**
     *Construtor completo
     * @param antiguidade Número de anos que o atleta está afiliado ao clube.
     * @param nome Nome do atleta.
     * @param nic Número de identificação civil do atleta.
     * @param genero Género do atleta.
     * @param idade Idade do atleta.
     * @param fcr Frequência cardíaca em repouso, valor que representa o número de batimentos cardíacos em repouso durante 1 minuto.
     * @param atividade Atividade associada ao atleta: caminhada, corrida, ciclismo ou natação.
     * @param objetivo Objetivo do atleta: queima de gordura ou capacidade cardiorrespiratória. Determina IT(Intensidade de Treino).
     * @param premios Prémios arrecadados pelo atleta durante um mês.
     */
    public AtletaSemiPro(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(antiguidade, nome, nic, genero, idade, fcr, atividade, objetivo, premios);
    }
    
    /**
     *Construtor vazio
     */
    public AtletaSemiPro() {
        super();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return obj instanceof AtletaSemiPro;
    }

    @Override
    public String toString() {
        return String.format("Atleta Semi Profissional: nome: %s", super.getNome());
    }
    
    /**
     *
     * @return Valor mensal a pagar ao atleta, dependente de uma parcela fixa e outra variável
     */
    @Override
    public double calcularValorMensal(){
        return parcelaFixa+(parcelaFixa*(obterPercAntiguidade()/100));
    }
    
    /**
     *Calcula IRS a descontar pelo atleta
     * @return Valor a descontar para IRS
     */
    @Override
    public double calcularIRS(){
        return parcelaFixa*(TAXA_IRS/100);
    }

    /**
     *Obter parcela fixa
     * @return Parcela Fixa
     */
    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    /**
     *Alterar parcela fixa
     * @param parcelaFixa Parcela Fixa
     */
    public static void setParcelaFixa(double parcelaFixa) {
        AtletaSemiPro.parcelaFixa = parcelaFixa;
    }
  
}
