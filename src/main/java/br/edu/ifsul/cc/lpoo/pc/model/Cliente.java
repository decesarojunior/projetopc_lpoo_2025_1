
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Calendar;
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
@Table(name = "tb_cliente")
@DiscriminatorValue("C")
public class Cliente extends Pessoa {
    
    @Column(nullable = false, length = 50)
    private String cnpj;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Calendar data_ultima_compra;
    
    @Column(nullable = false, precision = 2)
    private Float valor_compras;

    public Cliente() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Calendar getData_ultima_compra() {
        return data_ultima_compra;
    }

    public void setData_ultima_compra(Calendar data_ultima_compra) {
        this.data_ultima_compra = data_ultima_compra;
    }

    public Float getValor_compras() {
        return valor_compras;
    }

    public void setValor_compras(Float valor_compras) {
        this.valor_compras = valor_compras;
    }
    
    
    
}
