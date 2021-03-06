/*
 * API dos Correios
 * API de rastreios de Objetos Postais
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Customer Model
 */
@ApiModel(description = "Customer Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T12:34:21.157Z")
public class Eventos {
  @SerializedName("codigoObjeto")
  private String codigoObjeto = null;

  @SerializedName("tipoEvento")
  private String tipoEvento = null;

  @SerializedName("statusEvento")
  private Integer statusEvento = null;

  @SerializedName("descricaoEvento")
  private String descricaoEvento = null;

  @SerializedName("nomeUnidade")
  private String nomeUnidade = null;

  @SerializedName("codigoSRO")
  private String codigoSRO = null;

  @SerializedName("municipio")
  private String municipio = null;

  @SerializedName("uf")
  private String uf = null;

  @SerializedName("codigoMCU")
  private String codigoMCU = null;

  @SerializedName("codigoDR")
  private String codigoDR = null;

  @SerializedName("siglaDR")
  private String siglaDR = null;

  @SerializedName("numeroLista")
  private String numeroLista = null;

  @SerializedName("estacao")
  private Integer estacao = null;

  @SerializedName("usuario")
  private String usuario = null;

  @SerializedName("dataGravacao")
  private String dataGravacao = null;

  @SerializedName("entregador")
  private String entregador = null;

  @SerializedName("dataCriacao")
  private String dataCriacao = null;

  @SerializedName("acaoBloqueio")
  private Integer acaoBloqueio = null;

  public Eventos codigoObjeto(String codigoObjeto) {
    this.codigoObjeto = codigoObjeto;
    return this;
  }

   /**
   * 
   * @return codigoObjeto
  **/
  @ApiModelProperty(example = "PL177497655BR", value = "")
  public String getCodigoObjeto() {
    return codigoObjeto;
  }

  public void setCodigoObjeto(String codigoObjeto) {
    this.codigoObjeto = codigoObjeto;
  }

