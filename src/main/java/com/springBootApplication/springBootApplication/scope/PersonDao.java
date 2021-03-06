package com.springBootApplication.springBootApplication.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class PersonDao {
	
	@Autowired
	JdbcConnection jdbcConnection;
	
	public JdbcConnection getJdbcConnection()
	{
		return jdbcConnection;
	}

}
