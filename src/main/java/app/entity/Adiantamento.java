package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela Adiantamento
* @generated
*/
@Entity
@Table(name = "\"Adiantamento\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Adiantamento")
public class Adiantamento implements Serializable {

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
    @Column(name = "Exercício", nullable = false, unique = false, length=4, insertable=true, updatable=true)
        
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
    @Column(name = "Orgao", nullable = true, unique = false, length=12, insertable=true, updatable=true)
        
        private java.lang.String orgao;

    /**
    * @generated
    */
    @Column(name = "UO", nullable = true, unique = false, length=7, insertable=true, updatable=true)
        
        private java.lang.String uo;

    /**
    * @generated
    */
    @Column(name = "CodFornecedor", nullable = true, unique = false, length=20, insertable=true, updatable=true)
        
        private java.lang.String codFornecedor;

    /**
    * @generated
    */
    @Column(name = "Descricao", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String descricao;

    /**
    * @generated
    */
    @Temporal(TemporalType.DATE)
    @Column(name = "Data", nullable = true, unique = false, length=0, insertable=true, updatable=true)
        
        private java.util.Date data = Calendar.getInstance().getTime();

    /**
    * @generated
    */
    @Column(name = "Valor", nullable = true, unique = false, length=8, precision=2, insertable=true, updatable=true)
        
        private java.lang.Double valor;

    /**
    * @generated
    */
    @Column(name = "Status", nullable = true, unique = false, length=1, insertable=true, updatable=true)
        
        private java.lang.String status;

    /**
    * @generated
    */
    @Column(name = "Motivo", nullable = true, unique = false, length=100, insertable=true, updatable=true)
        
        private java.lang.String motivo;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_UO_1", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private UO uo_Id;

    /**
    * @generated
    */
    @ManyToOne
    @JoinColumn(name="fk_fornecedor", nullable = true, referencedColumnName = "id", insertable=true, updatable=true, foreignKey = @ForeignKey(name = ""))
        
        private Fornecedor fornecedor_id;

    /**
    * Construtor
    * @generated
    */
    public Adiantamento(){
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
    public Adiantamento setId(java.lang.String id){
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
    public Adiantamento setMunicipio(java.lang.String municipio){
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
    public Adiantamento setEntidade(java.lang.String entidade){
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
    public Adiantamento setExercicio(java.lang.Double exercicio){
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
    public Adiantamento setTipoDocumento(java.lang.String tipoDocumento){
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
    public Adiantamento setCodigoAdiantamento(java.lang.Integer codigoAdiantamento){
        this.codigoAdiantamento = codigoAdiantamento;
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
    public Adiantamento setOrgao(java.lang.String orgao){
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
    public Adiantamento setUo(java.lang.String uo){
        this.uo = uo;
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
    public Adiantamento setCodFornecedor(java.lang.String codFornecedor){
        this.codFornecedor = codFornecedor;
        return this;
    }
    /**
    * Obtém descricao
    * return descricao
    * @generated
    */
    
    public java.lang.String getDescricao(){
        return this.descricao;
    }

    /**
    * Define descricao
    * @param descricao descricao
    * @generated
    */
    public Adiantamento setDescricao(java.lang.String descricao){
        this.descricao = descricao;
        return this;
    }
    /**
    * Obtém data
    * return data
    * @generated
    */
    
    public java.util.Date getData(){
        return this.data;
    }

    /**
    * Define data
    * @param data data
    * @generated
    */
    public Adiantamento setData(java.util.Date data){
        this.data = data;
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
    public Adiantamento setValor(java.lang.Double valor){
        this.valor = valor;
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
    public Adiantamento setStatus(java.lang.String status){
        this.status = status;
        return this;
    }
    /**
    * Obtém motivo
    * return motivo
    * @generated
    */
    
    public java.lang.String getMotivo(){
        return this.motivo;
    }

    /**
    * Define motivo
    * @param motivo motivo
    * @generated
    */
    public Adiantamento setMotivo(java.lang.String motivo){
        this.motivo = motivo;
        return this;
    }
    /**
    * Obtém uo_Id
    * return uo_Id
    * @generated
    */
    
    public UO getUo_Id(){
        return this.uo_Id;
    }

    /**
    * Define uo_Id
    * @param uo_Id uo_Id
    * @generated
    */
    public Adiantamento setUo_Id(UO uo_Id){
        this.uo_Id = uo_Id;
        return this;
    }
    /**
    * Obtém fornecedor_id
    * return fornecedor_id
    * @generated
    */
    
    public Fornecedor getFornecedor_id(){
        return this.fornecedor_id;
    }

    /**
    * Define fornecedor_id
    * @param fornecedor_id fornecedor_id
    * @generated
    */
    public Adiantamento setFornecedor_id(Fornecedor fornecedor_id){
        this.fornecedor_id = fornecedor_id;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Adiantamento object = (Adiantamento)obj;
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