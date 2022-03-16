package com.halil.secondhandapp.adapter.jpa.advertisement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdvertisementJpaRepository extends JpaRepository<AdvertisementEntity,Long> {

}
