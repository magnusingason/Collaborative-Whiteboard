package com.example.SpendGraph.Repository;

import com.example.SpendGraph.model.Transactions;
import com.example.SpendGraph.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionsRepo extends JpaRepository<Transactions, Integer> {

    Transactions save(Transactions transactions);

    List<Transactions> findByUsers(Users user);

    void delete(Transactions transactions);
}
