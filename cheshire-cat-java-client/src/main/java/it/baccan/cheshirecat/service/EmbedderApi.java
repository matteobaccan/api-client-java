/*
 * 😸 Cheshire-Cat API
 * Production ready AI assistant framework
 *
 * The version of the OpenAPI document: 1.6.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package it.baccan.cheshirecat.service;

import it.baccan.cheshirecat.ApiCallback;
import it.baccan.cheshirecat.ApiClient;
import it.baccan.cheshirecat.ApiException;
import it.baccan.cheshirecat.ApiResponse;
import it.baccan.cheshirecat.Configuration;
import it.baccan.cheshirecat.Pair;
import it.baccan.cheshirecat.ProgressRequestBody;
import it.baccan.cheshirecat.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import it.baccan.cheshirecat.model.HTTPValidationError;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmbedderApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EmbedderApi() {
        this(Configuration.getDefaultApiClient());
    }

    public EmbedderApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getEmbedderSettings
     * @param languageEmbedderName  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmbedderSettingsCall(String languageEmbedderName, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/embedder/settings/{languageEmbedderName}"
            .replace("{" + "languageEmbedderName" + "}", localVarApiClient.escapeString(languageEmbedderName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEmbedderSettingsValidateBeforeCall(String languageEmbedderName, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'languageEmbedderName' is set
        if (languageEmbedderName == null) {
            throw new ApiException("Missing the required parameter 'languageEmbedderName' when calling getEmbedderSettings(Async)");
        }

        return getEmbedderSettingsCall(languageEmbedderName, _callback);

    }

    /**
     * Get Embedder Settings
     * Get settings and schema of the specified Embedder
     * @param languageEmbedderName  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public Object getEmbedderSettings(String languageEmbedderName) throws ApiException {
        ApiResponse<Object> localVarResp = getEmbedderSettingsWithHttpInfo(languageEmbedderName);
        return localVarResp.getData();
    }

    /**
     * Get Embedder Settings
     * Get settings and schema of the specified Embedder
     * @param languageEmbedderName  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getEmbedderSettingsWithHttpInfo(String languageEmbedderName) throws ApiException {
        okhttp3.Call localVarCall = getEmbedderSettingsValidateBeforeCall(languageEmbedderName, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Embedder Settings (asynchronously)
     * Get settings and schema of the specified Embedder
     * @param languageEmbedderName  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmbedderSettingsAsync(String languageEmbedderName, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEmbedderSettingsValidateBeforeCall(languageEmbedderName, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getEmbeddersSettings
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmbeddersSettingsCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/embedder/settings";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getEmbeddersSettingsValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getEmbeddersSettingsCall(_callback);

    }

    /**
     * Get Embedders Settings
     * Get the list of the Embedders
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public Object getEmbeddersSettings() throws ApiException {
        ApiResponse<Object> localVarResp = getEmbeddersSettingsWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Get Embedders Settings
     * Get the list of the Embedders
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getEmbeddersSettingsWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getEmbeddersSettingsValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Embedders Settings (asynchronously)
     * Get the list of the Embedders
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getEmbeddersSettingsAsync(final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getEmbeddersSettingsValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upsertEmbedderSetting
     * @param languageEmbedderName  (required)
     * @param body  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertEmbedderSettingCall(String languageEmbedderName, Object body, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/embedder/settings/{languageEmbedderName}"
            .replace("{" + "languageEmbedderName" + "}", localVarApiClient.escapeString(languageEmbedderName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call upsertEmbedderSettingValidateBeforeCall(String languageEmbedderName, Object body, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'languageEmbedderName' is set
        if (languageEmbedderName == null) {
            throw new ApiException("Missing the required parameter 'languageEmbedderName' when calling upsertEmbedderSetting(Async)");
        }

        return upsertEmbedderSettingCall(languageEmbedderName, body, _callback);

    }

    /**
     * Upsert Embedder Setting
     * Upsert the Embedder setting
     * @param languageEmbedderName  (required)
     * @param body  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public Object upsertEmbedderSetting(String languageEmbedderName, Object body) throws ApiException {
        ApiResponse<Object> localVarResp = upsertEmbedderSettingWithHttpInfo(languageEmbedderName, body);
        return localVarResp.getData();
    }

    /**
     * Upsert Embedder Setting
     * Upsert the Embedder setting
     * @param languageEmbedderName  (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> upsertEmbedderSettingWithHttpInfo(String languageEmbedderName, Object body) throws ApiException {
        okhttp3.Call localVarCall = upsertEmbedderSettingValidateBeforeCall(languageEmbedderName, body, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Upsert Embedder Setting (asynchronously)
     * Upsert the Embedder setting
     * @param languageEmbedderName  (required)
     * @param body  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful Response </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Validation Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call upsertEmbedderSettingAsync(String languageEmbedderName, Object body, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = upsertEmbedderSettingValidateBeforeCall(languageEmbedderName, body, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
