package persistence;

import java.util.List;

public interface ProductDAO {
	void insert(ProductDTO pdto);
	List<ProductDTO> selectList();
	ProductDTO selectOne(int pno);
	void update(ProductDTO pdto);
	void delete(int pno);
	void updateCount(int pno);
}
