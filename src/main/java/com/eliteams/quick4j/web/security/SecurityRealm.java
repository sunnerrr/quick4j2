package com.eliteams.quick4j.web.security;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
import com.eliteams.quick4j.web.model.Permission;
import com.eliteams.quick4j.web.model.Role;
import com.eliteams.quick4j.web.model.User;
import com.eliteams.quick4j.web.service.PermissionService;
import com.eliteams.quick4j.web.service.RoleService;
import com.eliteams.quick4j.web.service.UserService;

/**
 * 用户身份验证,授权 Realm 组件
 * 
 * @author StarZou
 * @since 2014年6月11日 上午11:35:28
 **/
@Component(value = "securityRealm")
public class SecurityRealm {

	@Resource
	private UserService userService;

	@Resource
	private RoleService roleService;

	@Resource
	private PermissionService permissionService;


}
