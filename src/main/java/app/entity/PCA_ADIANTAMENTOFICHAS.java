package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_ADIANTAMENTOFICHAS
* @generated
*/
@Entity
@Table(name = "\"PCA_ADIANTAMENTOFICHAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_ADIANTAMENTOFICHAS")
public class PCA_ADIANTAMENTOFICHAS implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "ficha", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer ficha;

    /**
    * @generated
    */
    @Column(name = "vlr_concedidofonte", nullable = true, unique = false, precision=8, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double vlr_concedidofonte;

    /**
    * @generated
    */
    @Column(name = "cod_fonterecurso", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String cod_fonterecurso;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_PCA_ADIANTAMENTO", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private PCA_ADIANTAMENTO pcA_ADIANTAMENTO;

    /**
    * Construtor
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém ficha
    * return ficha
    * @generated
    */
    
    public java.lang.Integer getFicha(){
        return this.ficha;
    }

    /**
    * Define ficha
    * @param ficha ficha
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setFicha(java.lang.Integer ficha){
        this.ficha = ficha;
        return this;
    }
    /**
    * Obtém vlr_concedidofonte
    * return vlr_concedidofonte
    * @generated
    */
    
    public java.lang.Double getVlr_concedidofonte(){
        return this.vlr_concedidofonte;
    }

    /**
    * Define vlr_concedidofonte
    * @param vlr_concedidofonte vlr_concedidofonte
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setVlr_concedidofonte(java.lang.Double vlr_concedidofonte){
        this.vlr_concedidofonte = vlr_concedidofonte;
        return this;
    }
    /**
    * Obtém cod_fonterecurso
    * return cod_fonterecurso
    * @generated
    */
    
    public java.lang.String getCod_fonterecurso(){
        return this.cod_fonterecurso;
    }

    /**
    * Define cod_fonterecurso
    * @param cod_fonterecurso cod_fonterecurso
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setCod_fonterecurso(java.lang.String cod_fonterecurso){
        this.cod_fonterecurso = cod_fonterecurso;
        return this;
    }
    /**
    * Obtém pcA_ADIANTAMENTO
    * return pcA_ADIANTAMENTO
    * @generated
    */
    
    public PCA_ADIANTAMENTO getPcA_ADIANTAMENTO(){
        return this.pcA_ADIANTAMENTO;
    }

    /**
    * Define pcA_ADIANTAMENTO
    * @param pcA_ADIANTAMENTO pcA_ADIANTAMENTO
    * @generated
    */
    public PCA_ADIANTAMENTOFICHAS setPcA_ADIANTAMENTO(PCA_ADIANTAMENTO pcA_ADIANTAMENTO){
        this.pcA_ADIANTAMENTO = pcA_ADIANTAMENTO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_ADIANTAMENTOFICHAS object = (PCA_ADIANTAMENTOFICHAS)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}