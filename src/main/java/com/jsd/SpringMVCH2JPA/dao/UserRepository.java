/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jsd.SpringMVCH2JPA.dao;

import com.jsd.SpringMVCH2JPA.model.UserInfo;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author JSD
 */
//@EnableJpaRepositories
public interface UserRepository extends JpaRepository<UserInfo, Long>{
    @Query("from UserInfo where lower(username)=lower(:Name) order by id desc")
    public List<UserInfo> findByUserName(@Param("Name")String name);
    
    @Query("from UserInfo where lower(email)=lower(:Email)")
    public Optional<UserInfo> findByEmail(@Param("Email")String email);
    
}
