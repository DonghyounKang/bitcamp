package bitcamp.java106.pms;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.controller.BoardController;
import bitcamp.java106.pms.controller.ClassroomController;
import bitcamp.java106.pms.controller.MemberController;
import bitcamp.java106.pms.controller.TaskController;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.controller.TeamMemberController;
import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TaskDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.dao.TeamMemberDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.util.Console;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    public static String option = null; 
    
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }

    static void onHelp() {
        System.out.println("[도움말]");
        
        System.out.println("----팀 관련 명령 : team----");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("팀 정보 변경 명령 : team/update 팀명");
        System.out.println("팀 정보 삭제명령 : team/delete 팀명");
       
        System.out.println("----회원 관련 명령: member----");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("회원 정보 수정 명령 : member/update 아이디");
        System.out.println("회원 삭제 명령 : member/delete 아이디");
        
        System.out.println("----게시판 관련 명령: board----");
        System.out.println("게시판 등록 명령: board/add");
        System.out.println("게시판 조회 명령: board/list");
        System.out.println("게시판 상세조회 명령: board/view 게시판 번호");
        System.out.println("게시판 정보 변경 명령: board/update 게시판 번호");
        System.out.println("게시판 삭제 명령: board/delete 게시판 번호");
        
        System.out.println("----팀 소속 회원 관련 명령: team/member----");
        System.out.println("팀 멤버 정보 등록 명령: team/member/add");
        System.out.println("팀 맴버 정보 조회 명령: team/member/list");
        System.out.println("팀 멤버 삭제 명령: team/member/delete");
        
        System.out.println("----작업 관련 명령: task----");
        System.out.println("작업 등록 명령: task/add");
        System.out.println("작업 목록 조회 명령: task/list");
        System.out.println("작업 목록 상세조회 명령: task/view");
        System.out.println("작업 수정 명령: task/update");
        System.out.println("작업 목록 삭제 명령: task/delete");
        System.out.println("작업 상태 수정 명령: task/state");
        
        System.out.println("----수업 관련 명령: classroom----");
        System.out.println("수업 등록 명령 : classroom/add");
        System.out.println("수업 목록 명령: classroom/list");
        System.out.println("수업 정보 변경 명령: classroom/update");
        System.out.println("수업 삭제 명령: classroom/delete");
        
        System.out.println("종료 : quit");

    }

    public static void main(String[] args) {
        // 클래스를 사용하기 전에 필수 값을 설정한다.
        
        TeamDao teamDao = new TeamDao();
        MemberDao memberDao = new MemberDao();
        TaskDao taskDao = new TaskDao();
        TeamMemberDao teamMemberDao = new TeamMemberDao();
        
        
        //테스트용 데이터 준비
        prepareMemebrData(memberDao);
        prepareTeamData(teamDao, teamMemberDao);
        
        TeamController teamController = new TeamController(keyScan, teamDao);
        TeamMemberController teamMemberController = new TeamMemberController(
                keyScan, teamDao, memberDao, teamMemberDao);
        MemberController memberController = new MemberController(keyScan, memberDao);
        BoardController boardController = new BoardController(keyScan);
        TaskController taskController = new TaskController(
                keyScan, teamDao, taskDao, teamMemberDao, memberDao);
        ClassroomController classroomController = new ClassroomController(keyScan);
        
        Console.keyScan = keyScan;

        while (true) {
            String[] arr = Console.prompt();

            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            } else {
                option = null;
            }

            if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.equals("help")) {
                onHelp();
            } else if (menu.startsWith("team/member/")) {
                teamMemberController.service(menu, option);
            } else if (menu.startsWith("team/")) {
                teamController.service(menu, option);
            } else if (menu.startsWith("member/")) {
                memberController.service(menu, option);
            } else if (menu.startsWith("board/")) {
                boardController.service(menu, option);
            } else if (menu.startsWith("task/")) {
                taskController.service(menu, option);
            } else if (menu.startsWith("classroom/")) {
                classroomController.service(menu, option);
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }

            System.out.println(); 
        }
    }
    static void prepareMemebrData(MemberDao memberDao) {
        Member member = new Member();
        
        member.setId("aaa");
        member.setEmail("aaa@test.com");
        member.setPassword("1111");
        
        memberDao.insert(member);
        
        member = new Member();
        member.setId("bbb");
        member.setEmail("bbb@test.com");
        member.setPassword("2222");
        
        memberDao.insert(member);
        
        member = new Member();
        member.setId("ccc");
        member.setEmail("ccc@test.com");
        member.setPassword("3333");
        
        memberDao.insert(member);
        
        member = new Member();
        member.setId("ddd");
        member.setEmail("ddd@test.com");
        member.setPassword("2222");
        
        memberDao.insert(member);
        
        member = new Member();
        member.setId("eee");
        member.setEmail("eee@test.com");
        member.setPassword("3333");
        
        memberDao.insert(member);
    }
    
    static void prepareTeamData(TeamDao teamDao, TeamMemberDao teamMemberDao) {
        Team team = new Team();
        team.setName("t1");
        team.setMaxQty(5);
        team.setStartDate(Date.valueOf("2018-1-1"));
        team.setEndDate(Date.valueOf("2018-5-30"));
        teamDao.insert(team);
        teamMemberDao.addMember("t1", "aaa");
        teamMemberDao.addMember("t1", "bbb");
        teamMemberDao.addMember("t1", "ccc");
        
        
        team = new Team();
        team.setName("t2");
        team.setMaxQty(5);
        team.setStartDate(Date.valueOf("2018-2-1"));
        team.setEndDate(Date.valueOf("2018-6-30"));
        teamDao.insert(team);
        teamMemberDao.addMember("t2", "ccc");
        teamMemberDao.addMember("t2", "ddd");
        teamMemberDao.addMember("t2", "eee");
    }
}


// ver 17 - Task 관리기능 추가
// ver 15 - TeamDao와 MemberDao 객체 생성. 
//          팀 멤버를 다루는 메뉴 추가.