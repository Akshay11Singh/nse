package com.mycart.cassandra;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories({"com.mycart"})
public class CassandraConfig extends AbstractCassandraConfiguration {
/*	@Value("${cassandra.contactpoints}")
	private String contactPoints;
	@Value("${cassandra.port}")
	private int port;
	@Value("${cassandra.basePackages}")
	private String basePackages;
		@Override
	protected String getContactPoints() {
		return contactPoints;
	}

	@Override
	protected int getPort() {
		return port;
	}

	*/
	@Override
	protected String getKeyspaceName() {
		return "testakshay";
	}


	
	@Override
	public SchemaAction getSchemaAction() {
		return SchemaAction.CREATE_IF_NOT_EXISTS;
	}



	/* (non-Javadoc)
	 * @see org.springframework.data.cassandra.config.AbstractSessionConfiguration#getLocalDataCenter()
	 */
	@Override
	protected String getLocalDataCenter() {
		// TODO Auto-generated method stub
		return "datacenter1";
	}

	/*@Override
	public String[] getEntityBasePackages() {
		return new String[] { basePackages };
	}*/
}