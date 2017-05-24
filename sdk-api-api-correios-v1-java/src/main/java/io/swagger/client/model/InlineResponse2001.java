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
public class InlineResponse2001 {
  @SerializedName("logradouro")
  private String logradouro = null;

  @SerializedName("bairro")
  private String bairro = null;

  @SerializedName("municipio")
  private String municipio = null;

  @SerializedName("uf")
  private String uf = null;

  public InlineResponse2001 logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

   /**
   * Nome do logradouro
   * @return logradouro
  **/
  @ApiModelProperty(example = "Rua Doutor Ricardo Benetton Martins, s/n", value = "Nome do logradouro")
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public InlineResponse2001 bairro(String bairro) {
    this.bairro = bairro;
    return this;
  }

   /**
   * Nome do Bairro
   * @return bairro
  **/
  @ApiModelProperty(example = "Polo II de Alta Tecnologia (Campinas)", value = "Nome do Bairro")
  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public InlineResponse2001 municipio(String municipio) {
    this.municipio = municipio;
    return this;
  }

   /**
   * Nome do municipio
   * @return municipio
  **/
  @ApiModelProperty(example = "Campinas", value = "Nome do municipio")
  public String getMunicipio() {
    return municipio;
  }

  public void setMunicipio(String municipio) {
    this.municipio = municipio;
  }

  public InlineResponse2001 uf(String uf) {
    this.uf = uf;
    return this;
  }

   /**
   * Estado
   * @return uf
  **/
  @ApiModelProperty(example = "SP", value = "Estado")
  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001 inlineResponse2001 = (InlineResponse2001) o;
    return Objects.equals(this.logradouro, inlineResponse2001.logradouro) &&
        Objects.equals(this.bairro, inlineResponse2001.bairro) &&
        Objects.equals(this.municipio, inlineResponse2001.municipio) &&
        Objects.equals(this.uf, inlineResponse2001.uf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, bairro, municipio, uf);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001 {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    bairro: ").append(toIndentedString(bairro)).append("\n");
    sb.append("    municipio: ").append(toIndentedString(municipio)).append("\n");
    sb.append("    uf: ").append(toIndentedString(uf)).append("\n");
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
