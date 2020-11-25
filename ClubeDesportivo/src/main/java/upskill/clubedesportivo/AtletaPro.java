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
public class AtletaPro extends Atleta implements IRS {

    private double parcelaFixa;

    /**
     *
     * @param percParcelaVariavel Percentagem usada sobre o valor mensal de
     * prémios para cálculo da parcela variável
     * @param qtdAtletaPro Contador de instâncias de Atletas Profissionais
     */
    private static final double PARCELAFIXA_POR_OMISSAO = 0;

    private static double percParcelaVariavel = 20;
    private static int qtdAtletaPro = 0;

    /**
     *
     * @param parcelaFixa Parcela fixa, diferente entre atletas Profissionais,
     * usada para calcular o valor a receber ao fim do mês
     * @param parcelaVariavel Parcela variável dependente do valor mensal
     * arrecadado em prémios, usada para calcular o valor a receber ao fim do
     * mês
     * @param nome Nome do atleta.
     * @param nic Número de identificação civil do atleta.
     * @param genero Género do atleta.
     * @param idade Idade do atleta.
     * @param fcr Frequência cardíaca em repouso, valor que representa o número
     * de batimentos cardíacos em repouso durante 1 minuto.
     * @param atividade Atividade associada ao atleta: caminhada, corrida,
     * ciclismo ou natação.
     * @param objetivo Objetivo do atleta: queima de gordura ou capacidade
     * cardiorrespiratória. Determina IT(Intensidade de Treino).
     * @param premios Prémios arrecadados pelo atleta durante um mês.
     */
    public AtletaPro(double parcelaFixa, String nome, int nic, String genero, int idade, int fcr, String atividade, String objetivo, double premios) {
        super(nome, nic, genero, idade, fcr, atividade, objetivo, premios);
        this.parcelaFixa = parcelaFixa;
        qtdAtletaPro++;
    }

    /**
     *
     */
    public AtletaPro() {
        super();
        this.parcelaFixa = PARCELAFIXA_POR_OMISSAO;
        qtdAtletaPro++;
    }

    /**
     *
     * @return Parcela Fixa
     */
    public double getParcelaFixa() {
        return parcelaFixa;
    }

    /**
     *
     * @param parcelaFixa Parcela Fixa
     */
    public void setParcelaFixa(double parcelaFixa) {
        this.parcelaFixa = parcelaFixa;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AtletaPro)) {
            return false;
        }

        AtletaPro atletaPro = (AtletaPro) obj;

        return Double.compare(parcelaFixa, atletaPro.getParcelaFixa()) == 0;
    }

    @Override
    public String toString() {
        return String.format("Atleta profissional: nome: %s, parcelaFixa: %.2f", super.getNome(), parcelaFixa);
    }

    /**
     *
     * @return Valor mensal a pagar ao atleta, dependente de uma parcela fixa e
     * outra variável
     */
    @Override
    public double calcularValorMensal() {
        return parcelaFixa + (getPremios() * (percParcelaVariavel / 100));
    }

    /**
     *
     * @return Valor a descontar para IRS
     */
    @Override
    public double calcularIRS() {
        return parcelaFixa * (taxaIRS / 100);
    }

    /**
     *
     * @return Percentagem da Parcela Variável
     */
    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }

    /**
     *
     * @return Quantidade de instâncias de Atletas Profissionais
     */
    public static int getQtdAtletaPro() {
        return qtdAtletaPro;
    }

    /**
     *
     * @param percParcelaVariavel Percentagem da Parcela Variável
     */
    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaPro.percParcelaVariavel = percParcelaVariavel;
    }

}
