package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela PCA_ADIANTAMENTO
* @generated
*/
@Entity
@Table(name = "\"PCA_ADIANTAMENTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PCA_ADIANTAMENTO")
public class PCA_ADIANTAMENTO implements Serializable {

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
    @Column(name = "nro_adiantamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nro_adiantamento;

    /**
    * @generated
    */
    @Column(name = "nro_cuc", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer nro_cuc;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "dat_adiantamento", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.util.Date dat_adiantamento;

    /**
    * @generated
    */
    @Column(name = "des_finalidade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String des_finalidade;

    /**
    * @generated
    */
    @Column(name = "valor", nullable = true, unique = false, precision=8, scale=2, insertable=true, updatable=true)
        
        private java.lang.Double valor;

    /**
    * Construtor
    * @generated
    */
    public PCA_ADIANTAMENTO(){
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
    public PCA_ADIANTAMENTO setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém nro_adiantamento
    * return nro_adiantamento
    * @generated
    */
    
    public java.lang.Integer getNro_adiantamento(){
        return this.nro_adiantamento;
    }

    /**
    * Define nro_adiantamento
    * @param nro_adiantamento nro_adiantamento
    * @generated
    */
    public PCA_ADIANTAMENTO setNro_adiantamento(java.lang.Integer nro_adiantamento){
        this.nro_adiantamento = nro_adiantamento;
        return this;
    }
    /**
    * Obtém nro_cuc
    * return nro_cuc
    * @generated
    */
    
    public java.lang.Integer getNro_cuc(){
        return this.nro_cuc;
    }

    /**
    * Define nro_cuc
    * @param nro_cuc nro_cuc
    * @generated
    */
    public PCA_ADIANTAMENTO setNro_cuc(java.lang.Integer nro_cuc){
        this.nro_cuc = nro_cuc;
        return this;
    }
    /**
    * Obtém dat_adiantamento
    * return dat_adiantamento
    * @generated
    */
    
    public java.util.Date getDat_adiantamento(){
        return this.dat_adiantamento;
    }

    /**
    * Define dat_adiantamento
    * @param dat_adiantamento dat_adiantamento
    * @generated
    */
    public PCA_ADIANTAMENTO setDat_adiantamento(java.util.Date dat_adiantamento){
        this.dat_adiantamento = dat_adiantamento;
        return this;
    }
    /**
    * Obtém des_finalidade
    * return des_finalidade
    * @generated
    */
    
    public java.lang.String getDes_finalidade(){
        return this.des_finalidade;
    }

    /**
    * Define des_finalidade
    * @param des_finalidade des_finalidade
    * @generated
    */
    public PCA_ADIANTAMENTO setDes_finalidade(java.lang.String des_finalidade){
        this.des_finalidade = des_finalidade;
        return this;
    }
    /**
    * Obtém valor
    * return valor
    * @generated
    */
    
    public java.lang.Double getValor(){
        return this.valor;
    }

    /**
    * Define valor
    * @param valor valor
    * @generated
    */
    public PCA_ADIANTAMENTO setValor(java.lang.Double valor){
        this.valor = valor;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
PCA_ADIANTAMENTO object = (PCA_ADIANTAMENTO)obj;
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