package com.qa.business;

import com.qa.persistence.domain.Booking;
import com.qa.persistence.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface TransactionService extends JpaRepository<Transaction, Long> {

    @Query("SELECT  e FROM Transaction e WHERE e.name = :name")
    List<Transaction>findByName(@Param("name") String name);

    @Query("SELECT e from Transaction e WHERE e.booking_date = :bookingdate AND e.time = :time")
    List<Transaction>findByDateAndTime(@Param("bookingdate") String bookingdate,@Param("time") String time);
}
