package com.example.SpendGraph.Service;

import com.example.SpendGraph.Repository.TransactionsRepo;
import com.example.SpendGraph.Repository.UsersRepo;
import com.example.SpendGraph.model.Transactions;
import com.example.SpendGraph.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClass {

    private UsersRepo UsersRepo;
    private TransactionsRepo TransactionsRepo;

    public Users CreateUser(Users User){
        return UsersRepo.save(User);
    }

    public Transactions CreateTransaction(Transactions transaction){
        return TransactionsRepo.save(transaction);
    }

    public List<Transactions> ListByUser(Users user){
        return TransactionsRepo.findByUsers(user);
    }

    public void DeleteTransaction(Transactions transaction){
        TransactionsRepo.delete(transaction);
    }

    public Users login(String username, String password){
        Users user = UsersRepo.findByusername(username);
        if(user == null){
            return null;
        }else if(user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

}