  public Eventos tipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
    return this;
  }

   /**
   * 
   * @return tipoEvento
  **/
  @ApiModelProperty(example = "OEC", value = "")
  public String getTipoEvento() {
    return tipoEvento;
  }

  public void setTipoEvento(String tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  public Eventos statusEvento(Integer statusEvento) {
    this.statusEvento = statusEvento;
    return this;
  }

   /**
   * 
   * @return statusEvento
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getStatusEvento() {
    return statusEvento;
  }

  public void setStatusEvento(Integer statusEvento) {
    this.statusEvento = statusEvento;
  }

  public Eventos descricaoEvento(String descricaoEvento) {
    this.descricaoEvento = descricaoEvento;
    return this;
  }

   /**
   * 
   * @return descricaoEvento
  **/
  @ApiModelProperty(example = "Saiu para entrega ao destinatário", value = "")
  public String getDescricaoEvento() {
    return descricaoEvento;
  }

  public void setDescricaoEvento(String descricaoEvento) {
    this.descricaoEvento = descricaoEvento;
  }

  public Eventos nomeUnidade(String nomeUnidade) {
    this.nomeUnidade = nomeUnidade;
    return this;
  }

   /**
   * 
   * @return nomeUnidade
  **/
  @ApiModelProperty(example = "CEE PAMPULHA", value = "")
  public String getNomeUnidade() {
    return nomeUnidade;
  }

  public void setNomeUnidade(String nomeUnidade) {
    this.nomeUnidade = nomeUnidade;
  }

  public Eventos codigoSRO(String codigoSRO) {
    this.codigoSRO = codigoSRO;
    return this;
  }

   /**
   * 
   * @return codigoSRO
  **/
  @ApiModelProperty(example = "31277971", value = "")
  public String getCodigoSRO() {
    return codigoSRO;
  }

  public void setCodigoSRO(String codigoSRO) {
    this.codigoSRO = codigoSRO;
  }

  public Eventos municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

   /**
   * 
   * @return municipio
  **/
  @ApiModelProperty(example = "BELO HORIZONTE", value = "")
  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public Eventos uf(String uf) {
    this.uf = uf;
    return this;
  }

   /**
   * 
   * @return uf
  **/
  @ApiModelProperty(example = "MG", value = "")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public Eventos codigoMCU(String codigoMCU) {
    this.codigoMCU = codigoMCU;
    return this;
  }

   /**
   * 
   * @return codigoMCU
  **/
  @ApiModelProperty(example = "", value = "")
  public String getCodigoMCU() {
    return codigoMCU;
  }

  public void setCodigoMCU(String codigoMCU) {
    this.codigoMCU = codigoMCU;
  }

  public Eventos codigoDR(String codigoDR) {
    this.codigoDR = codigoDR;
    return this;
  }

   /**
   * 
   * @return codigoDR
  **/
  @ApiModelProperty(example = "", value = "")
  public String getCodigoDR() {
    return codigoDR;
  }

  public void setCodigoDR(String codigoDR) {
    this.codigoDR = codigoDR;
  }

  public Eventos siglaDR(String siglaDR) {
    this.siglaDR = siglaDR;
    return this;
  }

   /**
   * 
   * @return siglaDR
  **/
  @ApiModelProperty(example = "", value = "")
  public String getSiglaDR() {
    return siglaDR;
  }

  public void setSiglaDR(String siglaDR) {
    this.siglaDR = siglaDR;
  }

  public Eventos numeroLista(String numeroLista) {
    this.numeroLista = numeroLista;
    return this;
  }

   /**
   * 
   * @return numeroLista
  **/
  @ApiModelProperty(example = "", value = "")
  public String getNumeroLista() {
    return numeroLista;
  }

  public void setNumeroLista(String numeroLista) {
    this.numeroLista = numeroLista;
  }

  public Eventos estacao(Integer estacao) {
    this.estacao = estacao;
    return this;
  }

   /**
   * 
   * @return estacao
  **/
  @ApiModelProperty(example = "", value = "")
  public Integer getEstacao() {
    return estacao;
  }

  public void setEstacao(Integer estacao) {
    this.estacao = estacao;
  }

  public Eventos usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }

   /**
   * 
   * @return usuario
  **/
  @ApiModelProperty(example = "", value = "")
  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public Eventos dataGravacao(String dataGravacao) {
    this.dataGravacao = dataGravacao;
    return this;
  }

   /**
   * 
   * @return dataGravacao
  **/
  @ApiModelProperty(example = "", value = "")
  public String getDataGravacao() {
    return dataGravacao;
  }

  public void setDataGravacao(String dataGravacao) {
    this.dataGravacao = dataGravacao;
  }

  public Eventos entregador(String entregador) {
    this.entregador = entregador;
    return this;
  }

   /**
   * 
   * @return entregador
  **/
  @ApiModelProperty(example = "", value = "")
  public String getEntregador() {
    return entregador;
  }

  public void setEntregador(String entregador) {
    this.entregador = entregador;
  }

  public Eventos dataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
    return this;
  }

   /**
   * 
   * @return dataCriacao
  **/
  @ApiModelProperty(example = "11/05/2017 12:16:54", value = "")
  public String getDataCriacao() {
    return dataCriacao;
  }

  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  public Eventos acaoBloqueio(Integer acaoBloqueio) {
    this.acaoBloqueio = acaoBloqueio;
    return this;
  }

   /**
   * 
   * @return acaoBloqueio
  **/
  @ApiModelProperty(example = "", value = "")
  public Integer getAcaoBloqueio() {
    return acaoBloqueio;
  }

  public void setAcaoBloqueio(Integer acaoBloqueio) {
    this.acaoBloqueio = acaoBloqueio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Eventos eventos = (Eventos) o;
    return Objects.equals(this.codigoObjeto, eventos.codigoObjeto) &&
        Objects.equals(this.tipoEvento, eventos.tipoEvento) &&
        Objects.equals(this.statusEvento, eventos.statusEvento) &&
        Objects.equals(this.descricaoEvento, eventos.descricaoEvento) &&
        Objects.equals(this.nomeUnidade, eventos.nomeUnidade) &&
        Objects.equals(this.codigoSRO, eventos.codigoSRO) &&
        Objects.equals(this.municipio, eventos.municipio) &&
        Objects.equals(this.uf, eventos.uf) &&
        Objects.equals(this.codigoMCU, eventos.codigoMCU) &&
        Objects.equals(this.codigoDR, eventos.codigoDR) &&
        Objects.equals(this.siglaDR, eventos.siglaDR) &&
        Objects.equals(this.numeroLista, eventos.numeroLista) &&
        Objects.equals(this.estacao, eventos.estacao) &&
        Objects.equals(this.usuario, eventos.usuario) &&
        Objects.equals(this.dataGravacao, eventos.dataGravacao) &&
        Objects.equals(this.entregador, eventos.entregador) &&
        Objects.equals(this.dataCriacao, eventos.dataCriacao) &&
        Objects.equals(this.acaoBloqueio, eventos.acaoBloqueio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoObjeto, tipoEvento, statusEvento, descricaoEvento, nomeUnidade, codigoSRO, municipio, uf, codigoMCU, codigoDR, siglaDR, numeroLista, estacao, usuario, dataGravacao, entregador, dataCriacao, acaoBloqueio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Eventos {\n");
    
    sb.append("    codigoObjeto: ").append(toIndentedString(codigoObjeto)).append("\n");
    sb.append("    tipoEvento: ").append(toIndentedString(tipoEvento)).append("\n");
    sb.append("    statusEvento: ").append(toIndentedString(statusEvento)).append("\n");
    sb.append("    descricaoEvento: ").append(toIndentedString(descricaoEvento)).append("\n");
    sb.append("    nomeUnidade: ").append(toIndentedString(nomeUnidade)).append("\n");
    sb.append("    codigoSRO: ").append(toIndentedString(codigoSRO)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
    sb.append("    codigoMCU: ").append(toIndentedString(codigoMCU)).append("\n");
    sb.append("    codigoDR: ").append(toIndentedString(codigoDR)).append("\n");
    sb.append("    siglaDR: ").append(toIndentedString(siglaDR)).append("\n");
    sb.append("    numeroLista: ").append(toIndentedString(numeroLista)).append("\n");
    sb.append("    estacao: ").append(toIndentedString(estacao)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    dataGravacao: ").append(toIndentedString(dataGravacao)).append("\n");
    sb.append("    entregador: ").append(toIndentedString(entregador)).append("\n");
    sb.append("    dataCriacao: ").append(toIndentedString(dataCriacao)).append("\n");
    sb.append("    acaoBloqueio: ").append(toIndentedString(acaoBloqueio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

