package com.jellyfishtech.pay.dao;

import com.jellyfishtech.pay.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends JpaRepository<User,String> {
}
