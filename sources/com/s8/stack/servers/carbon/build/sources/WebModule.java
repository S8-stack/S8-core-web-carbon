package com.s8.stack.servers.carbon.build.sources;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.s8.io.xml.annotations.XML_SetValue;
import com.s8.io.xml.annotations.XML_Type;
import com.s8.io.xml.handler.XML_Lexicon;
import com.s8.stack.servers.carbon.build.CarbonBuildContext;

@XML_Type(name = "module")
public class WebModule {

	public Path path;
	
	@XML_SetValue
	public void setPathname(String pathname) {
		path = Paths.get(pathname);
	}
	
	
	/**
	 * 
	 * @param context
	 * @throws Exception 
	 */
	public void build(XML_Lexicon context, CarbonBuildContext ctx) throws Exception {
		WebSources sources = (WebSources) context.deserialize(path.toFile());
		sources.build(ctx);
	}
}
