
package leapmonth;


public class LeapMonth {
    int month;
    int year;
    
    public LeapMonth(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public boolean isLeapMonth() {
        boolean isLeapMonth = (year % 4 == 0);
        isLeapMonth = isLeapMonth && (year % 100 != 0);
        isLeapMonth = isLeapMonth || (year % 400 == 0);
        return isLeapMonth;
    }

    public static void main(String[] args) {
     
        LeapMonth lm = new LeapMonth(2, 2024); 
        if (lm.isLeapMonth()) {
            System.out.println("The month is a leap month.");
        } else {
            System.out.println("The month is not a leap month.");
        }
    }
}
