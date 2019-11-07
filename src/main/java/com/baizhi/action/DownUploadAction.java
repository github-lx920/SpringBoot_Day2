package com.baizhi.action;

import org.apache.commons.io.FileUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping("/downUpload")
public class DownUploadAction {

    @RequestMapping("/du")
    public ResponseEntity<byte[]> du(String filename, HttpSession session) throws Exception {
        //获取目标文件夹的路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //获取目标文件
        File file = new File(realPath + "/" + filename);
        //把目标文件转换为字节数组
        byte[] bytes = FileUtils.readFileToByteArray(file);
        //请求头
        HttpHeaders httpHeaders = new HttpHeaders();
        //避免乱码问题
        String newname = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        //设置下载后的打开方式
        httpHeaders.setContentDispositionFormData("attachment", newname);
        //设置下载时的方式   以二进制流的形式下载
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(bytes, httpHeaders, HttpStatus.CREATED);
    }

    /*@RequestMapping("/du")
    public void du(String filename, HttpServletRequest request, HttpServletResponse response) throws Exception{
        //获取目标文件夹的路径
        String realPath = request.getRealPath("/upload");
        //获取目标文件
        File file = new File(realPath, filename);
        //把文件传入到文件输入流中
        FileInputStream is = new FileInputStream(file);
        //获取文件输出流
        ServletOutputStream outputStream = response.getOutputStream();
        //设置文件下载的请求头    文件以附件形式打开    解决文件乱码的问题
        response.setHeader("content-disposition","attachment;filename="+ URLEncoder.encode(filename,"UTF-8"));
        //把带有文件的输入流中的内容 复制到输出流中
        IOUtils.copy(is,outputStream);
        //关闭资源
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(outputStream);
    }
*/
}
