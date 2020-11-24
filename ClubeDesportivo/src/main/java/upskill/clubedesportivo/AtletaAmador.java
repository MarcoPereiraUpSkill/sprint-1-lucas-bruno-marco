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

    public AtletaAmador(int antiguidade, String nome, int nic, String genero, int idade, int fcr) {
        super(antiguidade, nome, nic, genero, idade, fcr);
    }

    @Override
    public String toString() {
        return "AtletaAmador{" + '}';
    }

    public static double getParcelaFixa() {
        return parcelaFixa;
    }

    public static void setParcelaFixa(double parcelaFixa) {
        AtletaAmador.parcelaFixa = parcelaFixa;
    }

    public static double getParcelaVariavel() {
        return parcelaVariavel;
    }

    public static void setParcelaVariavel(double parcelaVariavel) {
        AtletaAmador.parcelaVariavel = parcelaVariavel;
    }

    public static double getPercParcelaVariavel() {
        return percParcelaVariavel;
    }

    public static void setPercParcelaVariavel(double percParcelaVariavel) {
        AtletaAmador.percParcelaVariavel = percParcelaVariavel;
    }

    public static double getValorMinimo() {
        return valorMinimo;
    }

    public static void setValorMinimo(double valorMinimo) {
        AtletaAmador.valorMinimo = valorMinimo;
    }
    
    
}