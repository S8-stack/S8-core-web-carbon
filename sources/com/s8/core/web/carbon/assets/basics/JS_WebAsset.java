package com.s8.core.web.carbon.assets.basics;

import java.nio.file.Path;

import com.s8.core.web.carbon.assets.CachePolicy;
import com.s8.core.web.carbon.web.AssetContainerModule;
import com.s8.core.web.helium.mime.MIME_Type;


/**
 * 
 * @author pierreconvert
 *
 */
public class JS_WebAsset extends BasicWebAsset {
	
	@Override
	public MIME_Type mime_getType() {
		return MIME_Type.JS	;
	}
	
	@Override
	public String getTypeName() {
		return "JS";
	}

	/**
	 * 
	 */
	public JS_WebAsset(AssetContainerModule module, 
			String webPathname, 
			Path localPath, 
			CachePolicy policy, 
			int fragmentLength) {
		super(module, webPathname, localPath, policy, fragmentLength);
	}
	
}
