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
public class AtletaAmador extends AtletaNaoPro{   
    private static double parcelaFixa=0;
    private static double percParcelaVariavel=7;
    private static double valorMinimo=5;
    private static int qtdAtletaAmador=0;

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
    public AtletaAmador(int antiguidade, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(antiguidade, nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        qtdAtletaAmador++;
    }
    
    /**
     *Construtor vazio
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
        return obj instanceof AtletaAmador;
    }

    @Override
    public String toString() {
        return String.format("Atleta Amador: nome: %s", super.getNome());
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
     *Obter parcela fixa
     * @return Parcela Fixa
     */
    public static double getParcelaFixa() {
        return parcelaFixa;
    }
    
    /**
     *Obter parcela variável
     * @return Percentagem Parcela Variável
     */
    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }
    
    /**
     *Obter valor mínimo a pagar a atleta
     * @return Valor mínimo que o atleta tem de receber caso o valor mensal seja inferior ao mesmo
     */
    public static double getValorMinimo() {
        return valorMinimo;
    }
    
    /**
     *Obter quantidade de instâncias de Atletas Amadores
     * @return Quantidade de instâncias de Atletas Amadores
     */
    public static int getQtdAtletaAmador() {
        return qtdAtletaAmador;
    }
    
    /**
     *Alterar parcela fixa
     * @param parcelaFixa Parcela Fixa
     */
    public static void setParcelaFixa(double parcelaFixa) {
        AtletaAmador.parcelaFixa = parcelaFixa;
    }

    /**
     *Alterar parcela variável
     * @param percParcelaVariavel Percentagem Parcela Variável
     */
    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaAmador.percParcelaVariavel = percParcelaVariavel;
    }

    /**
     *Alterar valor mínimo a pagar ao atleta
     * @param valorMinimo Valor mínimo que o atleta tem de receber caso o valor mensal seja inferior ao mesmo
     */
    public static void setValorMinimo(double valorMinimo) {
        AtletaAmador.valorMinimo = valorMinimo;
    }

    
    
    
    
}
