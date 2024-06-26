/**
 * 
 */
/**
 * @author pierreconvert
 *
 */
module com.s8.core.web.carbon {


	/* <carbon> */
	exports com.s8.core.web.carbon.assets;
	
	exports com.s8.core.web.carbon.build;

	exports com.s8.core.web.carbon.build.pointers;
	exports com.s8.core.web.carbon.build.pointers.basics;
	exports com.s8.core.web.carbon.build.pointers.bundles;
	exports com.s8.core.web.carbon.build.pointers.folder;
		
	exports com.s8.core.web.carbon.build.filters;
	exports com.s8.core.web.carbon.build.filters.basics;
	
	exports com.s8.core.web.carbon.build.sources;

	exports com.s8.core.web.carbon.web;
	/* </carbon> */

	
	/* <dependencies> */
	requires transitive com.s8.api;
	requires transitive com.s8.core.io.bytes;
	requires transitive com.s8.core.io.xml;
	//requires transitive com.s8.core.io.csv;
	
	requires transitive com.s8.core.arch.silicon;
	requires transitive com.s8.core.arch.titanium;
	requires transitive com.s8.core.web.helium;
	/* </dependencies> */
	
}