package model;

public class User {
    int yosh;
    String name;
    Double qiymat;

    public User(int yosh, String name, Double qiymat) {
        this.yosh = yosh;
        this.name = name;
        this.qiymat = qiymat;
    }

    public int getYosh() {
        return yosh;
    }

    public void setYosh(int yosh) {
        this.yosh = yosh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getQiymat() {
        return qiymat;
    }

    public void setQiymat(Double qiymat) {
        this.qiymat = qiymat;
    }

    @Override
    public String toString() {
        return "User{" +
                "yosh=" + yosh +
                ", name='" + name + '\'' +
                ", qiymat=" + qiymat +
                '}';
    }
}
