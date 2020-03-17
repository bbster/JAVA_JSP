package service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import persistence.ProductDAO;
import persistence.ProductDAOImpl;
import persistence.ProductDTO;

public class ProductServiceImpl implements ProductService {
	private static Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	ProductDAO pdao;
	
	public ProductServiceImpl() {
		pdao = new ProductDAOImpl();
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, String sign) {
		if(sign.equals("")) {
		} else if(sign.equals("")) {
		}
	}

	@Override
	public void write(ProductDTO pdto) {

	}

	@Override
	public List<ProductDTO> getList() {
		return null;
	}

	@Override
	public ProductDTO getProduct(int pno) {
		return null;
	}

	@Override
	public void modify(ProductDTO pdto) {

	}

	@Override
	public void remove(int pno) {

	}

	@Override
	public void count(int pno) {

	}
}
