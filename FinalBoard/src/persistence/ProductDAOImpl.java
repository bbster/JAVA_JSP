package persistence;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import orm.DBBuilder;

public class ProductDAOImpl implements ProductDAO {
	private static Logger log = LoggerFactory.getLogger(ProductDAOImpl.class);
	
	private SqlSession sql; 
	private static String namespace = "mapper.productMapper";
	
	public ProductDAOImpl() {
		new DBBuilder();
		sql = DBBuilder.getFactory().openSession();
	}

	@Override
	public void insert(ProductDTO pdto) {
		log.info("Product DAOipl");
		sql.insert(namespace +".padd", pdto);
		sql.commit();
	}

	@Override
	public List<ProductDTO> selectList() {
		return sql.selectList(namespace + ".pList");
	}

	@Override
	public ProductDTO selectOne(int pno) {
		return sql.selectOne(namespace + ".pDetail", pno);
	}

	@Override
	public void update(ProductDTO pdto) {
		sql.update(namespace + ".pModify", pdto);
	}

	@Override
	public void delete(int pno) {
	}

	@Override
	public void updateCount(int pno) {
	}

}
