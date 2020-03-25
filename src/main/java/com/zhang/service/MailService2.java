package com.zhang.service;

import com.zhang.vo.MailVo;

/**
 * @ClassName MailService2
 * @Description TODO
 * @Author zhy
 * @Date 2020/3/25 11:42
 */
public interface MailService2 {
    //发送邮件
    MailVo sendMail(MailVo mailVo);

    //发送Mime邮件
    void sendMimeMail(MailVo mailVo);

    //检查邮件
    void checkMail(MailVo mailVo);

    //保存到数据库
    MailVo saveMail(MailVo mailVo);

}
