package com.my.test;

import com.my.server.RoleServer;
import com.my.server.impl.RoleServerImpl;

public class TestRole {
	public static void main(String[] args) {
		RoleServer rs = new RoleServerImpl();
		System.out.println(rs.getRoleById("1"));
	}

}
