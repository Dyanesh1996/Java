/*
 * 
 * This config class is replacement to "telusko-servlet.xml"
 * As all the configuration is in servlet class, we can skip that xml and 
 * use Configuration annotation in this class.
 * 
 */


package com.telusko.mvcWithAnnotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.telusko"})
public class ConfigClass {

}
