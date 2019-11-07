package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/upload")
public class uploadAction {
    @RequestMapping("/u")
    //接收到上传的文件
    public String upload(MultipartFile upload, HttpSession session) throws Exception {
        //获取文件上传文件夹的绝对路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //在目标文件夹下 创建一个与上传文件同名的空文件
        File file = new File(realPath + "/" + upload.getOriginalFilename());
        //把接收到的文件传输到空文件夹中
        upload.transferTo(file);
        return "index";
    }


}
