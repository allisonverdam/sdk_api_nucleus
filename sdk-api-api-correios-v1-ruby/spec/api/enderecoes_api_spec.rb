=begin
#API dos Correios

#API de rastreios de Objetos Postais

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::EnderecoesApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'EnderecoesApi' do
  before do
    # run before each test
    @instance = SwaggerClient::EnderecoesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of EnderecoesApi' do
    it 'should create an instact of EnderecoesApi' do
      expect(@instance).to be_instance_of(SwaggerClient::EnderecoesApi)
    end
  end

  # unit tests for enderecos_cep_get
  # 
  # Pesquisa pelo endereço de um dado CEP.
  # @param client_id Identificação do cliente usado na autenticação.
  # @param access_token Access token usado na autenticação.
  # @param cep CEP a ser pesquisado.
  # @param [Hash] opts the optional parameters
  # @return [Array<InlineResponse2001>]
  describe 'enderecos_cep_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end