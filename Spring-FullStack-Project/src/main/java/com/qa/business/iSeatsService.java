package com.qa.business;


import com.qa.persistence.domain.Seats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface iSeatsService extends JpaRepository<Seats, Long> {

}
