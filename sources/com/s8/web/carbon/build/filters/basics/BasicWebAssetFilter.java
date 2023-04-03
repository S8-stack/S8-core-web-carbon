package com.s8.web.carbon.build.filters.basics;

import com.s8.io.xml.annotations.XML_SetAttribute;
import com.s8.io.xml.annotations.XML_Type;
import com.s8.web.carbon.assets.WebAsset;
import com.s8.web.carbon.build.CarbonBuildContext;
import com.s8.web.carbon.build.filters.WebAssetFilter;

@XML_Type(name = "basic-filter", sub = {
		HTML_Filter.class,
		CSS_Filter.class,
		JS_Filter.class,
		JSON_Filter.class,
		PNG_Filter.class,
		JPG_Filter.class,
		SVG_Filter.class,
		X_TextFilter.class
})
public abstract class BasicWebAssetFilter extends WebAssetFilter {
	
	public int fragmentLength;
	
	@XML_SetAttribute(name = "frag-length")
	public void setFragmentLength(int length) {
		this.fragmentLength = length;
	}

	//public abstract void build(ContainerModule module, UpdateModule updater, String webPathname, Path path);
	
	public abstract WebAsset createAsset(CarbonBuildContext context);
	
	

	
	@Override
	public void capture(CarbonBuildContext context) {
		if(!context.isWebPathnameRegistered()) {

			
			// build asset
			WebAsset asset = createAsset(context);
			
			// advertise
			if(context.isVerbose()) {
				System.out.println("> new asset captured: "+asset);
			}
			
			// append the asset
			for(String webPathname : expose(context.getWebPathname())) {
				context.getContainer().appendAsset(webPathname, asset);		
			}
			
			context.getUpdater().appendWatched(context.getLocalPath(), asset);
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	public abstract String[] expose(String webPathname);
	

}