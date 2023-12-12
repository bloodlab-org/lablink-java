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


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.Document;
import org.openapitools.client.model.GetDocumentsV3200Response;
import org.openapitools.client.model.GetSelectionDocumentsV3200Response;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DocumentApi
 */
@Disabled
public class DocumentApiTest {

    private final DocumentApi api = new DocumentApi();

    /**
     * Get document
     *
     * Gets a document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentV3Test() throws ApiException {
        UUID id = null;
        String xApiVersion = null;
        Document response = api.getDocumentV3(id, xApiVersion);
        // TODO: test validations
    }

    /**
     * Get documents
     *
     * Gets all document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDocumentsV3Test() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        GetDocumentsV3200Response response = api.getDocumentsV3(page, pageSize, xApiVersion, sort);
        // TODO: test validations
    }

    /**
     * Get selected documents
     *
     * Gets documents based on the specified selection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSelectionDocumentsV3Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        GetSelectionDocumentsV3200Response response = api.getSelectionDocumentsV3(id, page, pageSize, xApiVersion, sort);
        // TODO: test validations
    }

}
