package com.backend.UserAdmin.repository

import com.backend.UserAdmin.model.AppUser
import org.springframework.data.jpa.repository.JpaRepository

interface AppUserRepository : JpaRepository<AppUser, String> {
}