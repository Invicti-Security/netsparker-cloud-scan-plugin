package com.netsparker.cloud.model;

import com.netsparker.cloud.utility.AppCommon;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class ScanRequestBase{
	protected static final String json = "application/json";
	
	//Called from server-side
	public ScanRequestBase(String apiURL, String apiToken) throws MalformedURLException {
		this.ApiURL = AppCommon.getBaseURL(apiURL);
		this.ApiToken = apiToken;
	}
	
	public ScanRequestBase() {
		this.ApiURL = null;
		this.ApiToken = null;
	}
	
	public final URL ApiURL;
	public final String ApiToken;
}