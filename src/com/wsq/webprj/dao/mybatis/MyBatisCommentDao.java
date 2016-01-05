package com.wsq.webprj.dao.mybatis;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.wsq.webprj.dao.CommentDao;
import com.wsq.webprj.dao.DebateSquareDao;
import com.wsq.webprj.vo.Comment;
import com.wsq.webprj.vo.DebateSquare;



public class MyBatisCommentDao implements CommentDao {
	
	SqlSessionFactory ssf = NewlecSqlSessionFactoryBuilder.getSqlSessionFactory();
	
	
	@Override
	public int update(String code, String context) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int count = dao.update(code, context);
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int delete(String code) throws SQLException {
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int count = dao.delete(code);
		
		session.commit();
		session.close();
		return count;
	}

	@Override
	public int insert(Comment comment) throws SQLException  {
		SqlSession session = ssf.openSession();
		CommentDao dao = session.getMapper(CommentDao.class);
		int count = dao.insert(comment);
		
		session.commit();
		session.close();
		
		return count;
	}

	@Override
	public List<Comment> getComments(String code) {
		SqlSession session = ssf.openSession();
		CommentDao commentDao = session.getMapper(CommentDao.class); // mapper��ü ����
		List<Comment> comment = commentDao.getComments(code);

		//sqlSession.close(); // ���� ����.

		return comment;
	}




}
