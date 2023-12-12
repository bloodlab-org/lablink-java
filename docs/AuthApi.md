# AuthApi

All URIs are relative to *https://blutspende.org/lablink*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**loginV3**](AuthApi.md#loginV3) | **POST** /api/login | Login |


<a id="loginV3"></a>
# **loginV3**
> LoginResponse loginV3(grantType, password, scope, username, xApiVersion)

Login

Login and request access token.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://blutspende.org/lablink");

    AuthApi apiInstance = new AuthApi(defaultClient);
    String grantType = "password"; // String | The grant type to use for authentication
    String password = "password_example"; // String | The password
    String scope = "api"; // String | The requested scope
    String username = "username_example"; // String | The username
    String xApiVersion = "3.0"; // String | The API version
    try {
      LoginResponse result = apiInstance.loginV3(grantType, password, scope, username, xApiVersion);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#loginV3");
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
| **grantType** | **String**| The grant type to use for authentication | [default to password] |
| **password** | **String**| The password | |
| **scope** | **String**| The requested scope | [default to api] |
| **username** | **String**| The username | |
| **xApiVersion** | **String**| The API version | [optional] [default to 3.0] |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **429** | Too Many Requests |  -  |

