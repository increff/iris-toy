package com.iris.increff.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.iris.increff")
@PropertySources({ //
		@PropertySource(value = "file:./toyIRIS.properties", ignoreResourceNotFound = true) //
})
public class SpringConfig {


}
