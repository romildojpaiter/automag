package br.com.paiter.vraptor.environment;


public class AutomagEnvironment {
	
}

/*@Specializes
@ApplicationScoped
public class AutomagEnvironment extends ServletBasedEnvironment {
	
	private final Properties properties = new Properties();

	public AutomagEnvironment(ServletContext context) throws IOException {
		super(context);
		InputStream stream = AutomagEnvironment.class.getResourceAsStream("/automag.properties");
		properties.load(stream);
	}
	
	public  AutomagEnvironment() throws IOException {
	}	
	
	@Override
	public boolean has(String key) {
		return super.has(key) || properties.containsKey(key);
	}
	
	@Override
	public String get(String key) {
		if (super.has(key)) {
			return resolveEnv(super.get(key));
		}
		
		if (has(key)) {
			return resolveEnv(properties.get(key).toString());
		}
			
		throw new NoSuchElementException("Key " + key + " not found in environment " + getName());
			
	}

	private String resolveEnv(String value) {
		if (value.matches("\\$\\{.+\\}")) {
			String envVar = System.getenv(value);
			if (envVar == null) {
				throw new NoSuchElementException("Environment variable " + value + " not defined!");
			}
		}
		return value;
	}

}*/
