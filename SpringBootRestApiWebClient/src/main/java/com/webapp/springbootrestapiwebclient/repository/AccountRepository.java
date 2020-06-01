package com.webapp.springbootrestapiwebclient.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webapp.springbootrestapiwebclient.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


	@Modifying
	@Transactional
	@Query(value=" UPDATE account SET is_active = 0 WHERE account_id =:accountId " , nativeQuery = true)
	public void deActivateAccount(Integer accountId) ;
	
	@Modifying
	@Transactional
	@Query(value=" UPDATE account SET is_active = 1 WHERE account_id =:accountId " , nativeQuery = true)
	public void activateAccount(Integer accountId) ;
	
}
