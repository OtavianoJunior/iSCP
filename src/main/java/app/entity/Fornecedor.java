package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela fornecedor
* @generated
*/
@Entity
@Table(name = "\"fornecedor\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Fornecedor")
public class Fornecedor implements Serializable {

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
    @Column(name = "TipoFornecedor", nullable = false, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String tipoFornecedor;

    /**
    * @generated
    */
    @Column(name = "CodFornecedor", nullable = false, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String codFornecedor;

    /**
    * @generated
    */
    @Column(name = "NomeFornecedor", nullable = false, unique = false, length=80, insertable=true, updatable=true)
        
        private java.lang.String nomeFornecedor;

    /**
    * Construtor
    * @generated
    */
    public Fornecedor(){
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
    public Fornecedor setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém tipoFornecedor
    * return tipoFornecedor
    * @generated
    */
    
    public java.lang.String getTipoFornecedor(){
        return this.tipoFornecedor;
    }

    /**
    * Define tipoFornecedor
    * @param tipoFornecedor tipoFornecedor
    * @generated
    */
    public Fornecedor setTipoFornecedor(java.lang.String tipoFornecedor){
        this.tipoFornecedor = tipoFornecedor;
        return this;
    }
    /**
    * Obtém codFornecedor
    * return codFornecedor
    * @generated
    */
    
    public java.lang.String getCodFornecedor(){
        return this.codFornecedor;
    }

    /**
    * Define codFornecedor
    * @param codFornecedor codFornecedor
    * @generated
    */
    public Fornecedor setCodFornecedor(java.lang.String codFornecedor){
        this.codFornecedor = codFornecedor;
        return this;
    }
    /**
    * Obtém nomeFornecedor
    * return nomeFornecedor
    * @generated
    */
    
    public java.lang.String getNomeFornecedor(){
        return this.nomeFornecedor;
    }

    /**
    * Define nomeFornecedor
    * @param nomeFornecedor nomeFornecedor
    * @generated
    */
    public Fornecedor setNomeFornecedor(java.lang.String nomeFornecedor){
        this.nomeFornecedor = nomeFornecedor;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Fornecedor object = (Fornecedor)obj;
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