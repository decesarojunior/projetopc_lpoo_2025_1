
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class Funcionario extends Pessoa{
    
    private String numero_ctps;
    private Date data_admissao;
    private Date data_demissao;

    public Funcionario() {
    }

    /**
     * @return the numero_ctps
     */
    public String getNumero_ctps() {
        return numero_ctps;
    }

    /**
     * @param numero_ctps the numero_ctps to set
     */
    public void setNumero_ctps(String numero_ctps) {
        this.numero_ctps = numero_ctps;
    }

    /**
     * @return the data_admissao
     */
    public Date getData_admissao() {
        return data_admissao;
    }

    /**
     * @param data_admissao the data_admissao to set
     */
    public void setData_admissao(Date data_admissao) {
        this.data_admissao = data_admissao;
    }

    /**
     * @return the data_demissao
     */
    public Date getData_demissao() {
        return data_demissao;
    }

    /**
     * @param data_demissao the data_demissao to set
     */
    public void setData_demissao(Date data_demissao) {
        this.data_demissao = data_demissao;
    }
    
    
    
    
}
