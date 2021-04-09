package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
