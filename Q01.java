//import java.text.SimpleDateFormat;
import java.util.*;

class Member {
    private int MemberID;
    private String LastName;
    private String FirstName;
    private int Handicap;
    private char Gender;
    private String Team;
    private String MemberType;
    private int Coach;
    private long Phone;
    private Date JoinDate;

    // Constructor
    public Member(int memberID, String lastName, String firstName, int handicap, char gender, String team, String memberType, int coach, long phone, Date joinDate) {
        this.MemberID = memberID;
        this.LastName = lastName;
        this.FirstName = firstName;
        this.Handicap = handicap;
        this.Gender = gender;
        this.Team = team;
        this.MemberType = memberType;
        this.Coach = coach;
        this.Phone = phone;
        this.JoinDate = joinDate;
    }
    public boolean isJoinDateBefore(Date otherDate) {
        if (this.JoinDate.getYear() < otherDate.getYear()) {
            return true;
        } else if (this.JoinDate.getYear() == otherDate.getYear()) {
            if (this.JoinDate.getMonth().compareTo(otherDate.getMonth()) < 0) {
                return true;
            } else if (this.JoinDate.getMonth().equals(otherDate.getMonth())) {
                if (this.JoinDate.getDay() < otherDate.getDay()) {
                    return true;
                }
            }
        }
        return false;
    }
    // Getter methods (if needed)
    public Date getJoinDate() {
        return this.JoinDate;
    }
    public String getMemberType() {
        return this.MemberType;
    }

    public int getHandicap() {
        return this.Handicap;
    }
    public char getGender() {
        return Gender;
    }
    public String getTeam() {
        return Team;
    }

    
 // Method to display member details in a tabular manner
    public void display() {
        
        System.out.printf("| %-10d | %-12s | %-11s | %-8d | %-6c | %-6s | %-11s | %-5d | %-12d | %02d %s %d |\n", 
                            this.MemberID, this.LastName, this.FirstName, this.Handicap, this.Gender, 
                            this.Team, this.MemberType, this.Coach, this.Phone, 
                            this.JoinDate.getDay(), this.JoinDate.getMonth(), this.JoinDate.getYear());
//        System.out.print("|------------|--------------|-------------|----------|--------|--------|-------------|-------|--------------|--------------|");
    }

}


//for task 1


class Date {
    private int day;
    private String month;
    private int year;

    // Constructor
    public Date(int day, String month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public int getDay() {
        return this.day;
    }

    public String getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }
    

    @Override
    public String toString() {
        return String.format("%02d %s %d", day, month, year);
    }
}




