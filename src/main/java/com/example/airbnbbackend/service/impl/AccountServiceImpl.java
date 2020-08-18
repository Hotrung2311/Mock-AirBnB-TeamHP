package com.example.airbnbbackend.service.impl;

import com.example.airbnbbackend.jwt.UserPrinciple;
import com.example.airbnbbackend.model.Account;
import com.example.airbnbbackend.repositories.AccountRepository;
import com.example.airbnbbackend.service.AccountService;
import com.example.airbnbbackend.service.ServiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findAccountsByUsername(username);
        if (account == null){
            throw new UsernameNotFoundException(username);
        }
        return UserPrinciple.build(account);
    }

    @Override
    public void save(Account account) {
        accountRepository.save(account);
    }

    @Override
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Account findAccountByUserName(String username) {
        return accountRepository.findAccountsByUsername(username);
    }

    @Override
    public Optional<Account> findById(Long id) {
        return accountRepository.findById(id);
    }


    // bang add

    @Override
    public ServiceResult updateUser(Account account, String username) {
        return null;
    }

    @Override
    public ServiceResult changePassword(Account account, String checkPassword, String newPassword) {
        return null;
    }

    @Override
    public ServiceResult getByUserName(String username) {
        return null;
    }
}
