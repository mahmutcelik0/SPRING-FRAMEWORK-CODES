package com.example.demo.CoachClasses;

public class FootBallCoach implements Coach{

    private MEAL meal;

    public FootBallCoach(MEAL meal) {
        this.meal = meal;
    }
    @Override
    public String getDailyWorkOut() {
        return "YOU HAVE TO SHOOT BALL LEAST 10 TIMES";
    }

    @Override
    public String getNutritionSchedule() {
        return meal.getNutritionSchedule();
    }
}
