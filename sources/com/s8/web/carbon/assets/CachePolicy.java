package com.s8.web.carbon.assets;


/**
 * 
 * @author pierreconvert
 *
 */
public enum CachePolicy {

	/**
	 * load once, store in RAM and serve 
	 */
	PRODUCTION,
	
	/**
	 * reload everytime requested (so can reflect latest change)
	 */
	DEBUG;
	
}
