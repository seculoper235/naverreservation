package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
