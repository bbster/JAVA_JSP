package persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import orm.DBBuilder;

public class MemberDAOImpl implements MemberDAO {

	private static Logger log = LoggerFactory.getLogger(MemberDAOImpl.class);
	private SqlSession sql; 
	private static String namespace = "mapper.memberMapper";
	
	public MemberDAOImpl() {
		new DBBuilder();
		sql = DBBuilder.getFactory().openSession();
	}

	@Override
	public boolean join(MemberDTO mdto) {
		sql.insert(namespace+".madd", mdto);
		sql.commit();		
		return true;
	}

	@Override
	public MemberDTO login(MemberDTO mdto) {
		return sql.selectOne(namespace+".mlogin", mdto);		
	}

	@Override
	public int idCheck(String email) {		
		return sql.selectOne(namespace+".idCheck", email);
	}

	@Override
	public List<MemberDTO> selectList() {
		return sql.selectList(namespace+".mlist");
	}
	
	@Override
	public int delete(String email) {
		return sql.delete(namespace + ".mdelete", email);
	}
}
