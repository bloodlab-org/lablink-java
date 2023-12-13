# DocumentApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDocumentV3**](DocumentApi.md#getDocumentV3) | **GET** /api/documents/{id} | Get document |
| [**getDocumentsV3**](DocumentApi.md#getDocumentsV3) | **GET** /api/documents | Get documents |
| [**getSelectionDocumentsV3**](DocumentApi.md#getSelectionDocumentsV3) | **GET** /api/selections/{id}/documents | Get selected documents |


<a id="getDocumentV3"></a>
# **getDocumentV3**
> Document getDocumentV3(id, xApiVersion)

Get document

Gets a document.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The document ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      Document result = apiInstance.getDocumentV3(id, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getDocumentV3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The document ID | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**Document**](Document.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

<a id="getDocumentsV3"></a>
# **getDocumentsV3**
> GetDocumentsV3200Response getDocumentsV3(page, pageSize, xApiVersion, sort)

Get documents

Gets all document.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetDocumentsV3200Response result = apiInstance.getDocumentsV3(page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getDocumentsV3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The desired page number | [default to 0] |
| **pageSize** | **Integer**| The desired number of items per page | [default to 25] |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |
| **sort** | [**List&lt;String&gt;**](String.md)| The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc | [optional] |

### Return type

[**GetDocumentsV3200Response**](GetDocumentsV3200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a id="getSelectionDocumentsV3"></a>
# **getSelectionDocumentsV3**
> GetSelectionDocumentsV3200Response getSelectionDocumentsV3(id, page, pageSize, xApiVersion, sort)

Get selected documents

Gets documents based on the specified selection.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.DocumentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    DocumentApi apiInstance = new DocumentApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetSelectionDocumentsV3200Response result = apiInstance.getSelectionDocumentsV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DocumentApi#getSelectionDocumentsV3");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **UUID**| The Selection ID | |
| **page** | **Integer**| The desired page number | [default to 0] |
| **pageSize** | **Integer**| The desired number of items per page | [default to 25] |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |
| **sort** | [**List&lt;String&gt;**](String.md)| The sorting parameters in the format of \&quot;fieldName,asc/desc\&quot;. E.g. type,desc | [optional] |

### Return type

[**GetSelectionDocumentsV3200Response**](GetSelectionDocumentsV3200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

