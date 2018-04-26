package com.ssdi.campuscare.service;

import java.util.List;

import org.json.JSONArray;

import com.ssdi.campuscare.model.Request;

public interface IRequestService 
{
	public List<Request> getAllRequests();
//	public List<Request> getProviderRequest(int provider_id);
	public JSONArray getProviderRequest(int provider_id);
//	public List<Request> getConsumerRequest(int consumer_id);
	public JSONArray getConsumerRequest(int consumer_id);
	public Request createRequest(Request request);
//	public List<Request> cancelRequest(int consumer_id, int provider_id, int category_id);
	public JSONArray cancelRequest(int consumer_id, int provider_id, int category_id);
	public JSONArray ProviderUpdateRequestStatus(int request_id, int provider_id, String status);
//	public JSONArray ProviderRejectRequest(int request_id, int provider_id);
//	public JSONArray ProviderCompleteRequest(int request_id, int provider_id);
}

