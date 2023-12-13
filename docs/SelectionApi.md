# SelectionApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSelectionV3**](SelectionApi.md#createSelectionV3) | **POST** /api/selections | Create a selection |
| [**deleteSelectionV3**](SelectionApi.md#deleteSelectionV3) | **DELETE** /api/selections/{id} | Delete selection |
| [**deleteSelectionsV3**](SelectionApi.md#deleteSelectionsV3) | **DELETE** /api/selections | Delete selections |
| [**getSelectionDocumentsV3**](SelectionApi.md#getSelectionDocumentsV3) | **GET** /api/selections/{id}/documents | Get selected documents |
| [**getSelectionOrdersStatesV3**](SelectionApi.md#getSelectionOrdersStatesV3) | **GET** /api/selections/{id}/order-states | Get selected order states |
| [**getSelectionOrdersV3**](SelectionApi.md#getSelectionOrdersV3) | **GET** /api/selections/{id}/orders | Get selected orders |
| [**getSelectionV3**](SelectionApi.md#getSelectionV3) | **GET** /api/selections/{id} | Get selection metadata |


<a id="createSelectionV3"></a>
# **createSelectionV3**
> SelectionMetadata createSelectionV3(request, xApiVersion)

Create a selection

Creates a selection based on the provided Order ID-s over Documents, Orders or Order-states. A selection is used for creating Document, Order or Orders-state queries filtered by the provided Order ID-s.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    Selection request = new Selection(); // Selection | The selection data
    String xApiVersion = "3.0"; // String | The API version
    try {
      SelectionMetadata result = apiInstance.createSelectionV3(request, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#createSelectionV3");
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
| **request** | [**Selection**](Selection.md)| The selection data | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**SelectionMetadata**](SelectionMetadata.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a id="deleteSelectionV3"></a>
# **deleteSelectionV3**
> deleteSelectionV3(id, xApiVersion)

Delete selection

Deletes a selection by the provided selection ID.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      apiInstance.deleteSelectionV3(id, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#deleteSelectionV3");
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
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

<a id="deleteSelectionsV3"></a>
# **deleteSelectionsV3**
> deleteSelectionsV3(request, xApiVersion)

Delete selections

Deletes selections by the provided selection IDs.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    List<String> request = Arrays.asList(); // List<String> | The selection IDs
    String xApiVersion = "3.0"; // String | The API version
    try {
      apiInstance.deleteSelectionsV3(request, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#deleteSelectionsV3");
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
| **request** | [**List&lt;String&gt;**](String.md)| The selection IDs | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

null (empty response body)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
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
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetSelectionDocumentsV3200Response result = apiInstance.getSelectionDocumentsV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#getSelectionDocumentsV3");
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

<a id="getSelectionOrdersStatesV3"></a>
# **getSelectionOrdersStatesV3**
> GetOrderStatesV3200Response getSelectionOrdersStatesV3(id, page, pageSize, xApiVersion, sort)

Get selected order states

Gets order states based on the specified selection.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetOrderStatesV3200Response result = apiInstance.getSelectionOrdersStatesV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#getSelectionOrdersStatesV3");
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

[**GetOrderStatesV3200Response**](GetOrderStatesV3200Response.md)

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

<a id="getSelectionOrdersV3"></a>
# **getSelectionOrdersV3**
> GetOrdersV3200Response getSelectionOrdersV3(id, page, pageSize, xApiVersion, sort)

Get selected orders

Gets Orders based on the specified selection.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetOrdersV3200Response result = apiInstance.getSelectionOrdersV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#getSelectionOrdersV3");
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

[**GetOrdersV3200Response**](GetOrdersV3200Response.md)

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

<a id="getSelectionV3"></a>
# **getSelectionV3**
> SelectionMetadata getSelectionV3(id, xApiVersion)

Get selection metadata

Gets the metadata of the specified selection.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.SelectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    SelectionApi apiInstance = new SelectionApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      SelectionMetadata result = apiInstance.getSelectionV3(id, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SelectionApi#getSelectionV3");
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
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**SelectionMetadata**](SelectionMetadata.md)

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

