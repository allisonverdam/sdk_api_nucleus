<?php
/**
 * NovoCartaoPortador
 *
 * PHP version 5
 *
 * @category Class
 * @package  Swagger\Client
 * @author   Swaagger Codegen team
 * @link     https://github.com/swagger-api/swagger-codegen
 */

/**
 * API Agillitas Cartões Pré-pagos
 *
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 *
 */

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

namespace Swagger\Client\Model;

use \ArrayAccess;

/**
 * NovoCartaoPortador Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NovoCartaoPortador implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'NovoCartaoPortador';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'nome' => 'string',
        'sobrenome' => 'string',
        'data_nascimento' => '\DateTime',
        'cpf' => 'float',
        'contato' => '\Swagger\Client\Model\NovoCartaoPortadorContato',
        'endereco' => '\Swagger\Client\Model\NovoCartaoPortadorEndereco'
    ];

    public static function swaggerTypes()
    {
        return self::$swaggerTypes;
    }

    /**
     * Array of attributes where the key is the local name, and the value is the original name
     * @var string[]
     */
    protected static $attributeMap = [
        'nome' => 'nome',
        'sobrenome' => 'sobrenome',
        'data_nascimento' => 'dataNascimento',
        'cpf' => 'cpf',
        'contato' => 'contato',
        'endereco' => 'endereco'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'nome' => 'setNome',
        'sobrenome' => 'setSobrenome',
        'data_nascimento' => 'setDataNascimento',
        'cpf' => 'setCpf',
        'contato' => 'setContato',
        'endereco' => 'setEndereco'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'nome' => 'getNome',
        'sobrenome' => 'getSobrenome',
        'data_nascimento' => 'getDataNascimento',
        'cpf' => 'getCpf',
        'contato' => 'getContato',
        'endereco' => 'getEndereco'
    ];

    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    public static function setters()
    {
        return self::$setters;
    }

    public static function getters()
    {
        return self::$getters;
    }

    

    

    /**
     * Associative array for storing property values
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     * @param mixed[] $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['nome'] = isset($data['nome']) ? $data['nome'] : null;
        $this->container['sobrenome'] = isset($data['sobrenome']) ? $data['sobrenome'] : null;
        $this->container['data_nascimento'] = isset($data['data_nascimento']) ? $data['data_nascimento'] : null;
        $this->container['cpf'] = isset($data['cpf']) ? $data['cpf'] : null;
        $this->container['contato'] = isset($data['contato']) ? $data['contato'] : null;
        $this->container['endereco'] = isset($data['endereco']) ? $data['endereco'] : null;
    }

    /**
     * show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalid_properties = [];
        return $invalid_properties;
    }

    /**
     * validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properteis are valid
     */
    public function valid()
    {
        return true;
    }


    /**
     * Gets nome
     * @return string
     */
    public function getNome()
    {
        return $this->container['nome'];
    }

    /**
     * Sets nome
     * @param string $nome Nome do portador do cartão.
     * @return $this
     */
    public function setNome($nome)
    {
        $this->container['nome'] = $nome;

        return $this;
    }

    /**
     * Gets sobrenome
     * @return string
     */
    public function getSobrenome()
    {
        return $this->container['sobrenome'];
    }

    /**
     * Sets sobrenome
     * @param string $sobrenome Sobrenome do portador do cartão.
     * @return $this
     */
    public function setSobrenome($sobrenome)
    {
        $this->container['sobrenome'] = $sobrenome;

        return $this;
    }

    /**
     * Gets data_nascimento
     * @return \DateTime
     */
    public function getDataNascimento()
    {
        return $this->container['data_nascimento'];
    }

    /**
     * Sets data_nascimento
     * @param \DateTime $data_nascimento Data de nascimento do portador do cartão.
     * @return $this
     */
    public function setDataNascimento($data_nascimento)
    {
        $this->container['data_nascimento'] = $data_nascimento;

        return $this;
    }

    /**
     * Gets cpf
     * @return float
     */
    public function getCpf()
    {
        return $this->container['cpf'];
    }

    /**
     * Sets cpf
     * @param float $cpf Numero do cadastro de pessoas física do portador.
     * @return $this
     */
    public function setCpf($cpf)
    {
        $this->container['cpf'] = $cpf;

        return $this;
    }

    /**
     * Gets contato
     * @return \Swagger\Client\Model\NovoCartaoPortadorContato
     */
    public function getContato()
    {
        return $this->container['contato'];
    }

    /**
     * Sets contato
     * @param \Swagger\Client\Model\NovoCartaoPortadorContato $contato
     * @return $this
     */
    public function setContato($contato)
    {
        $this->container['contato'] = $contato;

        return $this;
    }

    /**
     * Gets endereco
     * @return \Swagger\Client\Model\NovoCartaoPortadorEndereco
     */
    public function getEndereco()
    {
        return $this->container['endereco'];
    }

    /**
     * Sets endereco
     * @param \Swagger\Client\Model\NovoCartaoPortadorEndereco $endereco
     * @return $this
     */
    public function setEndereco($endereco)
    {
        $this->container['endereco'] = $endereco;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     * @param  integer $offset Offset
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     * @param  integer $offset Offset
     * @return mixed
     */
    public function offsetGet($offset)
    {
        return isset($this->container[$offset]) ? $this->container[$offset] : null;
    }

    /**
     * Sets value based on offset.
     * @param  integer $offset Offset
     * @param  mixed   $value  Value to be set
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     * @param  integer $offset Offset
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Gets the string presentation of the object
     * @return string
     */
    public function __toString()
    {
        if (defined('JSON_PRETTY_PRINT')) { // use JSON pretty print
            return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this), JSON_PRETTY_PRINT);
        }

        return json_encode(\Swagger\Client\ObjectSerializer::sanitizeForSerialization($this));
    }
}


