package Model;

public class PhuCap {

    private String maPhuCap;
    private float phuCap;

    @Override
    public String toString() {
        return this.maPhuCap + "";
    }

    public String getMaPhuCap() {
        return maPhuCap;
    }

    public void setMaPhuCap(String maPhuCap) {
        this.maPhuCap = maPhuCap;
    }

    public float getPhuCap() {
        return phuCap;
    }

    public void setPhuCap(float phuCap) {
        this.phuCap = phuCap;
    }

}
