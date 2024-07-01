package ch15.sec02.exam01;

import lombok.*;

@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//Getter, Setter, toString, 기본 생성자, Hashcode, equals가 포함되어있다 
@Data
public class Board {
    private String subject;
    private String content;
    private String writer;
//    AllArgsConstructor 가 있으므로 없어야 함
//    public Board(String subject, String content, String writer) {
//        this.subject = subject;
//        this.content = content;
//        this.writer = writer;
//    }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
    public String getWriter() { return writer; }
    public void setWriter(String writer) { this.writer = writer; }
}
