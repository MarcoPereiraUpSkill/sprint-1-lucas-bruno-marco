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
public interface IRS {

    /**
     *Taxa imutável sobre a parcela fixa dos Atletas Profissionais e Semiprofissionais
     */
    public static final double TAXA_IRS=10;
    
    /**
     *Método abstrato para calcular o IRS a descontar nas categorias Profissional e Semiprofissional
     * @return
     */
    public abstract double calcularIRS();
}
