/**
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

package io.swagger.client.api;

import io.swagger.client.ApiInvoker;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;

import io.swagger.client.model.*;

import java.util.*;

import com.android.volley.Response;
import com.android.volley.VolleyError;

import io.swagger.client.model.MsgErro;
import io.swagger.client.model.Transferencia;
import io.swagger.client.model.TransferenciaCadastroBenificiario;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class TransferenciasApi {
  String basePath = "https://api-visa.sensedia.com/sandbox/visa/agillitas/v1";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  /**
  * Cadastro de beneficiário
  * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
   * @param beneficiario Objeto de requisição
   * @return void
  */
  public void transferenciasCadastrosPost (TransferenciaCadastroBenificiario beneficiario) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = beneficiario;
    // verify the required parameter 'beneficiario' is set
    if (beneficiario == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'beneficiario' when calling transferenciasCadastrosPost",
        new ApiException(400, "Missing the required parameter 'beneficiario' when calling transferenciasCadastrosPost"));
    }

    // create path and map variables
    String path = "/transferencias/cadastros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "access_token", "key_id", "client_id" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Cadastro de beneficiário
   * &lt;p&gt;Permite o cadastro de beneficiário para uma transferencia.&lt;/p&gt;
   * @param beneficiario Objeto de requisição
  */
  public void transferenciasCadastrosPost (TransferenciaCadastroBenificiario beneficiario, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = beneficiario;

  
    // verify the required parameter 'beneficiario' is set
    if (beneficiario == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'beneficiario' when calling transferenciasCadastrosPost",
         new ApiException(400, "Missing the required parameter 'beneficiario' when calling transferenciasCadastrosPost"));
    }
    

    // create path and map variables
    String path = "/transferencias/cadastros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "access_token", "key_id", "client_id" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
  /**
  * Transferência de valor
  * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
   * @param transferencia Objeto de requisição
   * @return void
  */
  public void transferenciasPost (Transferencia transferencia) throws TimeoutException, ExecutionException, InterruptedException, ApiException {
    Object postBody = transferencia;
    // verify the required parameter 'transferencia' is set
    if (transferencia == null) {
      VolleyError error = new VolleyError("Missing the required parameter 'transferencia' when calling transferenciasPost",
        new ApiException(400, "Missing the required parameter 'transferencia' when calling transferenciasPost"));
    }

    // create path and map variables
    String path = "/transferencias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();
    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
    }

    String[] authNames = new String[] { "access_token", "key_id", "client_id" };

    try {
      String localVarResponse = apiInvoker.invokeAPI (basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames);
      if (localVarResponse != null) {
         return ;
      } else {
         return ;
      }
    } catch (ApiException ex) {
       throw ex;
    } catch (InterruptedException ex) {
       throw ex;
    } catch (ExecutionException ex) {
       if (ex.getCause() instanceof VolleyError) {
         VolleyError volleyError = (VolleyError)ex.getCause();
         if (volleyError.networkResponse != null) {
           throw new ApiException(volleyError.networkResponse.statusCode, volleyError.getMessage());
         }
       }
       throw ex;
    } catch (TimeoutException ex) {
       throw ex;
    }
  }

      /**
   * Transferência de valor
   * &lt;p&gt;Permite a transferência de valor entre dois cartões pré cadastrados.&lt;/p&gt;
   * @param transferencia Objeto de requisição
  */
  public void transferenciasPost (Transferencia transferencia, final Response.Listener<String> responseListener, final Response.ErrorListener errorListener) {
    Object postBody = transferencia;

  
    // verify the required parameter 'transferencia' is set
    if (transferencia == null) {
       VolleyError error = new VolleyError("Missing the required parameter 'transferencia' when calling transferenciasPost",
         new ApiException(400, "Missing the required parameter 'transferencia' when calling transferenciasPost"));
    }
    

    // create path and map variables
    String path = "/transferencias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();



    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder localVarBuilder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = localVarBuilder.build();
      postBody = httpEntity;
    } else {
      // normal form params
          }

      String[] authNames = new String[] { "access_token", "key_id", "client_id" };

    try {
      apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType, authNames,
        new Response.Listener<String>() {
          @Override
          public void onResponse(String localVarResponse) {
              responseListener.onResponse(localVarResponse);
          }
      }, new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            errorListener.onErrorResponse(error);
          }
      });
    } catch (ApiException ex) {
      errorListener.onErrorResponse(new VolleyError(ex));
    }
  }
}
