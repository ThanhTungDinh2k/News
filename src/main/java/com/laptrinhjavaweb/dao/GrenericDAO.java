package com.laptrinhjavaweb.dao;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GrenericDAO<T> {
//	ham query no se co nhu cau select data len
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object...parameters);
	void update (String sql, Object...parameters);
	Long insert (String sql, Object...parameters);
	int count (String sql, Object...parameters);
}
