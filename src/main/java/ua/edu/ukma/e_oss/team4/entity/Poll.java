package ua.edu.ukma.e_oss.team4.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Poll {
    private int id;
    private int year;
    private  int userId;
    private int isHead;
}
