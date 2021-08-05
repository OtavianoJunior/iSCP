package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;


/**
* @generated
*
**/
public class DespesasAdiantamentoPK implements Serializable {

  /**
  * @generated
  */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
   * @generated
   */
  private java.lang.String tipoDocumento = UUID.randomUUID().toString().toUpperCase();

  /**
   * Construtor
   * @generated
   */
  public DespesasAdiantamentoPK(){
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
  public DespesasAdiantamentoPK setId(java.lang.String id){
    this.id = id;
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
  public DespesasAdiantamentoPK setTipoDocumento(java.lang.String tipoDocumento){
    this.tipoDocumento = tipoDocumento;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
DespesasAdiantamentoPK object = (DespesasAdiantamentoPK)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    if (tipoDocumento != null ? !tipoDocumento.equals(object.tipoDocumento) : object.tipoDocumento != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    result = 31 * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
    return result;
  }

}
