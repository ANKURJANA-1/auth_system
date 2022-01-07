package com.backend.UserAdmin.model

import com.backend.UserAdmin.enums.DataStatus
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "roles")
data class Role(
    @Id
    val id: String = UUID.randomUUID().toString(),
    @Column(name = "roles_name", nullable = false)
    var name: String = "",
    @JsonIgnore
    @OneToOne
    var appUser: AppUser = AppUser(),
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @UpdateTimestamp
    var lastUpdated: OffsetDateTime = OffsetDateTime.now(),
    @CreationTimestamp
    var createdDate: OffsetDateTime = OffsetDateTime.now(),
)
