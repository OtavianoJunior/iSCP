package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela UO
* @generated
*/
@Entity
@Table(name = "\"UO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.UO")
public class UO implements Serializable {

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
        
        private java.lang.Double exercicio;

    /**
    * @generated
    */
    @Column(name = "Orgao", nullable = false, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String orgao;

    /**
    * @generated
    */
    @Column(name = "UO", nullable = false, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String uo;

    /**
    * @generated
    */
    @Column(name = "NomeUO", nullable = false, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String nomeUO;

    /**
    * Construtor
    * @generated
    */
    public UO(){
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
    public UO setId(java.lang.String id){
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
    public UO setMunicipio(java.lang.String municipio){
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
    public UO setEntidade(java.lang.String entidade){
        this.entidade = entidade;
        return this;
    }
    /**
    * Obtém exercicio
    * return exercicio
    * @generated
    */
    
    public java.lang.Double getExercicio(){
        return this.exercicio;
    }

    /**
    * Define exercicio
    * @param exercicio exercicio
    * @generated
    */
    public UO setExercicio(java.lang.Double exercicio){
        this.exercicio = exercicio;
        return this;
    }
    /**
    * Obtém orgao
    * return orgao
    * @generated
    */
    
    public java.lang.String getOrgao(){
        return this.orgao;
    }

    /**
    * Define orgao
    * @param orgao orgao
    * @generated
    */
    public UO setOrgao(java.lang.String orgao){
        this.orgao = orgao;
        return this;
    }
    /**
    * Obtém uo
    * return uo
    * @generated
    */
    
    public java.lang.String getUo(){
        return this.uo;
    }

    /**
    * Define uo
    * @param uo uo
    * @generated
    */
    public UO setUo(java.lang.String uo){
        this.uo = uo;
        return this;
    }
    /**
    * Obtém nomeUO
    * return nomeUO
    * @generated
    */
    
    public java.lang.String getNomeUO(){
        return this.nomeUO;
    }

    /**
    * Define nomeUO
    * @param nomeUO nomeUO
    * @generated
    */
    public UO setNomeUO(java.lang.String nomeUO){
        this.nomeUO = nomeUO;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
UO object = (UO)obj;
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