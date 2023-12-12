# ExaminationApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getExaminationsV3**](ExaminationApi.md#getExaminationsV3) | **GET** /api/examinations | Get examinations |


<a id="getExaminationsV3"></a>
# **getExaminationsV3**
> GetExaminationsV3200Response getExaminationsV3(page, pageSize, xApiVersion, sort, code, name, unit)

Get examinations

Gets all examination.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ExaminationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");
    
    // Configure API key authorization: BearerAuth
    ApiKeyAuth BearerAuth = (ApiKeyAuth) defaultClient.getAuthentication("BearerAuth");
    BearerAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //BearerAuth.setApiKeyPrefix("Token");

    ExaminationApi apiInstance = new ExaminationApi(defaultClient);
    Integer page = 0; // Integer | The desired page number
    Integer pageSize = 25; // Integer | The desired number of items per page
    String xApiVersion = "3.0"; // String | The API version
    List<String> sort = Arrays.asList(); // List<String> | The sorting parameters in the format of \"fieldName,asc/desc\". E.g. type,desc
    String code = "code_example"; // String | The code filter
    String name = "name_example"; // String | The name filter
    String unit = "unit_example"; // String | The unit filter
    try {
      GetExaminationsV3200Response result = apiInstance.getExaminationsV3(page, pageSize, xApiVersion, sort, code, name, unit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExaminationApi#getExaminationsV3");
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
| **code** | **String**| The code filter | [optional] |
| **name** | **String**| The name filter | [optional] |
| **unit** | **String**| The unit filter | [optional] |

### Return type

[**GetExaminationsV3200Response**](GetExaminationsV3200Response.md)

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

