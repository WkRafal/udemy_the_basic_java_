package com.example.SpringBoot002.repositories;

import com.example.SpringBoot002.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
