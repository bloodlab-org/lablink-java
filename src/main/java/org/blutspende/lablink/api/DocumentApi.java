/*
 * Lablink
 * Lablink Swagger documentation
 *
 * The version of the OpenAPI document: 3.0
 * Contact: laborit@blutspende.de
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.blutspende.lablink.api;

import org.blutspende.lablink.ApiCallback;
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.ApiResponse;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.Pair;
import org.blutspende.lablink.ProgressRequestBody;
import org.blutspende.lablink.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.blutspende.lablink.model.ApiError;
import org.blutspende.lablink.model.Document;
import org.blutspende.lablink.model.GetDocumentsV3200Response;
import org.blutspende.lablink.model.GetSelectionDocumentsV3200Response;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DocumentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DocumentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DocumentApi(ApiClient apiClient) {
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
     * Build call for getDocumentV3
     * @param id The document ID (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentV3Call(UUID id, String xApiVersion, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/documents/{id}"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentV3ValidateBeforeCall(UUID id, String xApiVersion, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getDocumentV3(Async)");
        }

        return getDocumentV3Call(id, xApiVersion, _callback);

    }

    /**
     * Get document
     * Gets a document.
     * @param id The document ID (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @return Document
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public Document getDocumentV3(UUID id, String xApiVersion) throws ApiException {
        ApiResponse<Document> localVarResp = getDocumentV3WithHttpInfo(id, xApiVersion);
        return localVarResp.getData();
    }

    /**
     * Get document
     * Gets a document.
     * @param id The document ID (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @return ApiResponse&lt;Document&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Document> getDocumentV3WithHttpInfo(UUID id, String xApiVersion) throws ApiException {
        okhttp3.Call localVarCall = getDocumentV3ValidateBeforeCall(id, xApiVersion, null);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get document (asynchronously)
     * Gets a document.
     * @param id The document ID (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentV3Async(UUID id, String xApiVersion, final ApiCallback<Document> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentV3ValidateBeforeCall(id, xApiVersion, _callback);
        Type localVarReturnType = new TypeToken<Document>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getDocumentsV3
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentsV3Call(Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/documents";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sort != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sort", sort));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getDocumentsV3ValidateBeforeCall(Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getDocumentsV3(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getDocumentsV3(Async)");
        }

        return getDocumentsV3Call(page, pageSize, xApiVersion, sort, _callback);

    }

    /**
     * Get documents
     * Gets all document.
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @return GetDocumentsV3200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public GetDocumentsV3200Response getDocumentsV3(Integer page, Integer pageSize, String xApiVersion, List<String> sort) throws ApiException {
        ApiResponse<GetDocumentsV3200Response> localVarResp = getDocumentsV3WithHttpInfo(page, pageSize, xApiVersion, sort);
        return localVarResp.getData();
    }

    /**
     * Get documents
     * Gets all document.
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @return ApiResponse&lt;GetDocumentsV3200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetDocumentsV3200Response> getDocumentsV3WithHttpInfo(Integer page, Integer pageSize, String xApiVersion, List<String> sort) throws ApiException {
        okhttp3.Call localVarCall = getDocumentsV3ValidateBeforeCall(page, pageSize, xApiVersion, sort, null);
        Type localVarReturnType = new TypeToken<GetDocumentsV3200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get documents (asynchronously)
     * Gets all document.
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getDocumentsV3Async(Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback<GetDocumentsV3200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDocumentsV3ValidateBeforeCall(page, pageSize, xApiVersion, sort, _callback);
        Type localVarReturnType = new TypeToken<GetDocumentsV3200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getSelectionDocumentsV3
     * @param id The Selection ID (required)
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSelectionDocumentsV3Call(UUID id, Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/selections/{id}/documents"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageSize", pageSize));
        }

        if (sort != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "sort", sort));
        }

        if (xApiVersion != null) {
            localVarHeaderParams.put("x-api-version", localVarApiClient.parameterToString(xApiVersion));
        }

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

        String[] localVarAuthNames = new String[] { "BearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSelectionDocumentsV3ValidateBeforeCall(UUID id, Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling getSelectionDocumentsV3(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling getSelectionDocumentsV3(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling getSelectionDocumentsV3(Async)");
        }

        return getSelectionDocumentsV3Call(id, page, pageSize, xApiVersion, sort, _callback);

    }

    /**
     * Get selected documents
     * Gets documents based on the specified selection.
     * @param id The Selection ID (required)
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @return GetSelectionDocumentsV3200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public GetSelectionDocumentsV3200Response getSelectionDocumentsV3(UUID id, Integer page, Integer pageSize, String xApiVersion, List<String> sort) throws ApiException {
        ApiResponse<GetSelectionDocumentsV3200Response> localVarResp = getSelectionDocumentsV3WithHttpInfo(id, page, pageSize, xApiVersion, sort);
        return localVarResp.getData();
    }

    /**
     * Get selected documents
     * Gets documents based on the specified selection.
     * @param id The Selection ID (required)
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @return ApiResponse&lt;GetSelectionDocumentsV3200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetSelectionDocumentsV3200Response> getSelectionDocumentsV3WithHttpInfo(UUID id, Integer page, Integer pageSize, String xApiVersion, List<String> sort) throws ApiException {
        okhttp3.Call localVarCall = getSelectionDocumentsV3ValidateBeforeCall(id, page, pageSize, xApiVersion, sort, null);
        Type localVarReturnType = new TypeToken<GetSelectionDocumentsV3200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get selected documents (asynchronously)
     * Gets documents based on the specified selection.
     * @param id The Selection ID (required)
     * @param page The desired page number (required)
     * @param pageSize The desired number of items per page (required)
     * @param xApiVersion The API version (optional, default to 3.0)
     * @param sort The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
        <tr><td> 429 </td><td> Too Many Requests </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getSelectionDocumentsV3Async(UUID id, Integer page, Integer pageSize, String xApiVersion, List<String> sort, final ApiCallback<GetSelectionDocumentsV3200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSelectionDocumentsV3ValidateBeforeCall(id, page, pageSize, xApiVersion, sort, _callback);
        Type localVarReturnType = new TypeToken<GetSelectionDocumentsV3200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
