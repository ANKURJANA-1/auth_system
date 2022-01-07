package com.backend.UserAdmin.model

import com.backend.UserAdmin.enums.DataStatus
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "countries")
data class Country(
    @Id
    var id: String = UUID.randomUUID().toString(),
    @Column(columnDefinition = "citext")
    var knownName: String = "",
    @Column(columnDefinition = "citext")
    var officialName: String = "",
    @Column(columnDefinition = "citext")
    var isdCode: String = "",
    @Column(columnDefinition = "citext")
    var alpha2: String = "",
    @Column(columnDefinition = "citext")
    var alpha3: String = "",
    @Column(columnDefinition = "citext")
    var currencyCode: String = "",
    @JsonIgnore
    @OneToOne(mappedBy = "country")
    var appUser: AppUser = AppUser(),
    @UpdateTimestamp
    var lastUpdated: OffsetDateTime = OffsetDateTime.now(),
    @CreationTimestamp
    var createdDate: OffsetDateTime = OffsetDateTime.now(),
    @Column(nullable = false)
    var dataStatus: DataStatus = DataStatus.ACTIVE,
)