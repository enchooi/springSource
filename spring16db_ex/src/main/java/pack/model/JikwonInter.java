package pack.model;

import java.util.List;

import org.springframework.dao.DataAccessException;

public interface JikwonInter {
	List<JikwonDto> selectList(String gogekNum, String gogekName) throws DataAccessException;	// 추상메소드 하나만 만들었다.
}
