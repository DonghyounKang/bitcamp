package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Team{
    public String name;
    public String description;
    public int maxQty;
    public Date startDate;
    public Date endDate;
}

//ver13 - 시작일, 종료일 String -> Date로 변경