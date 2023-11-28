package com.s8.core.web.carbon.assets;

import com.s8.core.web.helium.http2.HTTP2_Status;

public class LoadingError {


	public final HTTP2_Status status;
	
	public final String message;
	

	public LoadingError(HTTP2_Status status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	
	
}
