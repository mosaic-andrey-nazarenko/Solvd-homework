package com.solvd.university.dao.mysql;

import java.util.List;

import com.solvd.connectionpool.MyConnectionPool;
import com.solvd.university.dao.interfaces.IReservationRoomDAO;
import com.solvd.university.model.ReservationRoom;

public class ReservationRoomDAO extends MySQLDAO implements IReservationRoomDAO  {

	public ReservationRoomDAO(MyConnectionPool connection) {
		super(connection);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean save(ReservationRoom b) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeById(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReservationRoom getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReservationRoom> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
