# OrderApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrdersV3**](OrderApi.md#createOrdersV3) | **POST** /api/orders | Create order(s) |
| [**deleteOrderV3**](OrderApi.md#deleteOrderV3) | **DELETE** /api/orders/{id} | Delete order |
| [**deleteOrdersV3**](OrderApi.md#deleteOrdersV3) | **DELETE** /api/orders | Delete orders |
| [**getOrderStateV3**](OrderApi.md#getOrderStateV3) | **GET** /api/orders/{id}/state | Get order state |
| [**getOrderStatesV3**](OrderApi.md#getOrderStatesV3) | **GET** /api/order-states | Get order states |
| [**getOrderV3**](OrderApi.md#getOrderV3) | **GET** /api/orders/{id} | Get order |
| [**getOrdersV3**](OrderApi.md#getOrdersV3) | **GET** /api/orders | Get orders |
| [**getSelectionOrdersStatesV3**](OrderApi.md#getSelectionOrdersStatesV3) | **GET** /api/selections/{id}/order-states | Get selected order states |
| [**getSelectionOrdersV3**](OrderApi.md#getSelectionOrdersV3) | **GET** /api/selections/{id}/orders | Get selected orders |


<a id="createOrdersV3"></a>
# **createOrdersV3**
> List&lt;OrderMetadata&gt; createOrdersV3(request, xApiVersion)

Create order(s)

Creates order(s).

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    List<Order> request = Arrays.asList(); // List<Order> | The order data
    String xApiVersion = "3.0"; // String | The API version
    try {
      List<OrderMetadata> result = apiInstance.createOrdersV3(request, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#createOrdersV3");
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
| **request** | [**List&lt;Order&gt;**](Order.md)| The order data | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**List&lt;OrderMetadata&gt;**](OrderMetadata.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **413** | Content Too Large |  -  |
| **429** | Too Many Requests |  -  |

<a id="deleteOrderV3"></a>
# **deleteOrderV3**
> deleteOrderV3(id, xApiVersion)

Delete order

Deletes an order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The order ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      apiInstance.deleteOrderV3(id, xApiVersion);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrderV3");
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
| **id** | **UUID**| The order ID | |
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
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **429** | Too Many Requests |  -  |

<a id="deleteOrdersV3"></a>
# **deleteOrdersV3**
> List&lt;String&gt; deleteOrdersV3(request, xApiVersion)

Delete orders

Deletes all order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    List<String> request = Arrays.asList(); // List<String> | The order IDs
    String xApiVersion = "3.0"; // String | The API version
    try {
      List<String> result = apiInstance.deleteOrdersV3(request, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#deleteOrdersV3");
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
| **request** | [**List&lt;String&gt;**](String.md)| The order IDs | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

**List&lt;String&gt;**

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Partially processed |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too Many Requests |  -  |

<a id="getOrderStateV3"></a>
# **getOrderStateV3**
> GetOrderStatesV3200Response getOrderStateV3(id, xApiVersion)

Get order state

Gets an order&#39;s state.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The order ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      GetOrderStatesV3200Response result = apiInstance.getOrderStateV3(id, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderStateV3");
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
| **id** | **UUID**| The order ID | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

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

<a id="getOrderStatesV3"></a>
# **getOrderStatesV3**
> GetOrderStatesV3200Response getOrderStatesV3(page, pageSize, xApiVersion, sort, createdFrom, createdTo, searchContent, state, type)

Get order states

Gets the state of all orders.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    String createdFrom = "createdFrom_example"; // String | The created-from filter (inclusive). Format: yyyy-MM-dd.
    String createdTo = "createdTo_example"; // String | The created-to filter (exclusive). Format: yyyy-MM-dd.
    String searchContent = "searchContent_example"; // String | The searched content in the different dataset
    String state = "CONFIRMATORY"; // String | The state filter
    String type = "DONOR"; // String | The type filter
    try {
      GetOrderStatesV3200Response result = apiInstance.getOrderStatesV3(page, pageSize, xApiVersion, sort, createdFrom, createdTo, searchContent, state, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderStatesV3");
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
| **createdFrom** | **String**| The created-from filter (inclusive). Format: yyyy-MM-dd. | [optional] |
| **createdTo** | **String**| The created-to filter (exclusive). Format: yyyy-MM-dd. | [optional] |
| **searchContent** | **String**| The searched content in the different dataset | [optional] |
| **state** | **String**| The state filter | [optional] [enum: CONFIRMATORY, DELETED, ENTERED, FINALIZED, PROCESSING, WAITING_FOR_MATERIAL] |
| **type** | **String**| The type filter | [optional] [enum: DONOR, BONE_MARROW_DONOR, PERSONAL, PSEUDONYMIZED] |

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
| **429** | Too Many Requests |  -  |

<a id="getOrderV3"></a>
# **getOrderV3**
> Order getOrderV3(id, xApiVersion)

Get order

Gets an order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The order ID
    String xApiVersion = "3.0"; // String | The API version
    try {
      Order result = apiInstance.getOrderV3(id, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrderV3");
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
| **id** | **UUID**| The order ID | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**Order**](Order.md)

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

<a id="getOrdersV3"></a>
# **getOrdersV3**
> GetOrdersV3200Response getOrdersV3(page, pageSize, xApiVersion, sort, createdFrom, createdTo, locationId, searchContent, state, type)

Get orders

Gets all order.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    String createdFrom = "createdFrom_example"; // String | The created-from filter (inclusive). Format: yyyy-MM-dd.
    String createdTo = "createdTo_example"; // String | The created-to filter (exclusive). Format: yyyy-MM-dd.
    String locationId = "locationId_example"; // String | The location filter
    String searchContent = "searchContent_example"; // String | The searched content in the different dataset
    String state = "CONFIRMATORY"; // String | The state filter
    String type = "DONOR"; // String | The type filter
    try {
      GetOrdersV3200Response result = apiInstance.getOrdersV3(page, pageSize, xApiVersion, sort, createdFrom, createdTo, locationId, searchContent, state, type);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getOrdersV3");
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
| **createdFrom** | **String**| The created-from filter (inclusive). Format: yyyy-MM-dd. | [optional] |
| **createdTo** | **String**| The created-to filter (exclusive). Format: yyyy-MM-dd. | [optional] |
| **locationId** | **String**| The location filter | [optional] |
| **searchContent** | **String**| The searched content in the different dataset | [optional] |
| **state** | **String**| The state filter | [optional] [enum: CONFIRMATORY, DELETED, ENTERED, FINALIZED, PROCESSING, WAITING_FOR_MATERIAL] |
| **type** | **String**| The type filter | [optional] [enum: DONOR, BONE_MARROW_DONOR, PERSONAL, PSEUDONYMIZED] |

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
| **429** | Too Many Requests |  -  |

<a id="getSelectionOrdersStatesV3"></a>
# **getSelectionOrdersStatesV3**
> GetOrderStatesV3200Response getSelectionOrdersStatesV3(id, page, pageSize, xApiVersion, sort)

Get selected order states

Gets order states based on the specified selection.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetOrderStatesV3200Response result = apiInstance.getSelectionOrdersStatesV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getSelectionOrdersStatesV3");
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
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    OrderApi apiInstance = new OrderApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The Selection ID
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    try {
      GetOrdersV3200Response result = apiInstance.getSelectionOrdersV3(id, page, pageSize, xApiVersion, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrderApi#getSelectionOrdersV3");
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

