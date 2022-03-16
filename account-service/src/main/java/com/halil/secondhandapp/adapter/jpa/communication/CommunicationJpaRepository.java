package com.halil.secondhandapp.adapter.jpa.communication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommunicationJpaRepository extends JpaRepository<CommunicationInfoEntity, Long> {

    List<CommunicationInfoEntity> findAllByAccount_Id(Long accountId);

    //@Query(value = "Select r FROM communication_info as r WHERE r.account.id = :accountId")
    //List<CommunicationInfoEntity>  retrieve(@Param("accountId") Long accountId);

}
