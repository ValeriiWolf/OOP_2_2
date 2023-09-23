package pak1;

public abstract class Hogwarts {
    private String name;
    private int powerMagic;
    private int lengsTransgress;

    public Hogwarts(String name, int powerMagic, int lengsTransgress) {
        this.name = name;
        this.powerMagic = powerMagic;
        this.lengsTransgress = lengsTransgress;
    }

    public int getPowerMagic() {
        return powerMagic;
    }

    public int getLengsTransgress() {
        return lengsTransgress;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();
    public final String comparisonPower(Hogwarts obj){
        int sumComparison1=this.getPowerMagic()+this.getLengsTransgress();
        int sumComparison2=obj.getLengsTransgress()+obj.getPowerMagic();
        if(sumComparison1>=sumComparison2){
            return "По сумме свойств "+this.getName()+" сильнее чем "+obj.getName();
        }
        else {
            return "По сумме свойств "+obj.getName()+" сильнее чем "+this.getName();
        }
    }
    public abstract String comparisonFeatures(Object a);
}
