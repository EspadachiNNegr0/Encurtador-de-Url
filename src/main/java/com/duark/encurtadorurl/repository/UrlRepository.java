package com.duark.encurtadorurl.repository;

import com.duark.encurtadorurl.entity.UrlEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<UrlEntity, String> {
}
