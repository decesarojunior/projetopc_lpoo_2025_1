
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */

@Entity
@Table(name = "tb_funcionario")
@DiscriminatorValue("F")
public class Funcionario extends Pessoa{
    
    @Column(nullable = false, length = 50)
    private String numero_ctps;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date data_admissao;
    
    @Column(nullable = true)
    @Temporal(TemporalType.DATE)
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
