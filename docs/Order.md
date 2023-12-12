

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**bloodDonor** | [**BloodDonor**](BloodDonor.md) |  |  [optional] |
|**boneMarrowDonor** | [**BoneMarrowDonor**](BoneMarrowDonor.md) |  |  [optional] |
|**examinations** | [**List&lt;OrderExamination&gt;**](OrderExamination.md) | The examinations belonging to the order |  |
|**id** | **UUID** | The ID of the order |  [optional] |
|**locationId** | **String** | Identifier of the location (client) |  |
|**orderCreationDateTime** | **OffsetDateTime** | The order creation date-time (yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ) |  [optional] |
|**patient** | [**Patient**](Patient.md) |  |  [optional] |
|**pseudonym** | [**Pseudonym**](Pseudonym.md) |  |  [optional] |
|**reference** | **String** | The external unique identifier of the order |  [optional] |
|**state** | **OrderStateType** |  |  [optional] |
|**type** | **OrderType** |  |  |



