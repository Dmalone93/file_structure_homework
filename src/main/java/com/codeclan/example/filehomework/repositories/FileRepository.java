package com.codeclan.example.filehomework.repositories;

import com.codeclan.example.filehomework.models.File;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
