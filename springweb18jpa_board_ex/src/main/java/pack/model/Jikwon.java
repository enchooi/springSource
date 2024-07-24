package pack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "jikwon")
public class Jikwon { // 실제 DB랑 매핑을 위한...   Entity
	@Id
	@Column(name = "jikwon_no")
	private int no;
	
	@Column(name="buser_num")
	private int num; 
	
	@Column(name="jikwon_pay")
	private int pay;
	
    @Column(name = "jikwon_name")
	private String name;

    @Column(name = "jikwon_rating")
	private String rating;

    @Column(name = "jikwon_jik")
    private String jik;

}
