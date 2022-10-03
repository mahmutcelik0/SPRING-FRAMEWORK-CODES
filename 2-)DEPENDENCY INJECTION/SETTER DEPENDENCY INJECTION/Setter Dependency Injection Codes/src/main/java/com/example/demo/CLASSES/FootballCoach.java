package com.example.demo.CLASSES;

public class FootballCoach implements Coach{

    private FortuneService fortuneService;

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
}
