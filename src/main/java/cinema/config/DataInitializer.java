package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void initRolesAndUsers() {
        Role userRole = new Role();
        userRole.setRoleName(Role.RoleName.USER);
        Role adminRole = new Role();
        adminRole.setRoleName(Role.RoleName.ADMIN);
        roleService.add(userRole);
        roleService.add(adminRole);

        User user = new User();
        user.setRoles(Set.of(userRole));
        user.setEmail("user@gmail.com");
        user.setPassword("user");
        userService.add(user);

        User admin = new User();
        admin.setRoles(Set.of(adminRole));
        admin.setEmail("admin@gmail.com");
        admin.setPassword("admin");
        userService.add(admin);
    }
}
