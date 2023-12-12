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
import org.openapitools.client.model.GetOrderStatesV3200Response;
import org.openapitools.client.model.GetOrdersV3200Response;
import org.openapitools.client.model.GetSelectionDocumentsV3200Response;
import org.openapitools.client.model.Selection;
import org.openapitools.client.model.SelectionMetadata;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SelectionApi
 */
@Disabled
public class SelectionApiTest {

    private final SelectionApi api = new SelectionApi();

    /**
     * Create a selection
     *
     * Creates a selection based on the provided Order ID-s over Documents, Orders or Order-states. A selection is used for creating Document, Order or Orders-state queries filtered by the provided Order ID-s.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createSelectionV3Test() throws ApiException {
        Selection request = null;
        String xApiVersion = null;
        SelectionMetadata response = api.createSelectionV3(request, xApiVersion);
        // TODO: test validations
    }

    /**
     * Delete selection
     *
     * Deletes a selection by the provided selection ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSelectionV3Test() throws ApiException {
        UUID id = null;
        String xApiVersion = null;
        api.deleteSelectionV3(id, xApiVersion);
        // TODO: test validations
    }

    /**
     * Delete selections
     *
     * Deletes selections by the provided selection IDs.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteSelectionsV3Test() throws ApiException {
        List<String> request = null;
        String xApiVersion = null;
        api.deleteSelectionsV3(request, xApiVersion);
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

    /**
     * Get selected order states
     *
     * Gets order states based on the specified selection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSelectionOrdersStatesV3Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        GetOrderStatesV3200Response response = api.getSelectionOrdersStatesV3(id, page, pageSize, xApiVersion, sort);
        // TODO: test validations
    }

    /**
     * Get selected orders
     *
     * Gets Orders based on the specified selection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSelectionOrdersV3Test() throws ApiException {
        UUID id = null;
        Integer page = null;
        Integer pageSize = null;
        String xApiVersion = null;
        List<String> sort = null;
        GetOrdersV3200Response response = api.getSelectionOrdersV3(id, page, pageSize, xApiVersion, sort);
        // TODO: test validations
    }

    /**
     * Get selection metadata
     *
     * Gets the metadata of the specified selection.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSelectionV3Test() throws ApiException {
        UUID id = null;
        String xApiVersion = null;
        SelectionMetadata response = api.getSelectionV3(id, xApiVersion);
        // TODO: test validations
    }

}
