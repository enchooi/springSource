package pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="mem")	// DB의 특정 테이블과 매핑.  얘는 물리적인 테이블명. 얘는 대소문자 구분 안해. 자동으로 대문자로 변하니까.
public class MemDto {	// 카멜케이스로 작성하면 자동으로 언더스코어 네이밍 컨벤션.   근데 얘는 대소문자 구분해.
	//@Column(name="num")	// DB 칼람명과 다를경우 적어주는 어노테이션.
	//private int number;
	@Id	// pk 칼람에 붙여주는 어노테이션.
	private int num;
	
	@Column(name="name", nullable = true)	// null을 허용하고 있자나! = true   not_null은 false로 표기.
	private String name;
	
	private String addr;
}
