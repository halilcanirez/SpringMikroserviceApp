package com.halil.secondhandapp.adapter.jpa.followedadvertisement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowedAdvertisementJpaRepository extends JpaRepository<FollowedAdvertisementEntity , Long> {


    List<FollowedAdvertisementEntity> findAllByAccount_Id(Long accountId);
}
