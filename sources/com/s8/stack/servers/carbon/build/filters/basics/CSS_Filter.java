package com.s8.stack.servers.carbon.build.filters.basics;

import com.s8.io.xml.annotations.XML_Type;
import com.s8.stack.servers.carbon.assets.WebAsset;
import com.s8.stack.servers.carbon.assets.basics.CSS_WebAsset;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;

@XML_Type(name="css-filter")	
public class CSS_Filter extends BasicWebAssetFilter {

	
	@Override
	public WebAsset createAsset(CarbonBuildContext context) {
		return new CSS_WebAsset(
				context.getContainer(), 
				context.getWebPathname(), 
				context.getLocalPath(), 
				cacheControl, 
				fragmentLength);
	}

	
	@Override
	public String[] expose(String webPathname) {
		return new String[]{ webPathname };
	}
	
}
