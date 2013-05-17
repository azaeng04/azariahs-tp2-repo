/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.store.feed.app.factory;

import com.store.feed.domain.Roles;

/**
 *
 * @author Ronald
 */
public class RolesFactory {
    public static Roles createRoles(String description, String roleName, String username) {
        Roles role = new Roles();
        role.setDescription(description);
        role.setUsername(username);
        role.setRoleName("ROLE_"+roleName);
        return role;
    }
}
