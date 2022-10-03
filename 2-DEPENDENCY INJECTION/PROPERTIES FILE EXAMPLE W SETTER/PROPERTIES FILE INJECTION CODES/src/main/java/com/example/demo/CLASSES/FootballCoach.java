package com.example.demo.CLASSES;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

    private String coachName;
    private String coachMail;
    private Integer coachAge;

    public FootballCoach() {
        System.out.println("FOOTBALL COACH EMPTY CONSTRUCTOR APPLIED");
    }

    @Override
    public String getDailyWorkout() {
        return "SHOOT THE BALL 10 TIMES!";
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("SETTER INJECTION APPLIED");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public void setCoachMail(String coachMail) {
        this.coachMail = coachMail;
    }

    public void setCoachAge(Integer coachAge) {
        this.coachAge = coachAge;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getCoachMail() {
        return coachMail;
    }

    public Integer getCoachAge() {
        return coachAge;
    }

    @Override
    public String toString(){
        return
                "COACH NAME: "+ getCoachName()
                +"\nCOACH MAIL: "+ getCoachMail()
                +"\nCOACH AGE: "+ getCoachAge();
    }
}
