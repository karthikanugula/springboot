package com.example.karth.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.karth.user.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
