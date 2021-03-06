/*
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
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
import io.swagger.client.model.NovoCartaoPortadorContato;
import io.swagger.client.model.NovoCartaoPortadorEndereco;
import java.math.BigDecimal;
import org.joda.time.LocalDate;

/**
 * NovoCartaoPortador
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T20:01:43.978Z")
public class NovoCartaoPortador {
  @SerializedName("nome")
  private String nome = null;

  @SerializedName("sobrenome")
  private String sobrenome = null;

  @SerializedName("dataNascimento")
  private LocalDate dataNascimento = null;

  @SerializedName("cpf")
  private BigDecimal cpf = null;

  @SerializedName("contato")
  private NovoCartaoPortadorContato contato = null;

  @SerializedName("endereco")
  private NovoCartaoPortadorEndereco endereco = null;

  public NovoCartaoPortador nome(String nome) {
    this.nome = nome;
    return this;
  }

   /**
   * Nome do portador do cartão.
   * @return nome
  **/
  @ApiModelProperty(example = "null", value = "Nome do portador do cartão.")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public NovoCartaoPortador sobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
    return this;
  }

   /**
   * Sobrenome do portador do cartão.
   * @return sobrenome
  **/
  @ApiModelProperty(example = "null", value = "Sobrenome do portador do cartão.")
  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public NovoCartaoPortador dataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
    return this;
  }

   /**
   * Data de nascimento do portador do cartão.
   * @return dataNascimento
  **/
  @ApiModelProperty(example = "null", value = "Data de nascimento do portador do cartão.")
  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public NovoCartaoPortador cpf(BigDecimal cpf) {
    this.cpf = cpf;
    return this;
  }

   /**
   * Numero do cadastro de pessoas física do portador.
   * @return cpf
  **/
  @ApiModelProperty(example = "null", value = "Numero do cadastro de pessoas física do portador.")
  public BigDecimal getCpf() {
    return cpf;
  }

  public void setCpf(BigDecimal cpf) {
    this.cpf = cpf;
  }

  public NovoCartaoPortador contato(NovoCartaoPortadorContato contato) {
    this.contato = contato;
    return this;
  }

   /**
   * Get contato
   * @return contato
  **/
  @ApiModelProperty(example = "null", value = "")
  public NovoCartaoPortadorContato getContato() {
    return contato;
  }

  public void setContato(NovoCartaoPortadorContato contato) {
    this.contato = contato;
  }

  public NovoCartaoPortador endereco(NovoCartaoPortadorEndereco endereco) {
    this.endereco = endereco;
    return this;
  }

   /**
   * Get endereco
   * @return endereco
  **/
  @ApiModelProperty(example = "null", value = "")
  public NovoCartaoPortadorEndereco getEndereco() {
    return endereco;
  }

  public void setEndereco(NovoCartaoPortadorEndereco endereco) {
    this.endereco = endereco;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortador novoCartaoPortador = (NovoCartaoPortador) o;
    return Objects.equals(this.nome, novoCartaoPortador.nome) &&
        Objects.equals(this.sobrenome, novoCartaoPortador.sobrenome) &&
        Objects.equals(this.dataNascimento, novoCartaoPortador.dataNascimento) &&
        Objects.equals(this.cpf, novoCartaoPortador.cpf) &&
        Objects.equals(this.contato, novoCartaoPortador.contato) &&
        Objects.equals(this.endereco, novoCartaoPortador.endereco);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, sobrenome, dataNascimento, cpf, contato, endereco);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortador {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    sobrenome: ").append(toIndentedString(sobrenome)).append("\n");
    sb.append("    dataNascimento: ").append(toIndentedString(dataNascimento)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    contato: ").append(toIndentedString(contato)).append("\n");
    sb.append("    endereco: ").append(toIndentedString(endereco)).append("\n");
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

