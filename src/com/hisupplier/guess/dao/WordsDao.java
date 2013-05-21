/**
 * 
 */
package com.hisupplier.guess.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hisupplier.guess.entity.Words;

/**
 * @author ¡÷’‹—◊
 *
 * creat in 2013-2-3
 */
public class WordsDao {

	public Words getWords(Connection conn) throws SQLException {
		String sql = "select * from Words where state=0 order by id limit 1";
		Words word = null;
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			word = new Words();
			word.setId(rs.getInt("id"));
			word.setNormalWord(rs.getString("normalWord"));
			word.setSpecialWord(rs.getString("specialWord"));
		}
		return word;
	}
}
