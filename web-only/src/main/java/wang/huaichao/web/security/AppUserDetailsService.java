package wang.huaichao.web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

/**
 * Created by Administrator on 2015/6/11.
 */
public class AppUserDetailsService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {

        final List<GrantedAuthority> authorities =
                AuthorityUtils.createAuthorityList(
                        "ROLE_USER", "ROLE_ADMIN"
                );

        if ("huaichao".equals(username)) {
            return new org.springframework.security.core.userdetails.User(
                    username,
                    "password",
                    authorities
            );
        }

        return null;
    }
}
