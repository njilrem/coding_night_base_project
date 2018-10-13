package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Request {
    private int id;
    private String text;
    private String status;
    private String replyText;
    private int sessionId;
}
