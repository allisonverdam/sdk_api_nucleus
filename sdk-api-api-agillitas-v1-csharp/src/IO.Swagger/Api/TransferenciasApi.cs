/* 
 * API Agillitas Cartões Pré-pagos
 *
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
 *
 * OpenAPI spec version: 1.0
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using IO.Swagger.Client;
using IO.Swagger.Model;

namespace IO.Swagger.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface ITransferenciasApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Cadastro de beneficiário
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns></returns>
        void TransferenciasCadastrosPost (TransferenciaCadastroBenificiario beneficiario);

        /// <summary>
        /// Cadastro de beneficiário
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> TransferenciasCadastrosPostWithHttpInfo (TransferenciaCadastroBenificiario beneficiario);
        /// <summary>
        /// Transferência de valor
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns></returns>
        void TransferenciasPost (Transferencia transferencia);

        /// <summary>
        /// Transferência de valor
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> TransferenciasPostWithHttpInfo (Transferencia transferencia);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Cadastro de beneficiário
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task TransferenciasCadastrosPostAsync (TransferenciaCadastroBenificiario beneficiario);

        /// <summary>
        /// Cadastro de beneficiário
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> TransferenciasCadastrosPostAsyncWithHttpInfo (TransferenciaCadastroBenificiario beneficiario);
        /// <summary>
        /// Transferência de valor
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task TransferenciasPostAsync (Transferencia transferencia);

        /// <summary>
        /// Transferência de valor
        /// </summary>
        /// <remarks>
        /// &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </remarks>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> TransferenciasPostAsyncWithHttpInfo (Transferencia transferencia);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public partial class TransferenciasApi : ITransferenciasApi
    {
        private IO.Swagger.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="TransferenciasApi"/> class.
        /// </summary>
        /// <returns></returns>
        public TransferenciasApi(String basePath)
        {
            this.Configuration = new Configuration(new ApiClient(basePath));

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="TransferenciasApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public TransferenciasApi(Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = IO.Swagger.Client.Configuration.DefaultExceptionFactory;

            // ensure API client has configuration ready
            if (Configuration.ApiClient.Configuration == null)
            {
                this.Configuration.ApiClient.Configuration = this.Configuration;
            }
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public IO.Swagger.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public Dictionary<String, String> DefaultHeader()
        {
            return this.Configuration.DefaultHeader;
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Cadastro de beneficiário &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns></returns>
        public void TransferenciasCadastrosPost (TransferenciaCadastroBenificiario beneficiario)
        {
             TransferenciasCadastrosPostWithHttpInfo(beneficiario);
        }

        /// <summary>
        /// Cadastro de beneficiário &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> TransferenciasCadastrosPostWithHttpInfo (TransferenciaCadastroBenificiario beneficiario)
        {
            // verify the required parameter 'beneficiario' is set
            if (beneficiario == null)
                throw new ApiException(400, "Missing required parameter 'beneficiario' when calling TransferenciasApi->TransferenciasCadastrosPost");

            var localVarPath = "/transferencias/cadastros";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (beneficiario != null && beneficiario.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(beneficiario); // http body (model) parameter
            }
            else
            {
                localVarPostBody = beneficiario; // byte array
            }

            // authentication (access_token) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("access_token")))
            {
                localVarHeaderParams["access_token"] = Configuration.GetApiKeyWithPrefix("access_token");
            }

            // authentication (key_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarHeaderParams["api_key"] = Configuration.GetApiKeyWithPrefix("api_key");
            }

            // authentication (client_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("client_id")))
            {
                localVarHeaderParams["client_id"] = Configuration.GetApiKeyWithPrefix("client_id");
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TransferenciasCadastrosPost", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Cadastro de beneficiário &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task TransferenciasCadastrosPostAsync (TransferenciaCadastroBenificiario beneficiario)
        {
             await TransferenciasCadastrosPostAsyncWithHttpInfo(beneficiario);

        }

        /// <summary>
        /// Cadastro de beneficiário &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="beneficiario">Objeto de requisição</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> TransferenciasCadastrosPostAsyncWithHttpInfo (TransferenciaCadastroBenificiario beneficiario)
        {
            // verify the required parameter 'beneficiario' is set
            if (beneficiario == null)
                throw new ApiException(400, "Missing required parameter 'beneficiario' when calling TransferenciasApi->TransferenciasCadastrosPost");

            var localVarPath = "/transferencias/cadastros";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (beneficiario != null && beneficiario.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(beneficiario); // http body (model) parameter
            }
            else
            {
                localVarPostBody = beneficiario; // byte array
            }

            // authentication (access_token) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("access_token")))
            {
                localVarHeaderParams["access_token"] = Configuration.GetApiKeyWithPrefix("access_token");
            }
            // authentication (key_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarHeaderParams["api_key"] = Configuration.GetApiKeyWithPrefix("api_key");
            }
            // authentication (client_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("client_id")))
            {
                localVarHeaderParams["client_id"] = Configuration.GetApiKeyWithPrefix("client_id");
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TransferenciasCadastrosPost", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Transferência de valor &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns></returns>
        public void TransferenciasPost (Transferencia transferencia)
        {
             TransferenciasPostWithHttpInfo(transferencia);
        }

        /// <summary>
        /// Transferência de valor &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> TransferenciasPostWithHttpInfo (Transferencia transferencia)
        {
            // verify the required parameter 'transferencia' is set
            if (transferencia == null)
                throw new ApiException(400, "Missing required parameter 'transferencia' when calling TransferenciasApi->TransferenciasPost");

            var localVarPath = "/transferencias";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (transferencia != null && transferencia.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(transferencia); // http body (model) parameter
            }
            else
            {
                localVarPostBody = transferencia; // byte array
            }

            // authentication (access_token) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("access_token")))
            {
                localVarHeaderParams["access_token"] = Configuration.GetApiKeyWithPrefix("access_token");
            }

            // authentication (key_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarHeaderParams["api_key"] = Configuration.GetApiKeyWithPrefix("api_key");
            }

            // authentication (client_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("client_id")))
            {
                localVarHeaderParams["client_id"] = Configuration.GetApiKeyWithPrefix("client_id");
            }


            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) Configuration.ApiClient.CallApi(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TransferenciasPost", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

        /// <summary>
        /// Transferência de valor &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task TransferenciasPostAsync (Transferencia transferencia)
        {
             await TransferenciasPostAsyncWithHttpInfo(transferencia);

        }

        /// <summary>
        /// Transferência de valor &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
        /// </summary>
        /// <exception cref="IO.Swagger.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="transferencia">Objeto de requisição</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> TransferenciasPostAsyncWithHttpInfo (Transferencia transferencia)
        {
            // verify the required parameter 'transferencia' is set
            if (transferencia == null)
                throw new ApiException(400, "Missing required parameter 'transferencia' when calling TransferenciasApi->TransferenciasPost");

            var localVarPath = "/transferencias";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new Dictionary<String, String>();
            var localVarHeaderParams = new Dictionary<String, String>(Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
                "application/json"
            };
            String localVarHttpContentType = Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            // set "format" to json by default
            // e.g. /pet/{petId}.{format} becomes /pet/{petId}.json
            localVarPathParams.Add("format", "json");
            if (transferencia != null && transferencia.GetType() != typeof(byte[]))
            {
                localVarPostBody = Configuration.ApiClient.Serialize(transferencia); // http body (model) parameter
            }
            else
            {
                localVarPostBody = transferencia; // byte array
            }

            // authentication (access_token) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("access_token")))
            {
                localVarHeaderParams["access_token"] = Configuration.GetApiKeyWithPrefix("access_token");
            }
            // authentication (key_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("api_key")))
            {
                localVarHeaderParams["api_key"] = Configuration.GetApiKeyWithPrefix("api_key");
            }
            // authentication (client_id) required
            if (!String.IsNullOrEmpty(Configuration.GetApiKeyWithPrefix("client_id")))
            {
                localVarHeaderParams["client_id"] = Configuration.GetApiKeyWithPrefix("client_id");
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.POST, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("TransferenciasPost", localVarResponse);
                if (exception != null) throw exception;
            }

            
            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => x.Value.ToString()),
                null);
        }

    }
}
