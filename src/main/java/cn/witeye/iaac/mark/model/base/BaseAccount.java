package cn.witeye.iaac.mark.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseAccount<M extends BaseAccount<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setNickName(java.lang.String nickName) {
		set("nickName", nickName);
	}
	
	public java.lang.String getNickName() {
		return getStr("nickName");
	}

	public void setUserName(java.lang.String userName) {
		set("userName", userName);
	}
	
	public java.lang.String getUserName() {
		return getStr("userName");
	}

	public void setPassword(java.lang.String password) {
		set("password", password);
	}
	
	public java.lang.String getPassword() {
		return getStr("password");
	}

	public void setSalt(java.lang.String salt) {
		set("salt", salt);
	}
	
	public java.lang.String getSalt() {
		return getStr("salt");
	}

	public void setDepartmentId(java.lang.Integer departmentId) {
		set("departmentId", departmentId);
	}
	
	public java.lang.Integer getDepartmentId() {
		return getInt("departmentId");
	}

	/**
	 * -1:锁定,0:注册,未激活,1:正常
	 */
	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	/**
	 * -1:锁定,0:注册,未激活,1:正常
	 */
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	/**
	 * 0:普通用户,1:普通管理员,9:超级管理员
	 */
	public void setType(java.lang.Integer type) {
		set("type", type);
	}
	
	/**
	 * 0:普通用户,1:普通管理员,9:超级管理员
	 */
	public java.lang.Integer getType() {
		return getInt("type");
	}

	public void setCreateAt(java.util.Date createAt) {
		set("createAt", createAt);
	}
	
	public java.util.Date getCreateAt() {
		return get("createAt");
	}

	public void setIp(java.lang.String ip) {
		set("ip", ip);
	}
	
	public java.lang.String getIp() {
		return getStr("ip");
	}

	public void setAvatar(java.lang.String avatar) {
		set("avatar", avatar);
	}
	
	public java.lang.String getAvatar() {
		return getStr("avatar");
	}

}
