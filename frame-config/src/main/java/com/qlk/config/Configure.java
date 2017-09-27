package com.qlk.config;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
/**
 * ≈‰÷√
 * @author shuyun
 *
 */
public class Configure {
	private static Configure config;
	private ResourceBundle configResource;
	private Map<String, Object> extraConfig;

	private Configure() {
		configResource = ResourceBundle.getBundle("config");
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

	public String getString(String key) {
		Object value = get(key);
		return value == null ? null : value.toString();
	}

	public void set(String key, Object value) {
		extraConfig.put(key, value);
	}

	public boolean exist(String key) {
		boolean flag = false;
		flag = configResource.containsKey(key);
		if (!flag) {
			flag = extraConfig.containsKey(key);
		}
		return flag;
	}

}
