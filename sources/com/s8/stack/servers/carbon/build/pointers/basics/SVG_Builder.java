package com.s8.stack.servers.carbon.build.pointers.basics;

import java.nio.file.Path;

import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.CachePolicy;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.assets.basics.SVG_WebAsset;
import com.s8.stack.servers.carbon.web.AssetContainerModule;

@XML_Type(name="svg")	
public class SVG_Builder extends BasicWebAssetPointer {

	/**
	 * 
	 */
	public SVG_Builder() {
		super();
		fragmentLength = 2048;
	}
	
	
	@Override
	public WebAsset createAsset(AssetContainerModule container, String webPathname, Path path, CachePolicy policy,
			int fragmentLength) {
		return new SVG_WebAsset(container, webPathname, path, cacheControl, fragmentLength);
	}
	
}


