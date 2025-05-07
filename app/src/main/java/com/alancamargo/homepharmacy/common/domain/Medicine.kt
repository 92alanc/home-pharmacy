package com.alancamargo.homepharmacy.common.domain

import java.time.Month

data class Medicine(
    val id: String,
    val name: String,
    val symptoms: List<Symptom>,
    val expiryMonth: Month,
    val expiryYear: Int,
    val type: MedicineType,
    val notes: String
)
