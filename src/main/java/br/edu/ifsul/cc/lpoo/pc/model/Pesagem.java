
package br.edu.ifsul.cc.lpoo.pc.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author telmo
 */

@Entity
@Table(name = "tb_pesagem")
public class Pesagem {
    
    @Id
    @SequenceGenerator(name = "seq_pesagem", sequenceName = "seq_pesagem_id", allocationSize = 1)
    @GeneratedValue(generator = "seq_pesagem", strategy = GenerationType.SEQUENCE)   
    private Integer id;
    
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    
    @Column(nullable = false, precision = 2)
    private Float peso;
    
    
    @ManyToOne // associação
    @JoinColumn(name = "bovino_id", nullable = false)
    private Bovino bovino;



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
    
    public Bovino getBovino() {
        return bovino;
    }

    public void setBovino(Bovino bovino) {
        this.bovino = bovino;
    }
    
    
    
}
