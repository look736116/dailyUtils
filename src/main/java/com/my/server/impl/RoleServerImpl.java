package com.my.server.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.dao.RoleMapper;
import com.my.entity.Role;
import com.my.server.RoleServer;

@Service
public class RoleServerImpl implements RoleServer {
	
	@Resource
	private RoleMapper roleMapper;

	@Override
	public Role getRoleById(String roleId) {
		// TODO Auto-generated method stub
		return this.roleMapper.getRoleById(roleId);
	}

}
