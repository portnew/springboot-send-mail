package com.zhang.service;

/**
 * @ClassName Mailservice
 * @Description TODO
 * @Author zhy
 * @Date 2020/3/25 8:23
 */
public interface Mailservice {
    /**
     * 发送文本邮件
     * @param to
     * @param subject
     * @param content
     */
    void sendSimpleMail(String to,String subject,String content);

    /**
     * 发送html邮件
     * @param to
     * @param subject
     * @param content
     */
    void sendHtmlMail(String to,String subject,String content);

    /**
     * 发送带附件的邮件
     * @param to
     * @param subject
     * @param filePath
     */
    void sendAttachmentMail(String to,String subject,String content,String filePath);
}
