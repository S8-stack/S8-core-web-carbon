package com.s8.web.carbon.web;

import com.s8.arch.silicon.async.SiAsyncTask;
import com.s8.arch.silicon.async.MthProfile;

public abstract class CarbonDiskTask implements SiAsyncTask {

	public final AssetContainerModule service;
	
	@Override
	public MthProfile profile() {
		return MthProfile.IO_LOCAL_DISK;
	}
	

	public CarbonDiskTask(AssetContainerModule service){
		super();
		this.service = service;
	}
	
	

}
