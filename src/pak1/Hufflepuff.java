package pak1;

public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;
    public Hufflepuff(String name, int powerMagic, int lengsTransgress, int hardworking, int loyal, int honest) {
        super(name, powerMagic, lengsTransgress);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }
    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    @Override
    public String toString() {
        return "Имя и фамилия студента факультета Пуффендуй "+this.getName()+" С силой магии: "+this.getPowerMagic()+" С дальностью трансгрессии: "+this.getLengsTransgress()+" трудолюбием в "+this.getHardworking()+" очков, лояльностью в "+this.getLoyal()+" очков,честный на "+this.getHonest()+" очков";
    }

    @Override
    public String comparisonFeatures(Object a) {
        if (a.getClass() == this.getClass()) {
            Hufflepuff huf = (Hufflepuff) a;
            int c = this.getHardworking() + this.getLoyal() + this.getHonest();
            int b = huf.getHardworking() + huf.getLoyal() + huf.getHonest();
            if (c >= b) {
                return "По сумме свойств " + this.getName() + " сильнее чем " + huf.getName();
            } else {
                return "По сумме свойств " + huf.getName() + " сильнее чем " + this.getName();
            }
        } else {
            return "сравниваются студены разных факультетов";
        }
    }
}
