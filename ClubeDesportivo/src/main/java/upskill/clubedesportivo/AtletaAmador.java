/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upskill.clubedesportivo;


/**
 *
 * @author Vicious
 */
public class AtletaAmador extends AtletaNaoPro{
    private static final double PARCELAVARIAVEL_POR_OMISSAO=0;
    
    private static double parcelaFixa=0;
    private static double parcelaVariavel=0;
    private static double percParcelaVariavel=7;
    private static double valorMinimo=5;
    private static int qtdAtletaAmador=0;

    /**
     *
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
    public AtletaAmador(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(antiguidade, nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        qtdAtletaAmador++;
    }
    
    /**
     *
     */
    public AtletaAmador() {
        super();
        qtdAtletaAmador++;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return obj instanceof Atleta;
    }

    @Override
    public String toString() {
        return "AtletaAmador{" + '}';
    }
    
    /**
     *
     * @return Valor mensal a pagar ao atleta, dependente de duas parcelas variáveis
     */
    @Override
    public double calcularValorMensal(){
        double valorMensal = (getPremios()*(obterPercAntiguidade()/100))+(getPremios()*(percParcelaVariavel/100));
        return valorMensal<valorMinimo ? valorMinimo : valorMensal; 
    }

    /**
     *
     * @return Parcela Fixa
     */
    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    /**
     *
     * @param parcelaFixa Parcela Fixa
     */
    public static void setParcelaFixa(double parcelaFixa) {
        AtletaAmador.parcelaFixa = parcelaFixa;
    }

    /**
     *
     * @return Parcela Variável
     */
    public static double getParcelaVariavel() {
        return parcelaVariavel;
    }

    /**
     *
     * @param parcelaVariavel Parcela Variável
     */
    public static void setParcelaVariavel(double parcelaVariavel) {
        AtletaAmador.parcelaVariavel = parcelaVariavel;
    }

    /**
     *
     * @return Percentagem Parcela Variável
     */
    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }

    /**
     *
     * @param percParcelaVariavel Percentagem Parcela Variável
     */
    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaAmador.percParcelaVariavel = percParcelaVariavel;
    }

    /**
     *
     * @return Valor mínimo que o atleta tem de receber caso o valor mensal seja inferior ao mesmo
     */
    public static double getValorMinimo() {
        return valorMinimo;
    }

    /**
     *
     * @param valorMinimo Valor mínimo que o atleta tem de receber caso o valor mensal seja inferior ao mesmo
     */
    public static void setValorMinimo(double valorMinimo) {
        AtletaAmador.valorMinimo = valorMinimo;
    }

    /**
     *
     * @return Quantidade de instâncias de Atletas Amadores
     */
    public static int getQtdAtletaAmador() {
        return qtdAtletaAmador;
    }
    
    
    
}
