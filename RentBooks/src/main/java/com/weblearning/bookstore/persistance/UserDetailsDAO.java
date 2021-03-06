package com.weblearning.bookstore.persistance;

import java.util.List;

import com.weblearning.bookstore.exception.DAOLayerException;
import com.weblearning.bookstore.persistance.entities.ActiveBookRequests;
import com.weblearning.bookstore.persistance.entities.UserEntity;
import com.weblearning.bookstore.persistance.entities.UserHistory;
import org.hibernate.HibernateException;

import com.weblearning.bookstore.persistance.entities.ActiveSubscription;

public interface UserDetailsDAO {

	public List<UserHistory> getUserHistory(String email)
			throws DAOLayerException;

	public void registerUser(UserEntity userEntity) throws DAOLayerException;;

	public void updateUser(UserEntity userEntity) throws DAOLayerException;;

	public Boolean getUserStatus(String email) throws DAOLayerException;;

	public void saveBookRequest(ActiveSubscription activeSubscription)
			throws DAOLayerException;;

	public List<UserEntity> getAllUsersWithActiveSubscription()
			throws DAOLayerException;

	public UserEntity getUserByEmail(String email) throws DAOLayerException;;

	public List<String> getAllUserEmails() throws DAOLayerException;;

	public List<ActiveBookRequests> getAllUserRequests(String email)
			throws DAOLayerException;

	public void updateActiveBookRequests(ActiveBookRequests activeBookRequest)
			throws DAOLayerException;;

	public void myDAOLayerException(String message,
			HibernateException hibernateException) throws DAOLayerException;
}
