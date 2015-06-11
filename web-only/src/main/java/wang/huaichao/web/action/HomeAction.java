package wang.huaichao.web.action;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import wang.huaichao.web.AppCtxHolder;

import java.util.Calendar;

/**
 * Created by Administrator on 2015/6/10.
 */
@Controller
public class HomeAction {
    @RequestMapping("/")
    public String index(ModelMap map) {
        map.put("who", "huaichao");
        map.put("timestamp", Calendar.getInstance().getTimeInMillis());
        final String siteTitle = AppCtxHolder.getApplicationContext().getMessage(
                "site.title", null, LocaleContextHolder.getLocale()
        );
        map.put("siteTitle", siteTitle);
        return "index";
    }

    @RequestMapping("/login_page")
    public String login() {
        return "login";
    }

    @RequestMapping("/profile")
    public String needLogin(ModelMap map) {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication auth = context.getAuthentication();
        String username = ((UserDetails) auth.getPrincipal()).getUsername();
        map.put("username", username);
        return "profile";
    }
}
