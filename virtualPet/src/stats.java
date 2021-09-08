public class stats {
    int Hunger = 50;
    int Tiredness = 50;
    double Health = (Tiredness * 0.5) + Hunger * 0.5;

    public double health(){
        this.Health =50;
        return Health;
    }
    public int tiredness(){
        this.Tiredness = 50;
        return Tiredness;
    }
    public int hunger(){
        int hunger = 15;
        this.Hunger = 50;
        return Hunger;
    }

    public int addHunger(){
        Hunger -= 25;
        return Hunger;
    }

    public int addTiredness(){
        Tiredness -= 25;
        return Tiredness;

    }

    public int negateHunger(){
        Hunger = 50;
        return Hunger;

    }

    public int negateTiredness(){
        Tiredness = 50;
        return Tiredness;
    }




    public void SetHealth(double Health){this.Health = Health;}
    public void SetTiredness(int Tiredness){this.Tiredness = Tiredness;}
    public void SetHunger(int Hunger){this.Hunger = Hunger;}

    public int getHealth(){return (int) this.Health;}
    public int getTiredness(){return this.Tiredness;}
    public int getHunger(){return this.Hunger;}
}
