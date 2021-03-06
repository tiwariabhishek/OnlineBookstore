package com.weblearning.bookstore.services;

import java.util.List;

import com.weblearning.bookstore.dto.ActiveSubscriptionDTO;
import com.weblearning.bookstore.dto.SubscriptionPlanDTO;
import com.weblearning.bookstore.dto.UserEntityDTO;
import com.weblearning.bookstore.exception.DAOLayerException;
import com.weblearning.bookstore.exception.ServiceLayerException;

public interface SubscriptionService {

	public boolean uploadSubscriptionsXML(String filename)
			throws ServiceLayerException;

	public SubscriptionPlanDTO getSubscriptionPlan(long planId)
			throws ServiceLayerException;

	public List<SubscriptionPlanDTO> getAllSubscriptions()
			throws ServiceLayerException;

	public String changeSubscription(String email, long planId)
			throws ServiceLayerException;

	public List<ActiveSubscriptionDTO> getUserSubscriptionHistory(String email)
			throws ServiceLayerException;

	public List<UserEntityDTO> getAllUsersWithActiveSubscription()
			throws ServiceLayerException;

	void myServiceLayerException(String message,
			DAOLayerException daoLayerException) throws ServiceLayerException;
}
