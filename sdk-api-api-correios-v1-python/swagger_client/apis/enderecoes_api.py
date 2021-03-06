# coding: utf-8

"""
    API dos Correios

    API de rastreios de Objetos Postais

    OpenAPI spec version: 1.0
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import sys
import os
import re

# python 2 and python 3 compatibility library
from six import iteritems

from ..configuration import Configuration
from ..api_client import ApiClient


class EnderecoesApi(object):
    """
    NOTE: This class is auto generated by the swagger code generator program.
    Do not edit the class manually.
    Ref: https://github.com/swagger-api/swagger-codegen
    """

    def __init__(self, api_client=None):
        config = Configuration()
        if api_client:
            self.api_client = api_client
        else:
            if not config.api_client:
                config.api_client = ApiClient()
            self.api_client = config.api_client

    def enderecos_cep_get(self, client_id, access_token, cep, **kwargs):
        """
        Pesquisa pelo endereço de um dado CEP.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.enderecos_cep_get(client_id, access_token, cep, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str cep: CEP a ser pesquisado. (required)
        :return: list[InlineResponse2001]
                 If the method is called asynchronously,
                 returns the request thread.
        """
        kwargs['_return_http_data_only'] = True
        if kwargs.get('callback'):
            return self.enderecos_cep_get_with_http_info(client_id, access_token, cep, **kwargs)
        else:
            (data) = self.enderecos_cep_get_with_http_info(client_id, access_token, cep, **kwargs)
            return data

    def enderecos_cep_get_with_http_info(self, client_id, access_token, cep, **kwargs):
        """
        Pesquisa pelo endereço de um dado CEP.
        This method makes a synchronous HTTP request by default. To make an
        asynchronous HTTP request, please define a `callback` function
        to be invoked when receiving the response.
        >>> def callback_function(response):
        >>>     pprint(response)
        >>>
        >>> thread = api.enderecos_cep_get_with_http_info(client_id, access_token, cep, callback=callback_function)

        :param callback function: The callback function
            for asynchronous request. (optional)
        :param str client_id: Identificação do cliente usado na autenticação. (required)
        :param str access_token: Access token usado na autenticação. (required)
        :param str cep: CEP a ser pesquisado. (required)
        :return: list[InlineResponse2001]
                 If the method is called asynchronously,
                 returns the request thread.
        """

        all_params = ['client_id', 'access_token', 'cep']
        all_params.append('callback')
        all_params.append('_return_http_data_only')
        all_params.append('_preload_content')
        all_params.append('_request_timeout')

        params = locals()
        for key, val in iteritems(params['kwargs']):
            if key not in all_params:
                raise TypeError(
                    "Got an unexpected keyword argument '%s'"
                    " to method enderecos_cep_get" % key
                )
            params[key] = val
        del params['kwargs']
        # verify the required parameter 'client_id' is set
        if ('client_id' not in params) or (params['client_id'] is None):
            raise ValueError("Missing the required parameter `client_id` when calling `enderecos_cep_get`")
        # verify the required parameter 'access_token' is set
        if ('access_token' not in params) or (params['access_token'] is None):
            raise ValueError("Missing the required parameter `access_token` when calling `enderecos_cep_get`")
        # verify the required parameter 'cep' is set
        if ('cep' not in params) or (params['cep'] is None):
            raise ValueError("Missing the required parameter `cep` when calling `enderecos_cep_get`")


        collection_formats = {}

        resource_path = '/enderecos/{cep}'.replace('{format}', 'json')
        path_params = {}
        if 'cep' in params:
            path_params['cep'] = params['cep']

        query_params = {}

        header_params = {}
        if 'client_id' in params:
            header_params['client_id'] = params['client_id']
        if 'access_token' in params:
            header_params['access_token'] = params['access_token']

        form_params = []
        local_var_files = {}

        body_params = None
        # Authentication setting
        auth_settings = []

        return self.api_client.call_api(resource_path, 'GET',
                                        path_params,
                                        query_params,
                                        header_params,
                                        body=body_params,
                                        post_params=form_params,
                                        files=local_var_files,
                                        response_type='list[InlineResponse2001]',
                                        auth_settings=auth_settings,
                                        callback=params.get('callback'),
                                        _return_http_data_only=params.get('_return_http_data_only'),
                                        _preload_content=params.get('_preload_content', True),
                                        _request_timeout=params.get('_request_timeout'),
                                        collection_formats=collection_formats)
