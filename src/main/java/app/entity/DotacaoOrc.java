package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DotacaoOrc
* @generated
*/
@Entity
@Table(name = "\"DotacaoOrc\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DotacaoOrc")
public class DotacaoOrc implements Serializable {

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
    @Column(name = "Municipio", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String municipio;

    /**
    * @generated
    */
    @Column(name = "Entidade", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String entidade;

    /**
    * @generated
    */
    @Column(name = "Exercicio", nullable = true, unique = false, length=4, insertable=true, updatable=true)
        
        private java.lang.Double exercicio;

    /**
    * @generated
    */
    @Column(name = "Orgao", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String orgao;

    /**
    * @generated
    */
    @Column(name = "UO", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String uo;

    /**
    * @generated
    */
    @Column(name = "Funcional", nullable = true, unique = false, length=40, insertable=true, updatable=true)
        
        private java.lang.String funcional;

    /**
    * @generated
    */
    @Column(name = "Fonte", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String fonte;

    /**
    * @generated
    */
    @Column(name = "Aplicacao", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String aplicacao;

    /**
    * @generated
    */
    @Column(name = "Despesa", nullable = true, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String despesa;

    /**
    * @generated
    */
    @Column(name = "Natureza", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String natureza;

    /**
    * @generated
    */
    @Column(name = "Ficha", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String ficha;

    /**
    * @generated
    */
    @Column(name = "Status", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String status;

    /**
    * Construtor
    * @generated
    */
    public DotacaoOrc(){
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
    public DotacaoOrc setId(java.lang.String id){
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
    public DotacaoOrc setMunicipio(java.lang.String municipio){
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
    public DotacaoOrc setEntidade(java.lang.String entidade){
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
    public DotacaoOrc setExercicio(java.lang.Double exercicio){
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
    public DotacaoOrc setOrgao(java.lang.String orgao){
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
    public DotacaoOrc setUo(java.lang.String uo){
        this.uo = uo;
        return this;
    }
    /**
    * Obtém funcional
    * return funcional
    * @generated
    */
    
    public java.lang.String getFuncional(){
        return this.funcional;
    }

    /**
    * Define funcional
    * @param funcional funcional
    * @generated
    */
    public DotacaoOrc setFuncional(java.lang.String funcional){
        this.funcional = funcional;
        return this;
    }
    /**
    * Obtém fonte
    * return fonte
    * @generated
    */
    
    public java.lang.String getFonte(){
        return this.fonte;
    }

    /**
    * Define fonte
    * @param fonte fonte
    * @generated
    */
    public DotacaoOrc setFonte(java.lang.String fonte){
        this.fonte = fonte;
        return this;
    }
    /**
    * Obtém aplicacao
    * return aplicacao
    * @generated
    */
    
    public java.lang.String getAplicacao(){
        return this.aplicacao;
    }

    /**
    * Define aplicacao
    * @param aplicacao aplicacao
    * @generated
    */
    public DotacaoOrc setAplicacao(java.lang.String aplicacao){
        this.aplicacao = aplicacao;
        return this;
    }
    /**
    * Obtém despesa
    * return despesa
    * @generated
    */
    
    public java.lang.String getDespesa(){
        return this.despesa;
    }

    /**
    * Define despesa
    * @param despesa despesa
    * @generated
    */
    public DotacaoOrc setDespesa(java.lang.String despesa){
        this.despesa = despesa;
        return this;
    }
    /**
    * Obtém natureza
    * return natureza
    * @generated
    */
    
    public java.lang.String getNatureza(){
        return this.natureza;
    }

    /**
    * Define natureza
    * @param natureza natureza
    * @generated
    */
    public DotacaoOrc setNatureza(java.lang.String natureza){
        this.natureza = natureza;
        return this;
    }
    /**
    * Obtém ficha
    * return ficha
    * @generated
    */
    
    public java.lang.String getFicha(){
        return this.ficha;
    }

    /**
    * Define ficha
    * @param ficha ficha
    * @generated
    */
    public DotacaoOrc setFicha(java.lang.String ficha){
        this.ficha = ficha;
        return this;
    }
    /**
    * Obtém status
    * return status
    * @generated
    */
    
    public java.lang.String getStatus(){
        return this.status;
    }

    /**
    * Define status
    * @param status status
    * @generated
    */
    public DotacaoOrc setStatus(java.lang.String status){
        this.status = status;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DotacaoOrc object = (DotacaoOrc)obj;
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