package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela Empenho
* @generated
*/
@Entity
@Table(name = "\"Empenho\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Empenho")
public class Empenho implements Serializable {

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
    @Column(name = "Municipio", nullable = false, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String municipio;

    /**
    * @generated
    */
    @Column(name = "Entidade", nullable = false, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String entidade;

    /**
    * @generated
    */
    @Column(name = "Exercicio", nullable = false, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.Integer exercicio;

    /**
    * @generated
    */
    @Column(name = "TipoDocumento", nullable = false, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String tipoDocumento;

    /**
    * @generated
    */
    @Column(name = "CodigoEmpenho", nullable = false, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.Double codigoEmpenho;

    /**
    * Construtor
    * @generated
    */
    public Empenho(){
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
    public Empenho setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém municipio
    * return municipio
    * @generated
    */
    
    public java.lang.String getMunicipio(){
        return this.municipio;
    }

    /**
    * Define municipio
    * @param municipio municipio
    * @generated
    */
    public Empenho setMunicipio(java.lang.String municipio){
        this.municipio = municipio;
        return this;
    }
    /**
    * Obtém entidade
    * return entidade
    * @generated
    */
    
    public java.lang.String getEntidade(){
        return this.entidade;
    }

    /**
    * Define entidade
    * @param entidade entidade
    * @generated
    */
    public Empenho setEntidade(java.lang.String entidade){
        this.entidade = entidade;
        return this;
    }
    /**
    * Obtém exercicio
    * return exercicio
    * @generated
    */
    
    public java.lang.Integer getExercicio(){
        return this.exercicio;
    }

    /**
    * Define exercicio
    * @param exercicio exercicio
    * @generated
    */
    public Empenho setExercicio(java.lang.Integer exercicio){
        this.exercicio = exercicio;
        return this;
    }
    /**
    * Obtém tipoDocumento
    * return tipoDocumento
    * @generated
    */
    
    public java.lang.String getTipoDocumento(){
        return this.tipoDocumento;
    }

    /**
    * Define tipoDocumento
    * @param tipoDocumento tipoDocumento
    * @generated
    */
    public Empenho setTipoDocumento(java.lang.String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
        return this;
    }
    /**
    * Obtém codigoEmpenho
    * return codigoEmpenho
    * @generated
    */
    
    public java.lang.Double getCodigoEmpenho(){
        return this.codigoEmpenho;
    }

    /**
    * Define codigoEmpenho
    * @param codigoEmpenho codigoEmpenho
    * @generated
    */
    public Empenho setCodigoEmpenho(java.lang.Double codigoEmpenho){
        this.codigoEmpenho = codigoEmpenho;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Empenho object = (Empenho)obj;
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