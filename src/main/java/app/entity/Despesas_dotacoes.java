package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DESPESAS_DOTACOES
* @generated
*/
@Entity
@Table(name = "\"DESPESAS_DOTACOES\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Despesas_dotacoes")
public class Despesas_dotacoes implements Serializable {

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
    @ManyToOne
    @JoinColumn(name="fk_despesasAdiantamento", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DespesasAdiantamento despesasAdiantamento;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_dotacaoOrc", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DotacaoOrc dotacaoOrc;

    /**
    * Construtor
    * @generated
    */
    public Despesas_dotacoes(){
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
    public Despesas_dotacoes setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém despesasAdiantamento
    * return despesasAdiantamento
    * @generated
    */
    
    public DespesasAdiantamento getDespesasAdiantamento(){
        return this.despesasAdiantamento;
    }

    /**
    * Define despesasAdiantamento
    * @param despesasAdiantamento despesasAdiantamento
    * @generated
    */
    public Despesas_dotacoes setDespesasAdiantamento(DespesasAdiantamento despesasAdiantamento){
        this.despesasAdiantamento = despesasAdiantamento;
        return this;
    }
    /**
    * Obtém dotacaoOrc
    * return dotacaoOrc
    * @generated
    */
    
    public DotacaoOrc getDotacaoOrc(){
        return this.dotacaoOrc;
    }

    /**
    * Define dotacaoOrc
    * @param dotacaoOrc dotacaoOrc
    * @generated
    */
    public Despesas_dotacoes setDotacaoOrc(DotacaoOrc dotacaoOrc){
        this.dotacaoOrc = dotacaoOrc;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Despesas_dotacoes object = (Despesas_dotacoes)obj;
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