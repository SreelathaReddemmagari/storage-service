package com.filemanagement.storage_service.Repository;

import com.filemanagement.storage_service.entity.ImageData;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StorageRepository extends JpaRepository<ImageData,Long> {
    Optional<ImageData>findByName(String fileName);
}
