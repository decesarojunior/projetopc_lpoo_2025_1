
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Date;

/**
 *
 * @author telmo
 */
public class Pesagem {
    
    private Integer id;
    private Date data;
    private Float peso;

    public Pesagem() {
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the peso
     */
    public Float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(Float peso) {
        this.peso = peso;
    }
    
    
    
}
