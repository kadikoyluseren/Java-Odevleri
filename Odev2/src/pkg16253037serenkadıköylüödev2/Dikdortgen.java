package pkg16253037serenkadıköylüödev2;

public class Dikdortgen 
{
    private int en;
    private int boy;
    private int x;
    private int y;

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Dikdortgen(int en, int boy, int x, int y) {
        this.en = en;
        this.boy = boy;
        this.x = x;
        this.y = y;
    }
    
    public String gez(int xx,int yy){
        return "("+(x+xx)+","+(y+yy)+")";
    }
    
    public int alan(){
        return en*boy;
    }
    
    public int cevre(){
        return 2*(en+boy);
    }
}

