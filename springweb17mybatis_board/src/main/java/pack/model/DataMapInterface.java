package pack.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import pack.controller.BoardBean;

@Mapper
public interface DataMapInterface {
	// mapper.xml에 있는 id들을 추상 메소드에 등록해주면 된다.
	// 추상 메소드명은 mapper.xml의 id명과 일치시킨다.
	List<Board> selectList();
	List<Board> selectSearch(BoardBean bean);
	Board selectOne(String num);
	
	int insert(BoardBean bean);
	int update(BoardBean bean);
	void updateReadcnt(String num);
	int delete(String num);
}
