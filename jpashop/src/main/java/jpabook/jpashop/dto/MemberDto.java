package jpabook.jpashop.dto;

import jpabook.jpashop.entity.Team;
import lombok.Data;

@Data
public class MemberDto {

    private Long id;
    private String username;
    private Team teamName;

    public MemberDto(Long id, String username, Team team) {
        this.id = id;
        this.username = username;
        this.teamName = team;
    }
}
