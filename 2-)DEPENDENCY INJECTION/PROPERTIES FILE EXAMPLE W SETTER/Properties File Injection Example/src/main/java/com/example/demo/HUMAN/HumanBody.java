package com.example.demo.HUMAN;

public class HumanBody implements BODY{
    private ORGAN Brain;
    private ORGAN Hearth;
    private ORGAN Lung;

    private String informationAboutPerson;

    public void setBrain(Brain brain){
        this.Brain = brain;
    }

    public void setHearth(ORGAN hearth) {
        Hearth = hearth;
    }

    public void setLung(ORGAN lung) {
        Lung = lung;
    }

    public void setInformationAboutPerson(String informationAboutPerson) {
        this.informationAboutPerson = informationAboutPerson;
    }

    public ORGAN getBrain() {
        return Brain;
    }

    public ORGAN getHearth() {
        return Hearth;
    }

    public ORGAN getLung() {
        return Lung;
    }

    @Override
    public String getCountsOfOrgans() {
        return
                "BRAIN: "+ getBrain().getCount()
                +"\nHEARTH: "+getHearth().getCount()
                +"\nLUNG: "+ getLung().getCount();
    }

    @Override
    public String getOrgansWithDuties() {
        return
                "BRAIN: "+ getBrain().getDuty()
                +"\nHEARTH: "+getHearth().getDuty()
                +"\nLUNG: "+ getLung().getDuty();
    }

    public String getInformationAboutPerson(){
        return informationAboutPerson;
    }
}
