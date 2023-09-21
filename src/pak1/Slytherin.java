package pak1;

public class Slytherin extends Hogwarts {

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public Slytherin(String name, int powerMagic, int lengsTransgress, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerMagic, lengsTransgress);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя и фамилия студента факультета Слизерин "+this.getName()+" С силой магии: "+this.getPowerMagic()+" С дальностью трансгрессии: "+this.getLengsTransgress()+" хитростью в "+this.getCunning()+" очков, решительностью в "+this.getDetermination()+" очков, амбициями в "+this.getAmbition()+" очков, находчивостью в "+this.getResourcefulness()+" очков и жаждой власти в "+this.getLustForPower()+" очков";
    }

    @Override
    public String comparisonFeatures(Object a) {
        if (a.getClass() == this.getClass()) {
            Slytherin sli = (Slytherin) a;
            int c = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getLustForPower() + this.getResourcefulness();
            int b = sli.getCunning() + sli.getDetermination() + sli.getAmbition() + sli.getLustForPower() + sli.getResourcefulness();
            if (c >= b) {
                return "По сумме свойств " + this.getName() + " сильнее чем " + sli.getName();
            } else {
                return "По сумме свойств " + sli.getName() + " сильнее чем " + this.getName();
            }
        } else {
            return "сравниваются студены разных факультетов";
        }
    }
}
