package com.closet.san;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

@Repository
public class ItemsDAOImpl implements ItemsDAO {
	private static final Logger log = LoggerFactory.getLogger(ItemsDAOImpl.class);

	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int itemsEnroll(ItemsDTO dto) {
		int res= 0;
		
		try {
			res = sqlSession.insert(NAMESPACE+"ItemsEnroll",dto);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return res;
		
	}

	@Override
	public List<ItemsDTO> getItemsPaging(Criteria cri) {
		int pageNum = cri.getPageNum();
		int amount = cri.getAmount();
		List<ItemsDTO> list = new ArrayList<ItemsDTO>();
		try {
			list=sqlSession.selectList(NAMESPACE + "selectList",pageNum );
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}		
		return list;
		
	}

	@Override
	public List<ItemsDTO> selectItemsList(int cate_code) {
		
		log.info("카테고리 페이지 이동");
		
		// TODO Auto-generated method stub
		List<ItemsDTO> list = new ArrayList<ItemsDTO>();
		try {
			list=sqlSession.selectList(NAMESPACE + "selectItemsList",cate_code); 
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return list;
	}

	@Override
	public int shareItems(ItemsDTO dto, MultipartFile imgFile) throws IllegalStateException, IOException {
		 String oriImgName = imgFile.getOriginalFilename();
	        String imgName = "";

	        String projectPath = "C:/milc-img";

	        // UUID 를 이용하여 파일명 새로 생성
	        // UUID - 서로 다른 객체들을 구별하기 위한 클래스
	        UUID uuid = UUID.randomUUID();

	        String savedFileName = uuid + "_" + oriImgName; // 파일명 -> imgName

	        imgName = savedFileName;

	        File saveFile = new File(projectPath, imgName);

	        imgFile.transferTo(saveFile);

	        dto.setItems_name(imgName);
	        dto.setPath("/files/" + imgName);
	        
	        // mapper 이어서
	        //itemRepository.save(dto);
		return 0;
	}
	
	
}
