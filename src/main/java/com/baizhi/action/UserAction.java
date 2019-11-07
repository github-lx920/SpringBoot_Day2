package com.baizhi.action;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserAction {
    @Autowired
    private UserService userService;

    @RequestMapping("/show")
    @ResponseBody
    public Map<String, Object> show(Integer page, Integer rows) throws Exception {
        //创建map对象
        Map<String, Object> maps = new HashMap<String, Object>();
        List<User> users = userService.selectAll(page, rows);
        //获取总数据
        Integer totalcount = userService.totalcount();
        //计算总页数
        Integer pageCount;
        if (totalcount % rows == 0) {
            pageCount = totalcount / rows;
        } else {
            pageCount = totalcount / rows + 1;
        }
        //设置总页数
        maps.put("total", pageCount);
        //设置总数据
        maps.put("records", totalcount);
        //当前页号
        maps.put("page", page);
        //当前页的数据
        maps.put("rows", users);

        return maps;
    }

    //增删改
    @RequestMapping("/edit")
    @ResponseBody
    public void edit(String oper, User user) throws Exception {
        if ("add".equals(oper)) {
            //调用添加
            userService.insert(user);
        } else if ("edit".equals(oper)) {
            //调用修改
            userService.update(user);
        } else if ("del".equals(oper)) {
            //调用删除
            userService.delete(user.getId());
        }
    }


}
