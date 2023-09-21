package pak1;

public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;
    private int creativity;
    public Ravenclaw(String name, int powerMagic, int lengsTransgress, int smart, int wise, int witty,int creativity) {
        super(name, powerMagic, lengsTransgress);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity=creativity;
    }
    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    @Override
    public String toString() {
        return "Имя и фамилия студента факультета Когтевран "+this.getName()+" С силой магии: "+this.getPowerMagic()+" С дальностью трансгрессии: "+this.getLengsTransgress()+" умом на "+this.getSmart()+" очков, мудростью в "+this.getWise()+" очков, остроумием в "+this.getWitty()+" очков, креативностью в "+this.getCreativity()+" очков";
    }

    @Override
    public String comparisonFeatures(Object a) {
        if (a.getClass() == this.getClass()) {
            Ravenclaw rav = (Ravenclaw) a;
            int c = this.getSmart() + this.getWise() + this.getWitty()+this.getCreativity();
            int b = rav.getSmart() + rav.getWise() + rav.getWitty()+rav.getCreativity();
            if (c >= b) {
                return "По сумме свойств " + this.getName() + " сильнее чем " + rav.getName();
            } else {
                return "По сумме свойств " + rav.getName() + " сильнее чем " + this.getName();
            }
        } else {
            return "сравниваются студены разных факультетов";
        }
    }


}
