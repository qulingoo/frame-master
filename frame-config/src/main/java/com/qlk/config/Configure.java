package com.qlk.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class Configure {
	private static Configure config;
	private ResourceBundle configResource;
	private Map<String, Object> extraConfig;

	private Configure() {
		configResource = ResourceBundle.getBundle("messages");
		extraConfig = new HashMap<>();
	}

	public static Configure getConfigure() {
		synchronized (Configure.class) {
			if (config == null) {
				config = new Configure();
			}
			return config;
		}
	}

	public Object get(String key) {
		Object value = configResource.getObject(key);
		if (value == null) {
			value = extraConfig.get(key);
		}
		return value;
	}

	public void set(String key, Object value) {
		extraConfig.put(key, value);
	}

}
