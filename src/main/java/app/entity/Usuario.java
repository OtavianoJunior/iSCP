package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela Usuario
* @generated
*/
@Entity
@Table(name = "\"Usuario\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Usuario")
public class Usuario implements Serializable {

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
    @Column(name = "Usuario", nullable = false, unique = false, length=50, insertable=true, updatable=true)
        
        private java.lang.String usuario;

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
    * Construtor
    * @generated
    */
    public Usuario(){
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
    public Usuario setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém usuario
    * return usuario
    * @generated
    */
    
    public java.lang.String getUsuario(){
        return this.usuario;
    }

    /**
    * Define usuario
    * @param usuario usuario
    * @generated
    */
    public Usuario setUsuario(java.lang.String usuario){
        this.usuario = usuario;
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
    public Usuario setMunicipio(java.lang.String municipio){
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
    public Usuario setEntidade(java.lang.String entidade){
        this.entidade = entidade;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Usuario object = (Usuario)obj;
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