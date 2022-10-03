package com.example.demo.CoachClasses;

public class BaseBallCoach implements Coach{
    private MEAL meal;

    public BaseBallCoach(MEAL meal) {
        this.meal = meal;
    }
    @Override
    public String getDailyWorkOut() {
        return "YOU HAVE TO THROW BALL LEAST 30 TIMES";
    }

    @Override
    public String getNutritionSchedule() {
        return meal.getNutritionSchedule();
    }
}
