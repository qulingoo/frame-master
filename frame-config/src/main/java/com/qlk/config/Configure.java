package com.qlk.config;

public interface Configure {
	/**
	 * ͨ��key��ȡֵ
	 * @param key
	 * @return
	 */
	public Object get(String key);
	/**
	 * ͨ��key��ȡֵ�ַ���
	 * @param key
	 * @return
	 */
	public String getString(String key);
	/**
	 * ����ֵ
	 * @param key
	 * @param value
	 */
	public void set(String key, Object value);
	/**
	 * �ж�ֵ�Ƿ����
	 * @param key
	 * @return
	 */
	public boolean exist(String key);
}
