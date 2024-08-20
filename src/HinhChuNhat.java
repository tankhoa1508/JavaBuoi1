public class HinhChuNhat {
    public float dai;
    public float rong;
    public float ChuVi(){
        return (this.dai+this.rong)*2;
    }

    public float DienTich(){
        return this.dai*this.rong;
    }

    public HinhChuNhat(float d, float r){
        this.dai = d;
        this.rong= r;
    }
}
