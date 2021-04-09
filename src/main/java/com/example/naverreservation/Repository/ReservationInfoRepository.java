package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.ReservationInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationInfoRepository extends JpaRepository<ReservationInfo, Integer> {
}
