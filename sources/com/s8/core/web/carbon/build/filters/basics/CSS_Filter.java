package com.s8.core.web.carbon.build.filters.basics;

import java.nio.file.Path;

import com.s8.core.io.xml.annotations.XML_Type;
import com.s8.core.web.carbon.assets.WebAsset;
import com.s8.core.web.carbon.assets.basics.CSS_WebAsset;
import com.s8.core.web.carbon.build.CarbonBuildContext;

@XML_Type(name="css-filter")	
public class CSS_Filter extends BasicWebAssetFilter {

	
	@Override
	public WebAsset createAsset(CarbonBuildContext context, String webPathname, Path localPath) {
		return new CSS_WebAsset(
				context.getContainer(), 
				webPathname, 
				localPath, 
				cacheControl, 
				fragmentLength);
	}

	
	@Override
	public String[] expose(String webPathname) {
		return new String[]{ webPathname };
	}
	
}
