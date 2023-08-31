package ReviewPbo;

class Peminjam{
    protected String name , address;

    public Peminjam(){

    }
    public Peminjam(String name , String address){
        this.name = name;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return  name;
    }
}
