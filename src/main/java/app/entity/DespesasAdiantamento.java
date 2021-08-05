package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela DespesasAdiantamento
* @generated
*/
@Entity
@Table(name = "\"DespesasAdiantamento\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.DespesasAdiantamento")
public class DespesasAdiantamento implements Serializable {

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
    @Column(name = "TipoDocumento", nullable = true, unique = false, length=5, insertable=true, updatable=true)
        
        private java.lang.String tipoDocumento;

    /**
    * @generated
    */
    @Column(name = "CodigoAdiantamento", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.Integer codigoAdiantamento;

    /**
    * @generated
    */
    @Column(name = "SequenciaDespesa", nullable = false, unique = false, length=3, insertable=true, updatable=true)
        
        private java.lang.Double sequenciaDespesa;

    /**
    * @generated
    */
    @Column(name = "CodigoDespesa", nullable = false, unique = false, length=30, insertable=true, updatable=true)
        
        private java.lang.String codigoDespesa;

    /**
    * @generated
    */
    @Column(name = "Valor", nullable = false, unique = false, length=18, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double valor;

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
    @ManyToOne
    @JoinColumn(name="fk_adiantamento", nullable = false, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Adiantamento adiantamento_Id;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_dotacaoOrc", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private DotacaoOrc dotacaoOrc_id;

    /**
    * Construtor
    * @generated
    */
    public DespesasAdiantamento(){
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
    public DespesasAdiantamento setId(java.lang.String id){
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
    public DespesasAdiantamento setMunicipio(java.lang.String municipio){
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
    public DespesasAdiantamento setEntidade(java.lang.String entidade){
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
    public DespesasAdiantamento setExercicio(java.lang.Double exercicio){
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
    public DespesasAdiantamento setTipoDocumento(java.lang.String tipoDocumento){
        this.tipoDocumento = tipoDocumento;
        return this;
    }
    /**
    * Obtém codigoAdiantamento
    * return codigoAdiantamento
    * @generated
    */
    
    public java.lang.Integer getCodigoAdiantamento(){
        return this.codigoAdiantamento;
    }

    /**
    * Define codigoAdiantamento
    * @param codigoAdiantamento codigoAdiantamento
    * @generated
    */
    public DespesasAdiantamento setCodigoAdiantamento(java.lang.Integer codigoAdiantamento){
        this.codigoAdiantamento = codigoAdiantamento;
        return this;
    }
    /**
    * Obtém sequenciaDespesa
    * return sequenciaDespesa
    * @generated
    */
    
    public java.lang.Double getSequenciaDespesa(){
        return this.sequenciaDespesa;
    }

    /**
    * Define sequenciaDespesa
    * @param sequenciaDespesa sequenciaDespesa
    * @generated
    */
    public DespesasAdiantamento setSequenciaDespesa(java.lang.Double sequenciaDespesa){
        this.sequenciaDespesa = sequenciaDespesa;
        return this;
    }
    /**
    * Obtém codigoDespesa
    * return codigoDespesa
    * @generated
    */
    
    public java.lang.String getCodigoDespesa(){
        return this.codigoDespesa;
    }

    /**
    * Define codigoDespesa
    * @param codigoDespesa codigoDespesa
    * @generated
    */
    public DespesasAdiantamento setCodigoDespesa(java.lang.String codigoDespesa){
        this.codigoDespesa = codigoDespesa;
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
    public DespesasAdiantamento setValor(java.lang.Double valor){
        this.valor = valor;
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
    public DespesasAdiantamento setFuncional(java.lang.String funcional){
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
    public DespesasAdiantamento setFonte(java.lang.String fonte){
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
    public DespesasAdiantamento setAplicacao(java.lang.String aplicacao){
        this.aplicacao = aplicacao;
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
    public DespesasAdiantamento setNatureza(java.lang.String natureza){
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
    public DespesasAdiantamento setFicha(java.lang.String ficha){
        this.ficha = ficha;
        return this;
    }
    /**
    * Obtém adiantamento_Id
    * return adiantamento_Id
    * @generated
    */
    
    public Adiantamento getAdiantamento_Id(){
        return this.adiantamento_Id;
    }

    /**
    * Define adiantamento_Id
    * @param adiantamento_Id adiantamento_Id
    * @generated
    */
    public DespesasAdiantamento setAdiantamento_Id(Adiantamento adiantamento_Id){
        this.adiantamento_Id = adiantamento_Id;
        return this;
    }
    /**
    * Obtém dotacaoOrc_id
    * return dotacaoOrc_id
    * @generated
    */
    
    public DotacaoOrc getDotacaoOrc_id(){
        return this.dotacaoOrc_id;
    }

    /**
    * Define dotacaoOrc_id
    * @param dotacaoOrc_id dotacaoOrc_id
    * @generated
    */
    public DespesasAdiantamento setDotacaoOrc_id(DotacaoOrc dotacaoOrc_id){
        this.dotacaoOrc_id = dotacaoOrc_id;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
DespesasAdiantamento object = (DespesasAdiantamento)obj;
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