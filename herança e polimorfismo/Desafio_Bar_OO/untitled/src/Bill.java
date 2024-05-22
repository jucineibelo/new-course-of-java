public class Bill {
    private char gender;
    private int beer;
    private int berbecue;
    private int softDrink;

    public Bill() {
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getBeer() {
        return beer;
    }

    public void setBeer(int beer) {
        this.beer = beer;
    }

    public int getBerbecue() {
        return berbecue;
    }

    public void setBerbecue(int berbecue) {
        this.berbecue = berbecue;
    }

    public int getSoftDrink() {
        return softDrink;
    }

    public void setSoftDrink(int softDrink) {
        this.softDrink = softDrink;
    }

    public double cover() {
        if (total() <= 30) {
            return 4;
        } else {
            return 0;
        }
    }

    public double feeding() {
        double consumo = 0;
        return consumo = (beer * 5) + (berbecue * 7) + (softDrink * 3);
    }

    //ticked = ingresso
    public double ticked() {
        if (gender == 'F') {
            return 8;
        } else {
            return 10;
        }

    }

    public double total() {
        double total = (beer * 5) + (berbecue * 7) + (softDrink * 3);

        if (gender == 'F' && total >= 30) {
            return total + 8;
        } else if (gender == 'F' && total < 30) {
            return total + 8 + 4;
        } else if ((gender == 'M' && total >= 30)) {
            return total + 10;
        } else {
            return total + 10 + 4;
        }
    }

}
