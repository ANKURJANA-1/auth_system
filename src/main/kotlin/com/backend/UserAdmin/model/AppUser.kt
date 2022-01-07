package com.backend.UserAdmin.model

import com.backend.UserAdmin.enums.ApproveStatus
import com.backend.UserAdmin.enums.DataStatus
import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.time.OffsetDateTime
import java.util.*
import javax.persistence.*


@Entity
@Table(name = "app_users")
data class AppUser(
    @Id
    val appUserId: String = UUID.randomUUID().toString(),
    @Column(name = "first_name", nullable = false)
    var firstName: String = "",
    @Column(name = "last_name", nullable = false)
    var lastName: String = "",
    @Column(name = "email_address", nullable = false)
    var emailAddress: String = "",
    @OneToOne
    var country: Country = Country(),
    @JsonIgnore
    @Column(name = "password", nullable = false)
    var password: String = "",
    @OneToOne(mappedBy = "appUser")
    var roles: Role = Role(),
    var approve: ApproveStatus = ApproveStatus.PENDING,
    @Column(name = "created_by", nullable = false)
    var createdBy: String = "superuser",
    var dataStatus: DataStatus = DataStatus.ACTIVE,
    @UpdateTimestamp
    var lastUpdated: OffsetDateTime = OffsetDateTime.now(),
    @CreationTimestamp
    var createdDate: OffsetDateTime = OffsetDateTime.now(),
)
