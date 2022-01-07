package com.backend.UserAdmin.model.request

import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull


data class CountryRequestBody(
    @field:NotNull(message = "Please provide known name")
    @field:NotBlank(message = "Please provide valid known name")
    var knownName: String = "",
    @field:NotNull(message = "Please provide official name")
    @field:NotBlank(message = "Please provide valid official name")
    var officialName: String = "",
    @field:NotNull(message = "Please provide isd code")
    @field:NotBlank(message = "Please provide valid isd code")
    var isdCode: String = "",
    @field:NotNull(message = "Please provide alpha2")
    @field:NotBlank(message = "Please provide valid alpha2")
    var alpha2: String = "",
    @field:NotNull(message = "Please provide alpha3")
    @field:NotBlank(message = "Please provide valid alpha3")
    var alpha3: String = "",
    @field:NotNull(message = "Please provide currency code")
    @field:NotBlank(message = "Please provide valid currency code")
    var currencyCode: String = "",
)
