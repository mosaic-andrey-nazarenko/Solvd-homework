package com.solvd.university.dao;


import com.solvd.university.model.ReservationBook;

public interface IReservationBookDAO extends DAO<ReservationBook, Long>{
	long save(ReservationBook b);
}
