Feature: validating Place API's

  Scenario: Verify if place is being successfully added using addPlaceAPI
    Given Add Place Payload
    When user calls "AddPlaceAPI" with Post http request
    Then the API call got success with status code "200"
    And "status" in response body is "OK"
