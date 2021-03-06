# coding: utf-8

"""
    API Agillitas Cartões Pré-pagos

    API para manipular recursos relacionadas à cartões pré-pagos Agillitas.

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from pprint import pformat
from six import iteritems
import re


class SetPagamento(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    """
    def __init__(self, id_cartao=None, senha=None, codigo_barras=None):
        """
        SetPagamento - a model defined in Swagger

        :param dict swaggerTypes: The key is attribute name
                                  and the value is attribute type.
        :param dict attributeMap: The key is attribute name
                                  and the value is json key in definition.
        """
        self.swagger_types = {
            'id_cartao': 'str',
            'senha': 'str',
            'codigo_barras': 'str'
        }

        self.attribute_map = {
            'id_cartao': 'idCartao',
            'senha': 'senha',
            'codigo_barras': 'codigoBarras'
        }

        self._id_cartao = id_cartao
        self._senha = senha
        self._codigo_barras = codigo_barras

    @property
    def id_cartao(self):
        """
        Gets the id_cartao of this SetPagamento.
        Número identificador referente ao proxy do cartão.

        :return: The id_cartao of this SetPagamento.
        :rtype: str
        """
        return self._id_cartao

    @id_cartao.setter
    def id_cartao(self, id_cartao):
        """
        Sets the id_cartao of this SetPagamento.
        Número identificador referente ao proxy do cartão.

        :param id_cartao: The id_cartao of this SetPagamento.
        :type: str
        """

        self._id_cartao = id_cartao

    @property
    def senha(self):
        """
        Gets the senha of this SetPagamento.
        Senha do cartão.

        :return: The senha of this SetPagamento.
        :rtype: str
        """
        return self._senha

    @senha.setter
    def senha(self, senha):
        """
        Sets the senha of this SetPagamento.
        Senha do cartão.

        :param senha: The senha of this SetPagamento.
        :type: str
        """

        self._senha = senha

    @property
    def codigo_barras(self):
        """
        Gets the codigo_barras of this SetPagamento.
        Código de pagamento identificado no documento (boleto).

        :return: The codigo_barras of this SetPagamento.
        :rtype: str
        """
        return self._codigo_barras

    @codigo_barras.setter
    def codigo_barras(self, codigo_barras):
        """
        Sets the codigo_barras of this SetPagamento.
        Código de pagamento identificado no documento (boleto).

        :param codigo_barras: The codigo_barras of this SetPagamento.
        :type: str
        """

        self._codigo_barras = codigo_barras

    def to_dict(self):
        """
        Returns the model properties as a dict
        """
        result = {}

        for attr, _ in iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """
        Returns the string representation of the model
        """
        return pformat(self.to_dict())

    def __repr__(self):
        """
        For `print` and `pprint`
        """
        return self.to_str()

    def __eq__(self, other):
        """
        Returns true if both objects are equal
        """
        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """
        Returns true if both objects are not equal
        """
        return not self == other
