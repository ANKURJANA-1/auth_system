package com.backend.UserAdmin.service

import com.backend.UserAdmin.model.Country
import com.backend.UserAdmin.model.request.CountryRequestBody
import com.backend.UserAdmin.repository.CountryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CountryService {

    @Autowired
    private lateinit var countryRepository: CountryRepository

    fun addCountry(
        countryRequestBody: CountryRequestBody
    ): Country {
        return try {
            countryRepository.save(
                Country(
                    knownName = countryRequestBody.knownName,
                    officialName = countryRequestBody.officialName,
                    alpha2 = countryRequestBody.alpha2,
                    alpha3 = countryRequestBody.alpha3,
                    isdCode = countryRequestBody.isdCode,
                    currencyCode = countryRequestBody.currencyCode,
                )
            )
        } catch (e: Exception) {
            throw RuntimeException(message = e.message)
        }
    }

    fun allCountry(): List<Country> {
        return try {
            countryRepository.findAll()
        } catch (e: Exception) {
            throw RuntimeException(message = e.message.toString())
        }
    }
}