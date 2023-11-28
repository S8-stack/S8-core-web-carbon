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
public class HTML_WebAsset extends BasicWebAsset {
	
	
	@Override
	public MIME_Type mime_getType() {
		return MIME_Type.HTML;
	}

	@Override
	public String getTypeName() {
		return "HTML";
	}

	/**
	 * 
	 */
	public HTML_WebAsset(AssetContainerModule module, 
			String webPathname, 
			Path path, 
			CachePolicy policy, 
			int fragmentLength) {
		super(module, webPathname, path, policy, fragmentLength);
	}
	
	
}
