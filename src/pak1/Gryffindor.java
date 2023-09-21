package pak1;

public class Gryffindor extends Hogwarts {

    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerMagic, int lengsTransgress, int nobility, int honor, int bravery) {
        super(name, powerMagic, lengsTransgress);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "Имя и фамилия студента факультета Грифендор "+this.getName()+" С силой магии: "+this.getPowerMagic()+" С дальностью трансгрессии: "+this.getLengsTransgress()+" благородство в "+this.getNobility()+" очков, честь в "+this.getHonor()+" очков, храбрость в "+this.getBravery()+" очков";
    }

    @Override
    public String comparisonFeatures(Object a) {
        if (a.getClass() == this.getClass()) {
            Gryffindor gri = (Gryffindor) a;
            int c = this.getBravery() + this.getHonor() + this.getNobility();
            int b = gri.getBravery() + gri.getHonor() + gri.getNobility();
            if (c >= b) {
                return "По сумме свойств " + this.getName() + " сильнее чем " + gri.getName();
            } else {
                return "По сумме свойств " + gri.getName() + " сильнее чем " + this.getName();
            }
        } else {
            return "сравниваются студены разных факультетов";
        }
    }
}
