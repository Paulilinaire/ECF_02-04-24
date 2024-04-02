package com.ut.ecommerce.searchsuggestionservice.dao;
import com.ut.ecommerce.searchsuggestionservice.model.Apparel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ApparelRepository extends JpaRepository<Apparel, Integer> {

    Optional<Apparel> findByApparelId(Integer apparelId);


}
