<?php
/**
 * NovoCartaoPortadorEndereco
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
 * NovoCartaoPortadorEndereco Class Doc Comment
 *
 * @category    Class */
/**
 * @package     Swagger\Client
 * @author      Swagger Codegen team
 * @link        https://github.com/swagger-api/swagger-codegen
 */
class NovoCartaoPortadorEndereco implements ArrayAccess
{
    const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      * @var string
      */
    protected static $swaggerModelName = 'NovoCartaoPortadorEndereco';

    /**
      * Array of property to type mappings. Used for (de)serialization
      * @var string[]
      */
    protected static $swaggerTypes = [
        'logradouro' => 'string',
        'complemento' => 'string',
        'cidade' => 'string',
        'estado' => 'string',
        'pais' => 'string',
        'codigo_postal' => 'string'
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
        'logradouro' => 'logradouro',
        'complemento' => 'complemento',
        'cidade' => 'cidade',
        'estado' => 'estado',
        'pais' => 'pais',
        'codigo_postal' => 'codigoPostal'
    ];


    /**
     * Array of attributes to setter functions (for deserialization of responses)
     * @var string[]
     */
    protected static $setters = [
        'logradouro' => 'setLogradouro',
        'complemento' => 'setComplemento',
        'cidade' => 'setCidade',
        'estado' => 'setEstado',
        'pais' => 'setPais',
        'codigo_postal' => 'setCodigoPostal'
    ];


    /**
     * Array of attributes to getter functions (for serialization of requests)
     * @var string[]
     */
    protected static $getters = [
        'logradouro' => 'getLogradouro',
        'complemento' => 'getComplemento',
        'cidade' => 'getCidade',
        'estado' => 'getEstado',
        'pais' => 'getPais',
        'codigo_postal' => 'getCodigoPostal'
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
        $this->container['logradouro'] = isset($data['logradouro']) ? $data['logradouro'] : null;
        $this->container['complemento'] = isset($data['complemento']) ? $data['complemento'] : null;
        $this->container['cidade'] = isset($data['cidade']) ? $data['cidade'] : null;
        $this->container['estado'] = isset($data['estado']) ? $data['estado'] : null;
        $this->container['pais'] = isset($data['pais']) ? $data['pais'] : null;
        $this->container['codigo_postal'] = isset($data['codigo_postal']) ? $data['codigo_postal'] : null;
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
     * Gets logradouro
     * @return string
     */
    public function getLogradouro()
    {
        return $this->container['logradouro'];
    }

    /**
     * Sets logradouro
     * @param string $logradouro Nome endereço do portador do cartão.
     * @return $this
     */
    public function setLogradouro($logradouro)
    {
        $this->container['logradouro'] = $logradouro;

        return $this;
    }

    /**
     * Gets complemento
     * @return string
     */
    public function getComplemento()
    {
        return $this->container['complemento'];
    }

    /**
     * Sets complemento
     * @param string $complemento Complemento do logradouro do portador do cartão.
     * @return $this
     */
    public function setComplemento($complemento)
    {
        $this->container['complemento'] = $complemento;

        return $this;
    }

    /**
     * Gets cidade
     * @return string
     */
    public function getCidade()
    {
        return $this->container['cidade'];
    }

    /**
     * Sets cidade
     * @param string $cidade Nome cidade do portador do cartão.
     * @return $this
     */
    public function setCidade($cidade)
    {
        $this->container['cidade'] = $cidade;

        return $this;
    }

    /**
     * Gets estado
     * @return string
     */
    public function getEstado()
    {
        return $this->container['estado'];
    }

    /**
     * Sets estado
     * @param string $estado Sigla do estado do portador do cartão.
     * @return $this
     */
    public function setEstado($estado)
    {
        $this->container['estado'] = $estado;

        return $this;
    }

    /**
     * Gets pais
     * @return string
     */
    public function getPais()
    {
        return $this->container['pais'];
    }

    /**
     * Sets pais
     * @param string $pais Nome do pais do portador do cartão.
     * @return $this
     */
    public function setPais($pais)
    {
        $this->container['pais'] = $pais;

        return $this;
    }

    /**
     * Gets codigo_postal
     * @return string
     */
    public function getCodigoPostal()
    {
        return $this->container['codigo_postal'];
    }

    /**
     * Sets codigo_postal
     * @param string $codigo_postal Código de endereçamento postal do portador do cartão.
     * @return $this
     */
    public function setCodigoPostal($codigo_postal)
    {
        $this->container['codigo_postal'] = $codigo_postal;

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

