package service;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import persistence.ProductDAO;
import persistence.ProductDAOImpl;
import persistence.ProductDTO;

public class ProductServiceImpl implements ProductService {
	private static Logger log = LoggerFactory.getLogger(ProductServiceImpl.class);

	ProductDAO pdao;
	List<ProductDTO> pList;
	ProductDTO pdto;

	public ProductServiceImpl() {
		pdao = new ProductDAOImpl();

	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response, String sign) {
		log.info(">>> List Test");
		if (sign.equals("pWrite")) {
			boolean isMultipart = ServletFileUpload.isMultipartContent(request);
			if (isMultipart) {
				ServletContext context = request.getServletContext();
				log.info("context : " + context);
				String saveDir = context.getRealPath("upload");
				log.info("saveDir : " + saveDir);
				int maxSize = 10 * 1024 * 1024;
				String encoding = "UTF-8";

				MultipartRequest multi;
				try {
					multi = new MultipartRequest(request, saveDir, maxSize, encoding, new DefaultFileRenamePolicy());
					String category = multi.getParameter("category");
					String pname = multi.getParameter("pname");
					String pwriter = multi.getParameter("pwriter");
					String pcontent = multi.getParameter("pcontent");
					String imgfile = multi.getFilesystemName("imgfile");

					ProductDTO pdto = new ProductDTO(category, pname, pcontent, pwriter, imgfile);
					write(pdto);
				} catch (IOException e) {
					log.info("Multipart Fail");
					e.printStackTrace();
				}
			}
		} else if (sign.equals("pList")) {
			pList = getList();
			request.setAttribute("objList", pList);
		} else if (sign.equals("pDetail") || sign.equals("pModify")) {
			Integer pno = (Integer)request.getAttribute("pno");
			if (pno == null) {
				pno = (Integer)request.getAttribute("pno");
			}
			pdto = getProduct(pno);
			request.setAttribute("pdto", pdto);
		} else if (sign.equals("pModifySave")) {
			int pno = Integer.parseInt(request.getParameter("pno"));
			String category = request.getParameter("category");
			String pname = request.getParameter("pname");
			String pcontent = request.getParameter("pcontent");
			pdto = new ProductDTO(pno, category, pname, pcontent);
			modify(pdto);
			request.setAttribute("pno", pno);
		}
	}

	@Override
	public void write(ProductDTO pdto) {
		log.info("검증로직 부분");
		pdao.insert(pdto);
	}

	@Override
	public List<ProductDTO> getList() {
		pdao.selectList();
		return null;
	}

	@Override
	public ProductDTO getProduct(int pno) {
		return pdao.selectOne(pno);
	}

	@Override
	public void modify(ProductDTO pdto) {
		pdao.update(pdto);
	}

	@Override
	public void remove(int pno) {

	}

	@Override
	public void count(int pno) {

	}
}
