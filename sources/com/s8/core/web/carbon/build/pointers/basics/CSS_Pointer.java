package com.s8.core.web.carbon.build.pointers.basics;

import java.nio.file.Path;

import com.s8.core.io.xml.annotations.XML_Type;
import com.s8.core.web.carbon.assets.CachePolicy;
import com.s8.core.web.carbon.assets.WebAsset;
import com.s8.core.web.carbon.assets.basics.CSS_WebAsset;
import com.s8.core.web.carbon.web.AssetContainerModule;

@XML_Type(name="css")	
public class CSS_Pointer extends BasicWebAssetPointer {

	public CSS_Pointer() {
		super();
		fragmentLength = 2048;
	}
	

	@Override
	public WebAsset createAsset(AssetContainerModule container, String webPathname, Path path, CachePolicy policy,
			int fragmentLength) {
		return new CSS_WebAsset(container, webPathname, path, cacheControl, fragmentLength);
	}
}


