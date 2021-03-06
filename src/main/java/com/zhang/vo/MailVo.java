package com.zhang.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;

/**
 * @ClassName MailVo
 * @Description TODO
 * @Author zhy
 * @Date 2020/3/24 20:53
 */

@Data
public class MailVo {
    private String id;//邮件id
    private String from;//邮件发送人
    private String to;//邮件接收人（多个邮箱则用逗号","隔开）
    private String subject;//邮件主题
    private String text;//邮件内容
    private Date sentDate;//发送时间
    private String cc;//抄送（多个邮箱则用逗号","隔开）
    private String bcc;//密送（多个邮箱则用逗号","隔开）
    private String status;//状态
    private String error;//报错信息

    private String filePath;//本地上传的文件路径
    @JsonIgnore
    private MultipartFile[] multipartFiles;//邮件附件 接收从前台传入


    //省略GET&SET方法
}
