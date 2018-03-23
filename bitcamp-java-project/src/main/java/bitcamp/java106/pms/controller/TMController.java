package bitcamp.java106.pms.controller;

import java.util.Scanner;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.controller.MemberController;

public class TMController {
    Scanner keyScan;

    //팀과 회원을 넣을 2차원배열 생성
    String [][] teamMember = new String[1000][1000];
    //arrayIndex에 해당되는 값 설정
    int row = 0;
    int column = 0;


    TeamController tc;
    MemberController mc;

    public TMController(Scanner scanner, TeamController teamController,
            MemberController memberController) {
        this.keyScan = scanner;
        this.tc = tc;
        this.mc = mc;

    }



    public  void service (String menu, String option) {
        if(menu.equals("team/member/add")) {
            this.onTeamMemberAdd(option);

        } else if(menu.equals("Team/member/delete")) {
            this.onTeamMemberDelete(option);

        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onTeamMemberAdd(String name) {
        
        Team team = tc.teamDao.get(name);
        System.out.println(tc.teamDao.get(name));
        if (team == null) {
            System.out.println("해당 이름의 팀이 없습니다.");
        } else {
            System.out.println("adfasfd");
        }

    }

    void onTeamMemberDelete(String name) {

    }



}