package bitcamp.java106.pms;

import java.util.Scanner;
import bitcamp.java106.pms.domain.Post;

public class App{
    static Scanner keyScan = new Scanner(System.in);
    static Post[] posts = new Post[200];
    static int boardIndex = 0;
    static String search = null;

    static String[] prompt() {
        System.out.print("order> ");
        return keyScan.nextLine().toLowerCase().split(" ");
    }

    static void onHelp() {
        System.out.println("[ 도움말  ]");
    }

    static void onQuit() {
        System.out.println("bye");
    }

    static void onBoardAdd() {
        System.out.println("[ 게시글 등록 ]");
        Post post = new Post();

        System.out.print("제목? ");
        post.name = keyScan.nextLine();

        System.out.print("내용? ");
        post.content = keyScan.nextLine();

        System.out.print("등록일? ");
        post.registDate = keyScan.nextLine();

        post.count = boardIndex;

        posts[boardIndex++] = post;      
    }

    static void onBoardList() {
        System.out.println("[ 게시글 목록 ]");
        for (int i = 0; i < boardIndex; i++) {
            if(posts[i] == null) 
                continue;
            System.out.printf("%d, %s, %s\n", 
                    posts[i].count, posts[i].name,
                    posts[i].registDate);
        }
    }

    static void onBoardView() {
        System.out.println("[ 게시글 조회 ]"); 
        if(search == null){
            System.out.println("번호를 입력하세요");
            return;
        } 
        Post post = null;
        for(int i = 0; i < boardIndex; i++){
            if(posts[i] == null)
                continue;
            if(search.equals(Integer.toString(posts[i].count))){
                post = posts[i];
                break;
            }
        }
        if (post == null){
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            System.out.printf("제목: %s\n", post.name);
            System.out.printf("내용: %s \n", post.content);
            System.out.printf("등록일: %s \n", post.registDate);
        }
    }

    static void onBoardUpdate() {
        System.out.println("[ 게시글 수정 ]");
        if(search == null){
            System.out.println("번호를 입력하세요");
            return;
        } 
        Post post = null;
        for(int i = 0; i < boardIndex; i++){
            if(posts[i] == null)
                continue;
            if(search.equals(Integer.toString(posts[i].count))){
                post = posts[i];
                break;
            }
        }
        if (post == null){
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            Post uppost = new  Post();

            System.out.printf("제목(%s)? ", post.name);
            post.name = keyScan.nextLine();

            System.out.printf("내용(%s)? ", post.content);
            post.content = keyScan.nextLine();

            uppost.registDate = post.registDate;

            uppost.count = post.count;

            System.out.println();
        }
    }

    static void onBoardDelete() {
        System.out.println("[ 게시글  삭제 ]");
        if(search == null){
            System.out.println("번호를 입력하세요");
            return;
        } 
        Post post = null;
        int i;
        for (i = 0; i < boardIndex; i++) {
            if (posts[i] == null)
                continue;
            if (search.equals(Integer.toString(posts[i].count))){
                post = posts[i];
                break;
            }
        }
        if (post == null) {
            System.out.println("해당 게시물이 존재하지 않습니다.");
        } else {
            System.out.println("정말 삭제하시겠습니까?(y/N)");
            String ans = keyScan.nextLine().toLowerCase();
            System.out.println(post.name);
            if (ans.equals("y")) {
                posts[i] = null;
                System.out.println("삭제 완료"); 
            }
        }
    }

    public static void main(String[] args){

        while(true){
            String[] arr = prompt();

            String order = arr[0];
            if(arr.length == 2){
                search = arr[1];
            }   

            if(order.equals("quit")){
                onQuit();
                break;

            } else if(order.equals("help")) {
                onHelp();

            } else if (order.equals("board/add")) {
                onBoardAdd();

            } else if (order.equals("board/list")) {
                onBoardList();

            } else if (order.equals("board/view")) {
                onBoardView();

            } else if (order.equals("board/update")) {
                onBoardUpdate();

            } else if (order.equals("board/delete")) {
                onBoardDelete();

            } else {
                System.out.println("잘못된 명령어입니다.");

            }
            System.out.println();
        }
    }
}