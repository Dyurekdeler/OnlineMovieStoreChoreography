package com.dyurekdeler.OnlineMovieStorePayment.model.kafka

import com.dyurekdeler.OnlineMovieStorePayment.model.Order
import com.dyurekdeler.OnlineMovieStorePayment.model.PaymentMethod

data class PaymentCreatedEvent(
    val order: Order
)
