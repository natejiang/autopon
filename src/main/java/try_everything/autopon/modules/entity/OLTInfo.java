package try_everything.autopon.modules.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="oLTInfo")
public class OLTInfo {
	/**
	 * OLT信息持久化类
	 * @author Jiangnan
	 * @since 2016-04-05
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String name;
	String enname;
	String firm;
	String model;
	String ip;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEnname() {
		return enname;
	}
	public void setEnname(String enname) {
		this.enname = enname;
	}
	public String getFirm() {
		return firm;
	}
	public void setFirm(String firm) {
		this.firm = firm;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}

}