public class Q01 {
    public static void main(String[] args) {
       
        Date joinDate1 = new Date(28, " May ", 2005);
        Date joinDate2 = new Date(31, " May ", 2009);
        Date joinDate3 = new Date(12, " Aug ", 2006);
        Date joinDate4 = new Date(06, " Dec ", 2011);
        Date joinDate5 = new Date(24, " Jan ", 2010);
        Date joinDate6 = new Date(9, " Jul ", 2013);
        Date joinDate7 = new Date(05, " Mar ", 2008);
        Date joinDate8 = new Date(22, " Jun ", 2006);
        Date joinDate9 = new Date(29, " Jul ", 2013);
        Date joinDate10 = new Date(13, " Aug ", 2013);
        Date joinDate11 = new Date(28, " Jul ", 2008);
        Date joinDate12 = new Date(18, " May ", 2009);
        Date joinDate13 = new Date(07, " Apr ", 2009);
        Date joinDate14 = new Date(23, " Mar ", 2007);
        Date joinDate15 = new Date(17, " Apr ", 2009);
        Date joinDate16 = new Date(30, " May ", 2007);
        Date joinDate17 = new Date(27, " Nov ", 2007);
        Date joinDate18 = new Date(05, " Aug ", 2005);
        Date joinDate19 = new Date(14, " Jan ", 2011);
        Date joinDate20 = new Date(07, " Oct ", 2010);

        
        Member[] members = new Member[20];
        members[0] = new Member(118, "McKenzie", "Melissa", 30, 'F', " ", "junior", 153, 963270, joinDate1);
        members[1] = new Member(138, "Stone", "Michael", 30, 'M', " ", "senior", 0, 983223, joinDate2);
        members[2] = new Member(153, "Nolan", "Brenda", 11, 'F', "Team B", "senior", 0, 442649, joinDate3);
        members[3] = new Member(176, "Branch", "Helen", 0, 'F', " ", "social", 0, 589419, joinDate4);
        members[4] = new Member(178, "Beck", "Sarah", 0, 'F', " ", "social", 0, 226596, joinDate5);
        members[5] = new Member(228, "Burton", "Sandra", 26, 'F', " ", "junior", 153, 244493, joinDate6);
        members[6] = new Member(235, "Cooper", "William", 14, 'M', "Team B", "senior", 153, 722954, joinDate7);
        members[7] = new Member(239, "Spence", "Thomas", 10, 'M', " ", "senior", 0, 697720, joinDate8);
        members[8] = new Member(258, "Olson", "Barbara", 16, 'F', " ", "senior", 0, 370186, joinDate9);
        members[9] = new Member(286, "Pollard", "Robert", 19, 'M', "Team B", "junior", 235, 617681, joinDate10);
        members[10] = new Member(290, "Sexton", "Thomas", 26, 'M', " ", "senior", 235, 268936, joinDate11);
        members[11] = new Member(323, "Wilcox", "Daniel", 3, 'M', "Team A", "senior", 0, 665393, joinDate12);
        members[12] = new Member(331, "Schmidt", "Thomas", 25, 'M', " ", "senior", 153, 867492, joinDate13);
        members[13] = new Member(332, "Bridges", "Deborah", 12, 'F', " ", "senior", 235, 279087, joinDate14);
        members[14] = new Member(339, "Young", "Betty", 21, 'F', "Team B", "senior", 0, 507813, joinDate15);
        members[15] = new Member(414, "Gilmore", "Jane", 5, 'F', "Team A", "junior", 153, 459558, joinDate16);
        members[16] = new Member(415, "Taylor", "William", 7, 'M', "Team A", "senior", 235, 137353, joinDate17);
        members[17] = new Member(461, "Reed", "Robert", 3, 'M', "Team A", "senior", 235, 994664, joinDate18);
        members[18] = new Member(469, "Willis", "Carylon", 29, 'F', " ", "junior", 0, 688378, joinDate19);
        members[19] = new Member(487, "Kent", "Susan", 0, 'F', " ", "social", 0, 707217, joinDate20);
        

        
        System.out.println("+------------+--------------+-------------+----------+--------+--------+-------------+-------+--------------+--------------+");
        System.out.println("| Member ID  | Last Name    | First Name  | Handicap | Gender | Team   | Member Type | Coach | Phone        | Join Date    |");
        System.out.println("+------------+--------------+-------------+----------+--------+--------+-------------+-------+--------------+--------------+");
        for (Member member : members) {
            member.display();
            System.out.println();             
        }
        
     // Task 1
     // Display details of members whose join date is earlier than 07-Apr-09
        System.out.println("Task1");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
        System.out.println("| Member ID  | Last Name    | First Name  | Handicap | Gender |   Team   | Member Type | Coach |    Phone     |       Join Date       |");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
//        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        Date apr07_09 = new Date(07, " Apr ", 2009);
        
        for (Member member : members) {
            if (member.isJoinDateBefore(apr07_09)) {
                member.display();
            }
        }
        
     // Display details of senior members whose handicap score is less than 12
        System.out.println("task 2");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
        System.out.println("| Member ID  | Last Name    | First Name  | Handicap | Gender |   Team   | Member Type | Coach |    Phone     |       Join Date       |");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
        for (Member member : members) {
            if (member.getMemberType().equals("senior") && member.getHandicap() < 12) {
                member.display();
            }
        }
        
     // Display details of female senior members who are part of TeamB
        System.out.println("task3");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
        System.out.println("| Member ID  | Last Name    | First Name  | Handicap | Gender |   Team   | Member Type | Coach |    Phone     |       Join Date       |");
        System.out.println("+------------+--------------+-------------+----------+--------+----------+-------------+-------+--------------+-----------------------+");
        for (Member member : members){
            if (member.getGender() == 'F' && member.getMemberType().equals("senior") && member.getTeam().equals("Team B")) {
                member.display();
            }
        }
        

        
        
    }
}