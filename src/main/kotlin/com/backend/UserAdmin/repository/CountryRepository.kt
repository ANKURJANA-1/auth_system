package com.backend.UserAdmin.repository

import com.backend.UserAdmin.model.Country
import org.springframework.data.jpa.repository.JpaRepository

interface CountryRepository : JpaRepository<Country, String> {
}