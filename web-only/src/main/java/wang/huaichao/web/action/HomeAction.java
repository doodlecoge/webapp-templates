package wang.huaichao.web.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        return "index";
    }
}
