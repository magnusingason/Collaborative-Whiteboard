package com.example.SpendGraph.Repository;

import com.example.SpendGraph.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, Integer> {

    Users save(Users user);

    Users findByusername(String username);


}
