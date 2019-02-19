package com.codeclan.example.filehomework.repositories;

import com.codeclan.example.filehomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
