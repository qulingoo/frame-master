package com.qlk.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * ≈‰÷√
 * 
 * @author qlk
 *
 */
public class Configuation implements Configure {
	private static Configuation config;
	private ResourceBundle configResource;
	private Map<String, Object> extraConfig;

	private Configuation() {
		configResource = ResourceBundle.getBundle("config");
		extraConfig = new HashMap<>();
	}

	public static Configuation getConfigure() {
		synchronized (Configuation.class) {
			if (config == null) {
				config = new Configuation();
			}
			return config;
		}
	}

	@Override
	public Object get(String key) {
		Object value = configResource.getObject(key);
		if (value == null) {
			value = extraConfig.get(key);
		}
		return value;
	}
	@Override
	public String getString(String key) {
		Object value = get(key);
		return value == null ? null : value.toString();
	}
	@Override
	public void set(String key, Object value) {
		extraConfig.put(key, value);
	}
	@Override
	public boolean exist(String key) {
		boolean flag = false;
		flag = configResource.containsKey(key);
		if (!flag) {
			flag = extraConfig.containsKey(key);
		}
		return flag;
	}

}
