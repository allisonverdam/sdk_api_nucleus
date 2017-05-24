=begin
#API dos Correios

#Postal Object tracking API

OpenAPI spec version: 1.0

Generated by: https://github.com/swagger-api/swagger-codegen.git

=end

require 'spec_helper'
require 'json'

# Unit tests for SwaggerClient::AddressesApi
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'AddressesApi' do
  before do
    # run before each test
    @instance = SwaggerClient::AddressesApi.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of AddressesApi' do
    it 'should create an instact of AddressesApi' do
      expect(@instance).to be_instance_of(SwaggerClient::AddressesApi)
    end
  end

  # unit tests for addresses_zipcode_get
  # 
  # Searches for the address of a given zipcodes.
  # @param client_id Customer identifier used for authentication.
  # @param access_token Access token used in the authentication.
  # @param zipcode Zipcode to search.
  # @param [Hash] opts the optional parameters
  # @return [Array<InlineResponse2001>]
  describe 'addresses_zipcode_get test' do
    it "should work" do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end