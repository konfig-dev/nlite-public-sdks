/*
Lite API

Testing BookingManagementApiService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package openapi

import (
	"context"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
	"testing"
)

func Test_openapi_BookingManagementApiService(t *testing.T) {

	configuration := NewConfiguration()
	apiClient := NewAPIClient(configuration)

	t.Run("Test BookingManagementApiService BookingsBookingIdDelete", func(t *testing.T) {

		t.Skip("skip test") // remove to run test

		var bookingId string

		resp, httpRes, err := apiClient.BookingManagementApi.BookingsBookingIdDelete(context.Background(), bookingId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

	t.Run("Test BookingManagementApiService BookingsBookingIdGet", func(t *testing.T) {

		t.Skip("skip test") // remove to run test

		var bookingId string

		resp, httpRes, err := apiClient.BookingManagementApi.BookingsBookingIdGet(context.Background(), bookingId).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}