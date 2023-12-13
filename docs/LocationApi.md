# LocationApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getLocationsV3**](LocationApi.md#getLocationsV3) | **GET** /api/locations | Get locations |


<a id="getLocationsV3"></a>
# **getLocationsV3**
> GetLocationsV3200Response getLocationsV3(page, pageSize, xApiVersion, sort, name)

Get locations

Gets all location.

### Example
```java
// Import classes:
import org.blutspende.lablink.ApiClient;
import org.blutspende.lablink.ApiException;
import org.blutspende.lablink.Configuration;
import org.blutspende.lablink.auth.*;
import org.blutspende.lablink.models.*;
import org.blutspende.lablink.api.LocationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    LocationApi apiInstance = new LocationApi(defaultClient);
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    String name = "name_example"; // String | The name filter
    try {
      GetLocationsV3200Response result = apiInstance.getLocationsV3(page, pageSize, xApiVersion, sort, name);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LocationApi#getLocationsV3");
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
| **name** | **String**| The name filter | [optional] |

### Return type

[**GetLocationsV3200Response**](GetLocationsV3200Response.md)

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

