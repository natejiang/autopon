package try_everything.autopon.modules.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name="oltInfo")
public class OltInfo {
	/**
	 * OLT信息持久化类
	 * @author Jiangnan
	 * @since 2016-04-15
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	private String cnname;
	private String enname;
	private String model;
	private String loginname;
	private String password;
	private String ipaddress;
	@ElementCollection(targetClass=Integer.class)
	@CollectionTable(name="vlan_info",
		joinColumns=@JoinColumn(name="id",nullable=false))
	@Column(name="vlan_id")
	private List<Integer> vlanIdList = new ArrayList<>();  //OLT业务板配置VLAN信息
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCnname() {
		return cnname;
	}
	public void setCnname(String chname) {
		this.cnname = chname;
	}
	public String getEnname() {
		return enname;
	}
	public void setEnname(String enname) {
		this.enname = enname;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIpaddress() {
		return ipaddress;
	}
	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}
	public List<Integer> getVlanIdList() {
		return vlanIdList;
	}
	public void setVlanIdList(List<Integer> vlanIdList) {
		this.vlanIdList = vlanIdList;
	}

}
