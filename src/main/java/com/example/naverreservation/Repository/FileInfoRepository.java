package com.example.naverreservation.Repository;

import com.example.naverreservation.Domain.FileInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileInfoRepository extends JpaRepository<FileInfo, Integer> {
}
